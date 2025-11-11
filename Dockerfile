FROM openjdk:8
EXPOSE 8080
ADD taeget/java-cicd.jar java-cicd.jar
ENTRYPOINT ["java","jar","/java-cicd.jar"]