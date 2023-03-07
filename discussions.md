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







































