FROM adoptopenjdk/openjdk11
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} payment-service.jar
CMD ["java", "-jar", "payment-service.jar"]

# docker build -t api-gateway .
# docker run -d -p 8080:8080 --name="api-gateway" api-gateway