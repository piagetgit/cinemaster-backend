FROM adoptopenjdk/openjdk11
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} api-gateway.jar
CMD ["java", "-jar", "api-gateway.jar"]