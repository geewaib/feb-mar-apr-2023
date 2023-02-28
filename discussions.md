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























