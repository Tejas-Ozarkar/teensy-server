

FROM openjdk:11-slim

EXPOSE 8080
ARG JAR_FILE=target/teensy-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} teensy.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","teensy.jar"]