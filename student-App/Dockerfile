# Use OpenJDK 17 base image
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/student-app.jar student-app.jar

# Set the command to run the JAR file
ENTRYPOINT ["java", "-jar", "student-app.jar"]
