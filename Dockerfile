# ---- Build Stage ----
FROM maven:3.9.5-eclipse-temurin-21 AS build

WORKDIR /app
COPY . .

# Build the Spring Boot app (skip tests to make it faster)
RUN mvn clean package -DskipTests

# ---- Run Stage ----
FROM eclipse-temurin:21-jre

WORKDIR /app
EXPOSE 8080

# Copy the generated jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]