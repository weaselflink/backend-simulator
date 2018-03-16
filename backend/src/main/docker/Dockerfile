FROM openjdk:8-jre-alpine

EXPOSE 8081
#install Spring Boot artifact
VOLUME /tmp
ADD /maven/backend-1.0-SNAPSHOT.jar backend.jar
RUN sh -c 'touch /backend.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/backend.jar"]
