FROM openjdk:17
COPY target/learn-1.jar /service/app.jar
ENTRYPOINT ["java","-jar","service/app.jar"]