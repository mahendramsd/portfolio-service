FROM openjdk:17-jdk-alpine
MAINTAINER hcl.com
COPY target/portfolio-service-0.0.1-SNAPSHOT.jar /opt/portfolio-service.jar
RUN chmod +x /opt/portfolio-service.jar
EXPOSE 8082
WORKDIR /opt/
USER root
ENTRYPOINT ["java", "-jar", "/opt/portfolio-service.jar"]
