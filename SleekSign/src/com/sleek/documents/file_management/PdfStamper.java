package com.sleek.documents.file_management;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.PdfException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.sleek.documents.contracts.DocumentStamper;
import com.sleek.documents.models.DocumentStampingCommand;
import com.sleek.documents.models.DocumentStamp;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

/**
 * Class that stamps PDF documents with image watermarks.
 *
 * @author Allan Chua
 * @version 1.0
 * @since April 08, 2018
 */
public class PdfStamper implements DocumentStamper {
    //region Private Methods
    private int[] buildPageList(int pageCount) {
        int[] list = new int[pageCount];

        for(int i = 1; i <= pageCount; i++) {
            list[i - 1] = i;
        }

        return list;
    }

    private void generateFileFolder(String path) {
        File file = new File(path);
        file.getParentFile().mkdirs();
    }

    private Document getDocument(String srcPath, String dstPath) throws IOException {
        PdfReader reader = new PdfReader(srcPath);
        PdfWriter writer = new PdfWriter(dstPath);
        PdfDocument pdf = new PdfDocument(reader, writer);
        Document doc = new Document(pdf);

        return doc;
    }

    private void addStamp(Document doc, DocumentStamp stamp) throws MalformedURLException {
        int pageCount = doc.getPdfDocument()
                           .getNumberOfPages();
        int[] pages = stamp.getStampAllPages() ? buildPageList(pageCount) : stamp.getPageNumbers();

        for(int i = 0, len = pages.length; i < len; i++) {
            Image stampImage = new Image(ImageDataFactory.create(stamp.getSourcePath()));
            float height =  stamp.getHeight();
            float width = stamp.getWidth();

            stampImage.setHeight(height > 0 ? height : stampImage.getImageHeight());
            stampImage.setWidth(width> 0 ? width : stampImage.getImageWidth());
            stampImage.setFixedPosition(pages[i], stamp.getHorizontalPosition(), stamp.getVerticalPosition());
            stampImage.setOpacity(.50f);

            doc.add(stampImage);
        }
    }
    //endregion

    /**
     * Method used for signing a PDF document.
     *
     * @param request The command object that contains
     *                information about the PDF signing
     *                process.
     */
    @Override
    public void execute(DocumentStampingCommand request) {
        try {
            generateFileFolder(request.getOutputPath());
            Document outputPdf = getDocument(request.getSourcePath(), request.getOutputPath());

            ArrayList<DocumentStamp> stamps = request.getStamps();

            for(int i = 0, len = stamps.size(); i < len; i++) {
                addStamp(outputPdf, stamps.get(i));
            }

            outputPdf.close();
        } catch (PdfException pdfEx) {
            System.console().writer().print(pdfEx.getMessage());
        } catch (IOException ex) {
            System.console().writer().print(ex.getMessage());
        }
    }
}
