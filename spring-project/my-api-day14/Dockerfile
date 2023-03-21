#Installing JDK
FROM eclipse-temurin:11-alpine
COPY target/my-api-1.0.0.jar app.jar

# Not required at all; A convenient instruction so that you can run the container from Docker desktop dashboard
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]
