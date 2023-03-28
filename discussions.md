* Java latest version is v19
* Java has releases every 6 months (March and September)
* v1.8 (or 8) is the major release in the java world
* Right now you can choose 1.8 or 11 or 17 or 19

* Download jdk
* jdk contains the tools like compiler, runtime engine, standard libraries

```
java -version
```

### Path and Classpath

* In your machine you need to use javac and java tools to compile and run your programs
* Where are these tools present? In your JDK/bin folder
* So the OS needs to know the path of these tools
* You can **add the path** in your command prompt like this. Say your jdk is in C:\jdk-17

```
> set path=%path%;C:\jdk-17\bin;
```

* **javac filename.java** invokes the javac from the bin folder. 
* java compiler looks for the class in the current folder by default


### File names in java

* The class names follow PascalCase. ie., the starting letter is Caps
* The variables, methods follow camelCase. ie., the starting letter is lowerCase.
* Every __public class__ belongs to a file. The name of the public class should be **same** as the name of the file
* If you have a public class called __Rules__ it should be stored in __Rules.java__
* __Rules.java__ is not same as __rules.java__
* There is no root namespace(**or package**) in Java
* No partial classes in Java 

### IDE

* VS create a blank solution and add projects
* Eclipse you create a workspace and add projects
* IntelliJ you create an empty project and add modules

* When you create a java project say **'hello'** using Maven

```
	[hello]
		- [src]
			- [main]
				- [java]
					 - YOUR CODE GOES HERE
				- [resources]
					 - YOUR CONFIGURATION FILES GO HERE	 
			- [test]
				- [java]
					- YOUR TEST CASES GO HERE
				- [resources]
					- YOUR CONFIGURATION FILES FOR TESTS GO HERE			 
```

### Day 02

* Classes and Objects
* Java classes with private members and public gettter/setter methods (or properties)
* All class names begin with UpperCase and methods/variables start with lowercase
* **extends** is the keyword used for inheritance.
* Method overriding in Java involves redefining the base class method with the same signature in the derived class
* **super** is the keyword used to refer to the base class
* **final** is the keyword used to define constant variables, sealed classes and sealed methods
* **abstract** is used to define abstract classes


### Packages

* Namespaces are LOGICAL grouping of classes
* Packages are physical grouping of classes
* A namespace say **com.herbalife** is a logical grouping
* A package say **com.herbalife** is a physical grouping. ie., a folder called **com** is created. It contains a folder **herbalife**

* jdk contains the standard libraries
* organized into modules
* Each module is organized into packages
* packages contains classes
* **java.base** is the root module that contains all the packages that we need to use in our applications
* Our applications still follow **package as the base structure**. Have not switched to modules
* **java.lang** package is available by default in our code

### Day 03 recap

* Interfaces; default methods, static methods, abstract methods
* Variables in interfaces are implicitly public, static and final
* Enum -> Define enums if you want to enforce type-safety
* Inner classes -> Inner classes can access private members of the outer classes
* You can create inner class objects only using outer class objects
* **outerClassObj.new InnerClass()**
* Compiler generates **Outer$Inner.class**
* Packages are folder structures. Each package is a folder/sub folder entity
* java.lang is included by default
* java.nio; java.util which contains collections
* Set, List, Map
* 

### Lambdas

* You have an interface with just one abstract method. ie., Functional interface
* Create a separate class that implements the interface
* Create an anonymous inner class that implements the interface
* LAmbda expression
* Lambda expressions are shortcut expressions to creating anonymous inner classes
* JVM generates anonymous inner classes during runtime
* Lambdas can be used with functional interfaces only
* Lambdas can be passed around methods as arguments; stored in collections
* From Design perspective, Lambdas are block of code that can be assigned to variables
* Lambdas in Javascript are called **arrow functions**; => operator in Java; -> operator in Java
* :: is the method reference operator; You can assign a reference to a method instead of a lambda expression
* Built-in functional interfaces

### Stream API

* Predicate, Function, Supplier, Consumer
* Stream is a snapshot of the collection
* Used for processing the data; not for modifying the data
* By default, streams process items sequentially
* **java.util.stream** package contains all the methods used in streams
* .stream() method is used to create a stream
* Streams cannot be reused; lazily evaluated; Cannot be used to modify the data
* filter, map, reduce, collect, findFirst, findAny, min, max, sorted
* Optional type is like a box with some data; you check if the box is empty or data is present and use **.get()**
* Declarative style of programming when you use Stream API. You only write what to do, and don't worry about how to do
* Internals of Streams: Stream processes one element at a item. It passes it through all the stages. Unlike languages like JavaScript
* flatMap: Used to flatten a collection of collections to a single collection. flatMap(Collection::stream)

### Threading

* Creating threads in Java leads to creating OS (native) threads
* Create an instance of Thread class and pass the Runnable implementation. call start() method to run the thread
* java.util.concurrent package
* Use the classes like Executors to create pool of threads and submit your tasks(Runnable)
* Number of threads you create depends on the number of cores, CPU or IO intensive operation
* numberOfCores / (1 - blocking factor)
* Creating more number of threads does not guarentee high performance. In fact, it may be the other way around.
* Parallel streams
* Future and CompletableFuture


### Spring

* JDK (Java Standard Edition)
* web applications, web services, security, messaging, email, cron jobs, transactions, object pooling **JEE sdk**, J2EE
* Enters Spring
* Spring framework is a collection of libraries that provide functionalities to build enterprise level applications in Java
* POJO framework
* **Spring** =  *ASP.NET MVC + System.EnterpriseServices + Entity Framework + WCF *
* Create a Maven/Gradle application; add the spring dependencies in pom.xml/build.gradle file. That's it!!!
* **Dependency Injection**: mechanism by which you avoid writing unneccessary creation and lookup code.

```
# You want to insert a record in DB
# LOad the driver
# Create a Connection
# Create a Statement
# Execute the SQL
# Close statement; close connection
# Handle Exceptions


# Execute the SQL
```

* Spring 6.x
* Spring 5.x

* Spring framework provides a  **"light weight container"**
* **ApplicationContext** is the class that acts as the container
* It is responsible for the life cycle of all the beans in the application

#### Working with Core spring 

* Create a Maven project
* Add the spring dependencies
* Create an xml file
* Configure the component-scan base package
* Create classes; Mark them as @Component and autowire them using @Autowired
* Create a class with main method
* Create ApplicationContext and pass the xml file
* Access every bean(or component) and use them

##### Spring boot

* Enters Spring boot
* Spring boot is a way by which you can bootstrap creating spring applications real quick
* Is just an abstraction on Spring
* Spring boot is 3.x (It internally uses Core Spring 6.x)
* Spring boot 2.x (It internally uses Core Spring 5.x)



### Lifecycle

* ApplicationContext is the container
* ApplicationContext is an active container; It **instantiates** all the components on startup
* Defer the instantiation using **@Lazy**
* All the components configured in Spring are in **SINGLETON** scope by default
* You can change the scope using **@Scope** annotation
* 


#### Spring data JDBC

``` sql
create database training;
create table training.persons(
	id int not null primary key auto_increment,
	first_name varchar(40),
	last_name varchar(40),
	age int
);	
```

### Jdbc with Spring

* **Spring data** dependencies
* spring data jdbc
* Wire **JdbcTemplate** and use the methods in the class
* RowMapper, SimpleJdbcCall


### List of annotations

* @Component | @Service | @Repository
* @Value
* @Autowired
* @Configuration, @Bean
* @Qualifier, @Primary
* @ConfigurationProperties(prefix = "")
* @RestController

### JPA

* Java Persistence API
* Uniform API to use any ORM framework from Java applications
* Hibernate, TopLink, JDO
* Create an Entity class. Map the class with the table. Map the variables with the Columns
* @Entity, @Table, @Id, @Column
* Define the DAO(or repository)
* save, delete, finder methods

### REST API

* Spring starter web
* Tomcat embedded in your application
* Create RestController classes and have the mappings(Get, Post, Put, Delete)
* @PathVariable, @RequestParam
* @RequestBody
* @ExceptionHandler, @RestControllerAdvice
* Jackson library

### Packaging spring boot applications

* You can package or bundle a java application as a jar or war file
* war is used for web applications
* war files have to be deployed in a server
* jar files can be run on its own using **java -jar** option
* Spring boot packages all the applications to a jar file, by default
* Spring boot REST api is packaged as a jar file. Jar file contains the tomcat server
* It can be run on its own. You can change the properties dynamically using **-Dkey=value** 
* **-Dserver.port=8081**
* Containerizing a spring boot application; Create a Dockerfile with instructions to run the application
* Create a docker image and start the container


### JEE sdk

* contains packages and modules for building enterprise applications
* Web application specs
* **Servlet**: Java class that can receive requests and send back responses

### Internals of Spring boot Rest api

* **DispatcherServlet** acts as a front controller
* It receives all the requests to the application
* Dispatches the requests to the controllers
* Sends the response back to the user
* Servlet is a java class created using servlet API. You can send requests and receive responses from the servlet
* Tomcat is known as a servlet container or servlet engine
* Every request to the application is converted to a Thread and processed by the **DispatcherServlet**

### Kafka with Spring

* Paves way for async communication
* you want to stream tons of data accross your services, kafka is a potential candidate
* Azure Event Hub, AWS Kinesis, Confluent Kafka on the cloud, Apache Kafka
* Set up a cluster of kafka brokers managed by a coordinator called Zookeeper
* Stores the messages(or events) in Topics
* Topic is like a bucket that has the messages
* The messages in the topics can be consumed by consumers
* The consumers specify a consumer group id
* Each consumer group processes the messages on the topic only once
* Kafka maintains the offset of each consumer group
* Spring boot kafka library; configure kafka in yml file
* KafkaTemplate to publish messages
* @KafkaListener to read messages
* Consumer application keeps polling kafka every x ms
* Consumer application in Spring boot polls and **fetches messages in batch**. It processes each message sequentially

### Sync communication in Java/Spring

* If you want to communicate with another service/API synchronously here're the options

* **RestTemplate** provided by Spring _Maintainence mode. Not preferred_
* **HttpClient** provided by core Java (from Java 11 onwards)
* **WebClient** provided by Spring





















