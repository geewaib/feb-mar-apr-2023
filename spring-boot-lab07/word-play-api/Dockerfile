FROM eclipse-temurin:11-alpine
COPY target/word-play-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENV PALINDROME_HOST localhost
ENV PALINDROME_PORT 8080
ENTRYPOINT ["java", "-jar", "-Dpalindrome.service.host=${PALINDROME_HOST}", "-Dpalindrome.service.port=${PALINDROME_PORT}", "/app.jar"]