FROM openjdk:23-jdk-slim
ARG JAR_FILE=target/pruebaJPA-0.0.1.jar
COPY ${JAR_FILE} app_pruebaJPA.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_pruebaJPA.jar"]