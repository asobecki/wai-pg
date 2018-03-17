# 08-spring-boot-web
## Extended boot application with JSP templates support

In this example you can see how we can transform output using JSP templates. Configuration of this application is in file `application.properties`. It is important to run this example in Tomcat. Only then spring will use ServletInitializer instead of SpringApp. 

## Build and run
In order to build the code you should use `mvn package` command and then `cp target/08-spring-boot-web-1.0-SNAPSHOT.war docker/war/`. After that you could use the existing docker container description. First build the image using command `docker build -t wai-spring-example ./docker` and then run the container `docker run -it --rm -p 8088:8080 wai-spring-example`. You can test your application providing in your browser following URL: `http://localhost:8088/08-spring/aaa`.

## Exercises
1. Try to run the application through maven plugin `mvn spring-boot:run` and check responses from the server.
2. Add second JSP template and use them in action.