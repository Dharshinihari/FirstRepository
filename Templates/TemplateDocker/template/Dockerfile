FROM openjdk:17-jdk-alpine
ENV uname="priya"
LABEL "version"="priya.1.2"
COPY ./target/template-0.0.1-SNAPSHOT.jar temp.jar
ENTRYPOINT ["java", "-jar", "/temp.jar"]