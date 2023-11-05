FROM openjdk:8
EXPOSE 8082
ADD target/GitJenkinsIntegration-0.0.1-SNAPSHOT.jar GitJenkinsIntegration-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","GitJenkinsIntegration-0.0.1-SNAPSHOT.jar"]