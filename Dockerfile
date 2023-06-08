FROM openjdk:17-jdk-slim
WORKDIR /app
ADD build/libs/api-rest.jar api-rest.jar
EXPOSE 8010
CMD java -jar api-rest.jar