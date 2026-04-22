FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/classes /app

EXPOSE 8090

CMD ["java", "com.devops.App"]