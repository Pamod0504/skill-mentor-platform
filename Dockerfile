# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven project files into the container
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests
# Stage 2: Create the runtime image
FROM eclipse-temurin:17-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/skill-mentor-platform-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]