FROM openjdk:20-jdk-slim

WORKDIR /app

COPY target/Lab3_RegistrationService-0.0.1-SNAPSHOT.jar /app

EXPOSE 8082

CMD ["java", "-jar", "Lab3_RegistrationService-0.0.1-SNAPSHOT.jar"]