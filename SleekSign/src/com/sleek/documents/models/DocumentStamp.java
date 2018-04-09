package com.sleek.documents.models;

/**
 * Class that represents a document stamp.
 *
 * @author Allan Chua
 * @version 1.0
 * @since April 08, 2018
 */
public class DocumentStamp {

    //region Fields
    /**
     * The source path of the document stamp.
     */
    private String sourcePath;

    /**
     * The horizontal position of the stamp
     * on the output document.
     */
    private float horizontalPosition;

    /**
     * The vertical position of the stamp
     * on the output document.
     */
    private float verticalPosition;

    /**
     * The height of the stamp when engraved
     * on the document.
     */
    private float height;

    /**
     * The width of the stamp when engraved
     * on the document.
     */
    private float width;

    /**
     * The page numbers where the document stamp
     * would be applied.
     */
    private int[] pageNumbers;

    /**
     * Flag that indicates whether all pages
     * would be stamped.
     */
    private boolean stampAllPages;
    //endregion

    //region Constructor
    public DocumentStamp() {
    }
    //endregion Constructors

    //region Getters/Setters
    /**
     * Method used for getting the source path.
     */
    public  String getSourcePath() {
        return sourcePath;
    }

    /**
     * Method used for setting the source path.
     */
    public void setSourcePath(String value) {
        this.sourcePath = value;
    }

    /**
     * Method used for getting the horizontal
     * position of the stamp on the output
     * document.
     */
    public float getHorizontalPosition() {
        return horizontalPosition;
    }

    /**
     * Method used for setting the horizontal
     * position of the stamp on the output
     * document.
     */
    public void setHorizontalPosition(float value) {
        horizontalPosition = value;
    }

    /**
     * Method used for getting the vertical position
     * of the stamp on the output document.
     */
    public float getVerticalPosition() {
        return verticalPosition;
    }

    /**
     * Method used for setting the vertical position
     * of the stamp on the output document.
     */
    public void setVerticalPosition(float value) {
        verticalPosition = value;
    }

    /**
     * Method used for getting the height of the
     * stamp when engraved on the document.
     */
    public float getHeight()  {
        return height;
    }

    /**
     * Method used for setting the height of the
     * stamp when engraved on the document.
     */
    public void setHeight(float value) {
        height = value;
    }

    /**
     * Method used for getting the width of
     * the stamp when engraved on the document.
     */
    public float getWidth() {
        return width;
    }

    /**
     * Method used for setting the width of
     * the stamp when engraved on the document.
     */
    public void setWidth(float value) {
        width = value;
    }

    /**
     * Method used for getting the page numbers
     * where the document stamp would be applied.
     */
    public int[] getPageNumbers() {
        return pageNumbers;
    }

    /**
     * Method used for setting the page numbers
     * where the document stamp would be applied.
     */
    public void setPageNumbers(int[] value) {
        pageNumbers = value;
    }

    /**
     * Method used for getting the flag that
     * indicates whether all pages would be
     * stamped.
     */
    public boolean getStampAllPages() {
        return this.stampAllPages;
    }

    /**
     * Method used for setting the flag that
     * indicates whether all pages would be
     * stamped.
     */
    public void setStampAllPages(boolean value) {
        stampAllPages = value;
    }
    //endregion

    //region Public Methods
    public String toString() {
        return this.sourcePath;
    }
    //endregion
}
