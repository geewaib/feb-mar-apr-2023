FROM eclipse-temurin:11-alpine
COPY target/hello-sb-0.0.1-SNAPSHOT.jar app.jar
ENV WELCOME "Default Welcome"
EXPOSE 8080
ENTRYPOINT ["java", "-Dwelcome=${WELCOME}",  "-jar", "/app.jar"]