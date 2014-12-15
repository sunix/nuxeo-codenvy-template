package org.nuxeo.sample;

import org.nuxeo.ecm.automation.core.Constants;
import org.nuxeo.ecm.automation.core.annotations.Context;
import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;
import org.nuxeo.ecm.automation.core.collectors.DocumentModelCollector;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;

@Operation(id = SampleOperation.ID, category = Constants.CAT_DOCUMENT,
        label = "SampleOperation", description = "Sample Operation")
public class SampleOperation {

    public static final String ID = "SampleOperation";

    @Context
    CoreSession session;

    @OperationMethod(collector = DocumentModelCollector.class)
    public DocumentModel run(DocumentModel input) {
        /**
         * Here you can edit the code and follow documentation http://doc.nuxeo.com/x/mQAz.
         * Example (to update the document input title):
         *
         * input.setProperty("dublincore","title","New Title");
         * session.saveDocument(input);
         */
        return input;
    }

}
