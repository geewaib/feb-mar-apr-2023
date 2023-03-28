## Docker

* How do you have two different versions of a DB say MySQL 5.x and MySQL 8.x in a same machine?
* Installing and configuring a number of applications in your machine can be tedious

* Install **Docker Desktop**; Contains a Docker (Server or Engine or daemon); Docker Client (CLI, Visual)
* Using the client you connect to the server and create boxes (or containers)
* Each container is a Linux machine where your application is running

* docker pull <image>
* docker run <image>	

### Mysql

```
docker pull mysql:latest
docker run -p3306:3306 -e MYSQL_ROOT_PASSWORD=root mysql:latest
docker run -p3306:3306 -vYOUR_HOST_MACHINE_PATH:/var/lib/mysql  -e MYSQL_ROOT_PASSWORD=root mysql:latest

```

### Containerizing your spring boot API

* Package it to a jar 
* Bundle it as an image
* Run the image

#### Bundling as an image

* Define a configuration file
* **Dockerfile**
* Dockerfile is a simple configuration file that contains instructions to run your application

``` yml

FROM eclipse-temurin:11-alpine
COPY target/my-api-1.0.0.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

```

### k8s

* Scalability, orchestration of containers
* **pods**: Fundamental building blocks of k8s
* A pod is a wrapper to a container
* Using k8s you can launch, kill, scale up/down pods
* Two things you need to work with k8s: cluster, k8s tools

#### To Do

* Create a spring boot rest application that runs on 8080

``` java
@RestController
public class SampleController {
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello " + name;
	}
}
```

* Dockerize it
* Kubernetize it
* Create pods
* Pods are wrappers to containers
* They automatically restart on crash/stop

#### some k8s commands


```
kubectl version
kubectl config get-contexts
kubectl get pods
kubectl run pod-name --image=image-name
kubectl describe pod pod-name
kubectl delete pod pod-name
```





































