# For Java 8, try this
# FROM openjdk:8-jdk-alpine

# For Java 11, try this
FROM openjdk:17-jdk-alpine

EXPOSE 9293
 
ADD target/first-application.jar first-application.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","/first-application.jar"]