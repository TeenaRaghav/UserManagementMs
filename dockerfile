
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/UserManagementMS-0.0.1-SNAPSHOT.jar userManagementApp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "userManagementApp.jar"]
