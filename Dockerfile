FROM maven:3.8.7 AS build
WORKDIR /app
COPY . .
# Build the application with maven
RUN mvn -B clean package -DskipTests

# Create a new image with the jar file
FROM openjdk:17
WORKDIR /app

# Copy the jar file from the build image to the new image
COPY --from=build /app/target/*.jar book-application.jar

ENV SERVER_PORT=8282

CMD ["java", "-jar", "book-application.jar"]
