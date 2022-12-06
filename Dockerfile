FROM openjdk:17-oracle
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar $JAVA_ARGS server.jar
