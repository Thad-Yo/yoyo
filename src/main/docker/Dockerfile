FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD yoyo-0.0.1-SNAPSHOT.jar yoyo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
