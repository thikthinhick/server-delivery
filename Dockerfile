FROM openjdk:11.0-jdk
ARG JAR_FILE=fooddelivery/target/*.jar
ENTRYPOINT exec java $JAVA_OPTS -jar $JAVA_ARGS fooddelivery-0.0.1-SNAPSHOT.jar