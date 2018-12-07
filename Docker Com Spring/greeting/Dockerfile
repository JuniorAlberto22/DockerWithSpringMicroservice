FROM alpine:base
MAINTAINER javaonfly
RUN apk --no-cache add netcat-openbsd
COPY ./server /opt/lib
ENTRYPOINT [ "/usr/bin/java" ]
CMD ["-jar", "/opt/lib/Greeting.jar"]
EXPOSE 2222

#docker container run -d -p 2222:2222 --name greeting greeting-server