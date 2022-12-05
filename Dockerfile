FROM openjdk:11.0-jdk
ARG JAR_FILE=fooddelivery/target/*.jar
COPY ${JAR_FILE} fooddelivery-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar $JAVA_ARGS fooddelivery-0.0.1-SNAPSHOT.jar