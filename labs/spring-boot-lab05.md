## Develop a calculator controller to do the following.


* Sum of two numbers:  GET -> http://localhost:8081/calc/sum/1/3

* Square of a number: PUT -> http://localhost:8081/calc/square/60

* Product of two numbers: POST -> http://localhost:8081/calc/product?num1=12&num2=14

* Return a list of operations  ['Sum', 'Square', 'Product']: GET -> http://localhost:8081/calc/operations

#### Note:

* Do not write your Logic inside a Controller class.
* Write it separately and wire it with the controller
* Modify the port in yml file
* _Though some of the mappings like PUT, POST don't really make sense in this example, you'll just practice using them._