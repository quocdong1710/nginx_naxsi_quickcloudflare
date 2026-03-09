FROM maven:3.9-eclipse-temurin-17 AS builder

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn package

FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY --from=builder /app/target/*jar-with-dependencies.jar app.jar

EXPOSE 7000

CMD ["java", "-jar", "app.jar"]