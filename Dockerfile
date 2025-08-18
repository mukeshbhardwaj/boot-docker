FROM java:8
EXPOSE 1111:1111
COPY ./target/*.jar app.jar 
RUN ["java", "-jar", "app.jar"]
