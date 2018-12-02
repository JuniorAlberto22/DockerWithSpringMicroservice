FROM alpine:base
MAINTAINER javaonfly
COPY ./server /opt/lib
ENTRYPOINT [ "/usr/bin/java" ]
CMD ["-jar", "/opt/lib/Zuul.jar"]
EXPOSE 8080

#docker run -d --name zuul -p 8080:8080 zuul-server