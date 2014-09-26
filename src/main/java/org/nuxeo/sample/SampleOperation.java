package org.nuxeo.sample;

import org.nuxeo.ecm.automation.core.Constants;
import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;
import org.nuxeo.ecm.automation.core.collectors.DocumentModelCollector;
import org.nuxeo.ecm.core.api.DocumentModel;

@Operation(id = SampleOperation.ID, category = Constants.CAT_DOCUMENT,
        label = "SampleOperation", description = "")
public class SampleOperation {

    public static final String ID = "SampleOperation";

    @OperationMethod(collector = DocumentModelCollector.class)
    public DocumentModel run(DocumentModel input) {
        return null;
    }

}
