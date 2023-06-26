FROM eclipse-temurin:17
WORKDIR /app
COPY target/springboot-restful-webservices.jar springboot-restful-webservices.jar
ENTRYPOINT ["java", "-jar", "springboot-restful-webservices.jar"]