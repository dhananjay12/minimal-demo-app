FROM openjdk:11.0.5-jre-slim

# Copy jar file to the container
COPY ./target/demo-app.jar demo-app.jar

EXPOSE 8080

# Execute the application
ENTRYPOINT ["java","-jar","demo-app.jar"]