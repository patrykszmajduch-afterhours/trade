FROM eclipse-temurin
EXPOSE 5006
ARG JAR_FILE=target/trace-service-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]