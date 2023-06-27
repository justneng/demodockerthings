FROM openjdk:17-ea-slim-buster

RUN apt-get update
RUN apt-get install -y nano
RUN adduser --system --group neng

USER neng

ARG JAR_FILE
ADD ${JAR_FILE} /myapp/demo.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/myapp/demo.jar"]