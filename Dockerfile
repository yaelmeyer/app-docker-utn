#bajo la imagen de maven para buildear la app java-maven-springboot
FROM maven:3.8.5-openjdk-17 AS maven
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests

#bajo la imagen jdk para levantar la app java y copio el .jar generado
FROM openjdk:17-jdk-slim
EXPOSE 8082
COPY --from=maven /app/target/tp-0.0.1-SNAPSHOT.jar java_docker.jar
COPY start.sh .
ENTRYPOINT ["sh","./start.sh"]