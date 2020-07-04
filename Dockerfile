FROM java:8
EXPOSE 1111:1111
ADD /target/dockerapplication.jar app.jar 
ENTRYPOINT ["java", "-jar", "app.jar"]