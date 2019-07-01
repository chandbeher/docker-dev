FROM tomcat

MAINTAINER Chandan Behera, email:chandan.behera@bipros.com
COPY /target/*.war /usr/local/tomcat/webapps/
