FROM openjdk:17-jdk-slim
EXPOSE 8081
ARG JAR_FILE=target/java-docker-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} java_docker.jar
ENTRYPOINT ["java", "-jar", "java_docker.jar"]