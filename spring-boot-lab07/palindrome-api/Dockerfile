FROM eclipse-temurin:11-alpine
COPY target/palindrome-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]