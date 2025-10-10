FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app
COPY target/*-runner.jar app.jar
EXPOSE 9090

CMD ["java", "-Dquarkus.http.port=9090", "-jar", "app.jar"]
