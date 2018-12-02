FROM alpine:base
MAINTAINER javaonfly
COPY ./server /opt/lib/
RUN mkdir /var/lib/config-repo
ENTRYPOINT [ "/usr/bin/java" ]
CMD ["-jar", "/opt/lib/ConfigServer.jar"]
VOLUME /var/lib/config-repo
EXPOSE 9080

#docker run -d --name confi -p 9080:9080 -v C:/Users/Alberto/Desktop/config-repo:/var/lib/config-repo config-server