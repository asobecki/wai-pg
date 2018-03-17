# Client app for jax-ws web service - rpc
## Example client application for service which is offered by the 03-jaxws-service app
*andrzej.sobecki@pg.edu.pl*

This is the first example of jax-ws client application which is based on the provided `FirstWebService.java` file. It contains copy of interface definition and is used to mapping every request and response between client and server apps.

## Build and run the example
Building process you can perform by using `mvn package` command which create **04-jaxws-client.jar** file in the **target** directory. Next in order to run the compiled application you can use `java -cp target/04-jaxws-client-1.0-SNAPSHOT.jar pl.pg.asobecki.wai.jaxws.Main` command. After that the application will create a request and send them to the web service. The response gathered from the web service will be exposed in the console.

## Requirements
Created and running the example application from **03-jaxws-service** directory. 

## Exercises
1. Try change something in the code of web service **03-jaxws-service** and try again run the application from this example.
2. Change interface in **03-jaxws-service** and observe how will change messages produced by application from this example.
3. What is the main drawback of this example?
