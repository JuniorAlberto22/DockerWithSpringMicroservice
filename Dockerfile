FROM alpine:edge 
MAINTAINER javaonfly
RUN apk add --no-cache openjdk8

#docker image build -t alpine:base . --rm=true