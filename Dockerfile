FROM openjdk:17

WORKDIR /app

COPY target/classes /app

CMD ["java", "com.devops.App"]