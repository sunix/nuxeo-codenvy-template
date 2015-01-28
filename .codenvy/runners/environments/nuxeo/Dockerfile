FROM       nuxeo/nuxeo-codenvy-docker:latest

# copy the jar to nuxeo folder
ADD $build$ /tmp/build.zip

RUN unzip /tmp/build.zip && mkdir $NUXEO_HOME/nxserver/plugins && cp /tmp/application.jar $NUXEO_HOME/nxserver/plugins

# Add instance.clid
ADD $src$/src/main/resources/instance.clid $NUXEO_HOME/nxserver/data/instance.clid

CMD ["/var/lib/nuxeo/server/bin/nuxeoctl", "console"]
