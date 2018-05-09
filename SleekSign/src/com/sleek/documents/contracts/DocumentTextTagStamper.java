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
    void Execute(DocumentTextTagStampingCommand command);
}
