* Let's practice packaging and deploying spring boot applications in docker

* Create a new spring boot application **spring-boot-lab08**
* Add spring web, jpa, mysql driver dependencies
* Develop a calculator controller to do the following.
```
# Square of a number:  GET -> http://localhost:8081/calc/square/1
```

* Every time you invoke the endpoint, you will also write the result to a DB
* create a table **squares** with the following columns. You can use training DB

```
id int not null primary key auto_increment
num int
result int
```

* Create a docker-compose file and configure mysql and spring-boot-lab08 and run them
