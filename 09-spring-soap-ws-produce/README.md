# 09-spring-soap-ws-produce
## Example of serving Web Services using SOAP
*andrzej.sobecki@pg.edu.pl*

This example shows how to generate a simple Web Service that use SOAP to communicate with clients. Stubs are generated using **JAXB** library by execute command `xjc -d [where-generate-files] [path-to-xsd-file]`. The example application serve repository with information about regions. The repository is describe by **RegionRepository.java** corresponding to the schema **regions.xsd**. The repository is available through endpoint which was describe in **RegionEndpoint.java** file. Finally the configuration of the web service was saved in **WebServiceConfig.java**. Bean **messageDispatcherServlet** is responsible for linking Spring Application Context with Spring WS functionality. General interface for all endpoints available in the application is configured in the bean **defaultWsdl11Definition**. Lastly the bean **regionsSchema** bind schema document to the interface of web service.

# Build and run process
For build the application you may use `mvn package`. Although you can only use `mvn spring-boot:run` in order to build and run. After the application will start you can use file **testing-request.xml** for testing the application. In this file are described parameters of the request which will be executed after you run following command `curl --header "content-type: text/xml" -d @testing-request.xml http://localhost:8080/ws`. You should get information about the selected region.

# Problems with JDK 11
If you have installed JDK 11 then you will probably have a problem with `mvn package` command because there may occur an exception: `Caused by: java.lang.ClassNotFoundException: javax.activation.MimeTypeParseException`. In order to compile the project you should downgrade (temporary) JDK version using the following commands:
* Check available JDKs: `/usr/libexec/java_home -V`,
* View the JAVA_HOME for the JDK with lower version numer using `/usr/libexec/java_home -v <version_number_put_here>
* `export JAVA_HOME=/usr/libexec/java_home -v <version_number_put_here>`

# Exercises
1. Try to add more functionality to the repository and expose the created functions through web service endpoints.
2. Extend the provided schema **regions.xsd** and modify application code in order to support new attributes.
3. Create a new endpoint and new schema file for this endpoint which will be response for collecting information about cities in each of regions.