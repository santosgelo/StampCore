package com.sleek.documents.contracts;

import com.sleek.documents.models.DocumentStampingCommand;

/**
 * Interface that mandates implementation of document
 * signing methods.
 *
 * @author Allan Chua
 * @version 1.0
 * @since April 08, 2018
 */
public interface DocumentStamper {
    /**
     * Method used for signing a document.
     *
     * @param request The command object that contains
     *                information about the document
     *                signing process.
     */
    void execute(DocumentStampingCommand request);
}
