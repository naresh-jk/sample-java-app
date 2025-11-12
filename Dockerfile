FROM openjdk:8
EXPOSE 8080
ADD target/sample-java-app.jar sample-java-app.jar
ENTRYPOINT ["java","-jar","/sample-java-app.jar"]