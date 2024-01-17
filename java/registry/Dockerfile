FROM eclipse-temurin
EXPOSE 8761
ARG JAR_FILE=target/registry-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]