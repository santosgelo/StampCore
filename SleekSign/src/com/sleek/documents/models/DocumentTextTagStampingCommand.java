package com.sleek.documents.models;

/**
 * Class that represents a command for stamping
 * text tags inside a document file.
 *
 * @author Allan Chua
 * @version 1.0
 * @since May 09, 2018
 */
public class DocumentTextTagStampingCommand {
    //region Fields
    /**
     * Property that identifies the source path
     * of the document that will be processed.
     */
    private String sourcePath;

    /**
     * Property that identifies the path where the
     * processed document will be stored.
     */
    private String outputPath;
    //endregion

    //region Constructors
    private DocumentTextTagStampingCommand()
    {

    }
    //endregion

    //region Getters/Setters
    /**
     * Method used for getting the source path
     * of the document that will be processed.
     */
    public String getSourcePath() {
        return sourcePath;
    }

    /**
     * Method used for setting source path
     * of the document that will be processed.
     */
    public void setSourcePath(String value) {
        this.sourcePath = value;
    }

    /**
     * Method used for getting path where the
     * processed document will be stored.
     */
    public String getOutputPath() {
        return outputPath;
    }

    /**
     * Method used for setting the path where the
     * processed document will be stored.
     */
    public void setOutputPath(String value) {
        this.outputPath = value;
    }
    //endregion
}
