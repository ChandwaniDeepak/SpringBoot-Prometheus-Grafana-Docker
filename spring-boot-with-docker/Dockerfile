FROM openjdk:8 AS javaJDK
MAINTAINER "er.deepakchandwani@gmail.com"
copy target/docker.jar docker.jar
EXPOSE 8082
CMD ["java", "-jar", "docker.jar"]