package com.sleek.documents.contracts;

import com.sleek.documents.models.DocumentTextTagStampingCommand;

/**
 * Interface that mandates implementation of document
 * text tag stamping methods.
 *
 * @author Allan Chua
 * @version 1.0
 * @since May 09, 2018
 */
public interface DocumentTextTagStamper {
    /**
     * Method used for replacing all text-based tags
     * with the provided values.
     * 
     * @param command
     */
    void Execute(DocumentTextTagStampingCommand command);
}