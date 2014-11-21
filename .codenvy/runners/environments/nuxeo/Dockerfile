FROM       quay.io/nuxeoio/nuxeo-base
MAINTAINER CodeEnvy Dev

RUN wget -q "http://www.nuxeo.org/static/latest-release/nuxeo,tomcat.zip,6.0" -O /tmp/nuxeo-distribution-tomcat.zip
RUN unzip -q /tmp/nuxeo-distribution-tomcat.zip -d /var/lib/nuxeo/

RUN mv /var/lib/nuxeo/nuxeo-cap-6.0-tomcat /var/lib/nuxeo/server

# copy the jar to nuxeo folder
ADD $app$ $NUXEO_HOME/nxserver/plugins/$app$

ENV NUXEO_CONF $NUXEO_HOME/bin/nuxeo.conf

# Init nuxeo conf
RUN perl -p -i -e "s/^#?nuxeo.wizard.done=.*$/nuxeo.wizard.done=true/g" $NUXEO_CONF

ENV CODENVY_APP_PORT_8080_HTTP 8080
EXPOSE 8787
CMD ["/var/lib/nuxeo/server/bin/nuxeoctl", "console"]
