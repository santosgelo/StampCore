package com.sleek.documents.models;

import java.util.ArrayList;

/**
 * Class that represents a command for signing command.
 *
 * @author Allan Chua
 * @version 1.0
 * @since April 08, 2018
 */
public class DocumentStampingCommand {

    //region Fields
    /**
     * Property that identifies the source path of the
     * document to be watermarked.
     */
    private String sourcePath;

    /**
     * Property that identifies the path where the
     * watermarked document would be saved.
     */
    private String outputPath;

    /**
     * List of document stamps that would be engraved
     * on the specified document.
     */
    private ArrayList<DocumentStamp> stamps;
    //endregion

    //region Constructors
    private DocumentStampingCommand() {
        this.stamps = new ArrayList<DocumentStamp>();
    }
    //endregion

    //region Getters/Setters

    /**
     * Method used for getting the source path
     * of the document to be watermarked.
     */
    public String getSourcePath() {
        return sourcePath;
    }

    /**
     * Method used for setting the source path
     * of the document to be watermarked.
     */
    public void setSourcePath(String value) {
        this.sourcePath = value;
    }

    /**
     * Method used for getting the path where the
     * watermarked document would be saved.
     */
    public String getOutputPath() {
        return outputPath;
    }

    /**
     * Method used for setting the path where the
     * watermarked document would be saved.
     */
    public void setOutputPath(String value) {
        this.outputPath = value;
    }

    /**
     * Method used for getting the list of document
     * stamps that would be engraved on the specified
     * document.
     */
    public ArrayList<DocumentStamp> getStamps() {
        return stamps;
    }

    /**
     * Method used for setting the list of document
     * stamps that would be engraved on the specified
     * document.
     */
    public void setStamps(ArrayList<DocumentStamp> value) {
        stamps = value;
    }
    //endregion

    //region Public Methods
    public String toString() {
        return this.outputPath;
    }
    //endregion
}
