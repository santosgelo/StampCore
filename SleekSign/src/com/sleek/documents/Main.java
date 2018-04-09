package com.sleek.documents;

import com.sleek.documents.file_management.PdfStamper;
import com.sleek.documents.models.DocumentStampingCommand;
import com.sleek.documents.models.DocumentStamp;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static DocumentStampingCommand BuildTestCommand() {
        DocumentStampingCommand output = new DocumentStampingCommand();

        output.sourcePath = "D:\\test-folder\\input.pdf";
        output.outputPath = "D:\\test-folder\\output.pdf";

        ArrayList<DocumentStamp> stamps = output.getStamps();

        stamps.add(BuildStamp1());
        stamps.add(BuildStamp2());

        return output;
    }

    private static DocumentStamp BuildStamp1() {
        DocumentStamp stamp = new DocumentStamp();

        stamp.setSourcePath("D:\\test-folder\\test.png");
        //stamp.setStampAllPages(true);
        stamp.setPageNumbers(new int[] { 1, 2 });
        stamp.setHeight(96);
        stamp.setWidth(96);
        stamp.setVerticalPosition(400);
        stamp.setHorizontalPosition(48);

        return stamp;
    }

    private static DocumentStamp BuildStamp2() {
        DocumentStamp stamp = new DocumentStamp();

        stamp.setSourcePath("D:\\test-folder\\sleek stamp.png");
        //stamp.setStampAllPages(true);
        stamp.setPageNumbers(new int[] { 1 });
        stamp.setHeight(96);
        stamp.setWidth(96);
        stamp.setVerticalPosition(400);
        stamp.setHorizontalPosition(200);

        return stamp;
    }

    public static void main(String[] args) throws IOException {
        DocumentStampingCommand request = BuildTestCommand();
        PdfStamper signerTool = new PdfStamper();

        signerTool.execute(request);
    }
}
