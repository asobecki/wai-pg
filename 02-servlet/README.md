# WAI Gdansk University of Technology
## Example of java servlet technology
*andrzej.sobecki@pg.edu.pl*

In order to build the project and prepare war package please run command `$ mvn package`.
The result file will be generated in folder **target**.

The example could be run using docker container description which is available in folder **docker**. Before you build the docker image please ensure that the **02-servlet-1.0-SNAPSHOT.war** file is copied to the **war** directory. To build image from the provided description please run `$ docker build -t wai-tomcat-example ./docker`. 

For running the created image please use `$ docker run -it --rm -p 8088:8080 wai-tomcat-example`. The example servlet application you could see in web browser if you will enter the following address: `http://localhost:8080/02-servlet-1.0-SNAPSHOT/first-first`.

## Exercises
1. Find other URL addresses that are supported by the created application.
2.	Add new URLs that will be available by the application.
3.	Add a new servlet class and appropriate configuration for mapping this new servlet class for new URLS.
