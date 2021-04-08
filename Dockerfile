FROM openjdk:8-slim
COPY ./target/*.jar /opt/app.jar
CMD ["java","-jar","/opt/app.jar"]
