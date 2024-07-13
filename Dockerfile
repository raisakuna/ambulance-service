FROM openjdk:17-alpine
MAINTAINER vastika.com
COPY target/ambulance-docker.jar ambulance-service.jar
ENTRYPOINT ["java","-jar","ambulance-service.jar"]