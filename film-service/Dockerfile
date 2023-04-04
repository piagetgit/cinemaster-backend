FROM adoptopenjdk/openjdk11
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} film-service.jar
CMD ["java", "-jar", "film-service.jar"]
