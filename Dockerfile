# Base image containing Java 21 Runtime Environment
FROM eclipse-temurin:21-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the executable Fat JAR into the container
COPY build/libs/CICDpractice-1.0-SNAPSHOT-all.jar app.jar

# Command executed when the container starts
CMD ["java", "-jar", "app.jar"]