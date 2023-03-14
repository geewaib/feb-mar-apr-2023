* Create a new spring boot project or module __spring-boot-lab02-jdbc__. Add the required dependencies to work with JDBC.

<br/>


* Create a table __topics__ in __training__ database with the following fields
* __id__ int(primary key, auto increment), __title__(varchar) and __duration__ (number)

<br/>



<br/>

* Define __TopicsDao__ class which has methods to add/remove/list all topics
* Implement a __ConferenceService__ class that uses __TopicsDao__

``` java 

public class ConferenceService {
	
	public boolean addTopic(String title, int duration) {
		//true if succesfully inserted
		//false if insertion fails
		//Do not allow duplicate topics
	}
	
	public List<Topic> getAllTopics() {
	
	} 
	
	public boolean removeTopic(String title) {
		//Throw NotFoundException if the topic doesn't exist
	}
	
}

```

* Inject __ConferenceService__ in your main class
* Insert the following topics and check the operations

```
Functional programming with Erlang - 60 min
Scala Tricks - 45 min
Spring unit testing - 90 min
Unit testing JavaScript - 90 min
Concurrency on the JVM - 60 min
Goroutines - 45 min
RoR - 90 min
```