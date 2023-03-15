* Implement Spring-boot-lab02 using JPA :)

* Create a table __topics__ in __training__ database with the following fields
* __id__ int(primary key, auto increment), __title__(varchar) and __duration__ (number)

<br/>

* Create a __NEW__ spring boot project or module __spring-boot-jpa-lab03__
* Add __Spring data JPA, MySQL driver__ dependencies
* You will implement the following in this application


<br/>

* Define Entity class for topics table
* Define the repository for Topic
* Implement a __ConferenceService__ class that uses __TopicRepository__

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