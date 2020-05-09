# This is simple servlet container based on the Apache Tomcat software
FROM tomcat:latest

COPY war/02-servlet-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/02-servlet-1.0-SNAPSHOT.war

CMD ["catalina.sh", "run"]

# http://localhost:8080/02-servlet-1.0-SNAPSHOT/