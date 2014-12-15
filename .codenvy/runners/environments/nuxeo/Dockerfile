FROM       nuxeo/nuxeo-codenvy-docker:latest

# copy the jar to nuxeo folder
ADD $app$ $NUXEO_HOME/nxserver/plugins/$app$

# Add instance.clid
ADD $app_src$/src/main/resources/instance.clid $NUXEO_HOME/nxserver/data/instance.clid


CMD ["/var/lib/nuxeo/server/bin/nuxeoctl", "console"]
