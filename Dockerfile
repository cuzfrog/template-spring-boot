FROM openjdk:17-alpine
RUN addgroup -S app && adduser -S app -G app
USER app:app

WORKDIR /app
ARG JAR_FILE=dist/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
