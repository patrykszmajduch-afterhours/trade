FROM eclipse-temurin
EXPOSE 5005
ARG JAR_FILE=target/gateway-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]