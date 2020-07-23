This is a simple Java(Spring Boot) application to test the demo. 

It exposes a REST GET API which has `{userName}` as a PathVariable and it returns the userName with `Hello!` as prefix.

#### Input
      Format ->  `/hello/{userName}`
      Example -> `/hello/rounak`
      

#### Output
      `Hello! Rounak`    
      
### Dockerfile

The dockerfile uses `openjdk:8-jre-alpine` as base image. Then it copies the `*.jar` file to image with name as `app.jar`. And then it starts the application`app.jar` on the entrypoint.
      
      
