# JAX-WS Web Service example
## Application provide web service server that offers jax-ws service
*andrzej.sobecki@pg.edu.pl*

For the building process you should use `$ mvn package` command. After properly execution of this command you will find **03-jaxws-service.jar** file in the **target** directory.

In order to run you must specify the main class that exists in the **jar** file. To to that please run following command: 
```
$ java -cp target/03-jaxws-service.jar pl.pg.asobecki.wai.jaxws.FirstWebServicePublisher
```

This command will execute the application in will be waiting for requests. To send simple request please open your browser and put following URL:
```
http://localhost:8080/jax-ws/first-ws?wsdl
```
The result of mentioned URL is well-formated XML document that describe the example JAX-WS Web Service. This document use terms defined in Web Service Description Language.

## Exercises:
1. Read the WSDL file and for each element find adequacy objects in the source code of the example application such as operation, binding, service etc.
2. Try to extend the provided example by adding new method.
3. Try to extend the provided example by adding new service.
4. Change the URLs of services that are exposed by your application.

