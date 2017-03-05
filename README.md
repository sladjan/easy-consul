# Simple and Easy Consul Docker Example with Feign client 

* Download  consul from https://www.consul.io/downloads.html

Run comsul as 

```
./consul agent -dev
```

For running locally 

```
mvn clean package
mvn -f service/pom.xml spring-boot:run
mvn -f ui/pom.xml spring-boot:run
```

* Frontend is available on http://localhost:8090/randomint
* Consul-UI is available on http://localhost:8500/ui

For running in docker container 

```
docker-compose up

```
* Frontend is available on http://192.166.99.100:8090/randomint
* Consul-UI is available on http://192.166.99.100:8500/ui

