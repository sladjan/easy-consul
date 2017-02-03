FROM frolvlad/alpine-oraclejdk8:slim
ADD target/service-1.0.0.jar app.jar
CMD /usr/bin/java -Xmx400m -Xms400m -jar app.jar
EXPOSE 8080