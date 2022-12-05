FROM openjdk:11.0-jdk
ARG JAR_FILE=server-delivery/target/*.jar
COPY ${JAR_FILE} /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar $JAVA_ARGS fooddelivery-0.0.1-SNAPSHOT.jar