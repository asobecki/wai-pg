# 05-jaxws-client-wsimport - client app for jax-ws web service
## Example client application for service which is offered by the 03-jaxws-service app
*andrzej.sobecki@pg.edu.pl*

This example use different assumption about how the interface of web service is provided to the client application. Yet the interface is downloaded automatically from the server. Based on the downloaded WSDL file there are created source codes that describes how the exampled application should prepare requests and responses. In order to create mentioned files automatically you should use this command `wsimport -keep http://localhost:8080/jax-ws/first-ws?wsdl`. After that you will get three new files:
- binary files with is service description,
- interface descrption,
- stub class which you can use to send requests and receive response.

## Build and run the example
Building process you can perform by using `mvn package` command which create **05-jaxws-client-wsimport.jar** file in the **target** directory. Next in order to run the compiled application you can use `java -cp target/05-jaxws-client-wsimport-1.0-SNAPSHOT.jar pl.pg.asobecki.wai.jaxws.Main` command. After that the application will create a request and send them to the web service. The response gathered from the web service will be exposed in the console.

## Requirements
Created and running the example application from **03-jaxws-service** directory. 

## Exercises
1. Try change something in the code of web service **03-jaxws-service** and try again run the application from this example.
2. Change interface in **03-jaxws-service** and observe how will change messages produced by application from this example.
3. What you should repair in your application after the interface of the web service is changed?