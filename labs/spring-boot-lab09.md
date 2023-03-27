### Spring boot Lab09

* Refer to __Lab11.md__ file
* Create a new Empty project __kafka-lab09__ in IntelliJ

#####  Movie producer

* Create a Module __movie-producer-api__ which is a spring boot web application
* It runs on **8080** 
* It has an endpoint
<br/>

* __1.__ To request for a movie info
* For example if you want details about the movie __War__ you invoke the endpoint.
* This endpoint posts a message to a topic __movie_topic___


##### Movie details fetcher

* Create a Module __movie-details-fetcher__ which is a Kafka consumer application
* This consumer listens to __movie_topic___
* It connects to __http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f&t=movieName_ and prints the name, year of release and genre in the console


