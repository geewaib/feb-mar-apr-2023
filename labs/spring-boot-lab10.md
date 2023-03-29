### Spring boot Lab10

* Continue working on lab09 in the **movie-details-fetcher** application


##### Movie details fetcher

* This consumer listens to __movie_topic___
* It connects to __http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f&t=movieName_
* It publishes the name, year of release and genre in JSON format to another topic **movie-details-topic**
* If the movie is not found, throw an Exception with retry attempts as 2 

