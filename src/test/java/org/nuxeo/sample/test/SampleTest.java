package org.nuxeo.sample.test;

import com.google.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.ecm.automation.client.Session;
import org.nuxeo.ecm.automation.client.model.Documents;
import org.nuxeo.ecm.automation.test.RestFeature;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;
import org.nuxeo.runtime.test.runner.Jetty;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * This test deplos Nuxeo in a Jetty instance avaiable on port 18080. You can
 * test it easily using the automation client.
 */
@RunWith(FeaturesRunner.class)
@Features(RestFeature.class)
@Jetty(port = 18080)
public class SampleTest {

    @Inject
    // inject an AutomationClient Session
            Session session;

    @Test
    public void testBookDoc() throws Exception {
        Object result = session.newRequest("Document.Query").set("query",
                "select * From Document").execute();
        assertNotNull(result);
        assertTrue(result.getClass().isAssignableFrom(Documents.class));
    }
}