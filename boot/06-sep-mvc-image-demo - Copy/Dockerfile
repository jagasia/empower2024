FROM openjdk:17-jdk-slim AS build
EXPOSE 5002
ADD target/06-sep-mvc-image-demo-0.0.1-SNAPSHOT.war 06-sep-mvc-image-demo-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","06-sep-mvc-image-demo-0.0.1-SNAPSHOT.war"]
