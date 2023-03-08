* Work with the __movies.txt__ file in the repo
* For each movie you have to connect to the following site __**http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f**__ and print the year of release, star cast and language details
* For example, if you want information about __Spectre__ movie use this URL http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f&t=Spectre

* Design using **parallel streams** to load the movies and invoke the URLs

* Use any HTTP and Json library of your choice (__You need to configure Maven dependency for this__)
* You can also use plain __UrlConnection__ class
* You can use the following code to connect to an external service

``` java
		HttpRequest req = HttpRequest
					.newBuilder(new URI("url"))
					.GET()
					.build();
		HttpResponse<String> response = HttpClient.newBuilder().build().send(req, HttpResponse.BodyHandlers.ofString());
		String result = response.body();
```