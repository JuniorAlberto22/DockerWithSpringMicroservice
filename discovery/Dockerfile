
FROM alpine:base
MAINTAINER javaonfly
COPY ./server /opt/lib/
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/Discovery.jar"]
EXPOSE 1111

#docker run -d --name discovery -p 1111:1111 discovery-server