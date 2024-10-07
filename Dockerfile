FROM openjdk:22-jdk-slim
LABEL authors="Ricky"
COPY target/BudgetManager-1.0-SNAPSHOT.jar BudgetManager.jar
ENTRYPOINT ["java", "-jar", "BudgetManager.jar"]


