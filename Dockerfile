FROM openjdk:22-jdk
ADD target/student-app.jar student-app.jar
LABEL authors="Karthik"

ENTRYPOINT ["java", "-jar", "student-app.jar"]