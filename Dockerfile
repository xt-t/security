
FROM openjdk:17

MAINTAINER Thuy <xt.trinh@gmx.de>

ADD target/classes/com/example/docker DockerApplication.jar

CMD ["sh","-c","java -jar /DockerApplication.jar"]