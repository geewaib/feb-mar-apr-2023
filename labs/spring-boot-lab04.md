* In this lab you’ll practice working with ORM with Spring boot

* Create a database __'accountsdb'__
* Create a table __accounts__ with 3 columns

```
account_number varchar primary key
owner varchar
balance int
```

* insert two accounts directly into the database

```
INSERT INTO accountsdb.accounts VALUES('acc101', 'John', 20000);
INSERT INTO accountsdb.accounts VALUES('acc102', 'Ram', 10000);
```

* Create a table __account_statements__ with 4 columns

```
id number primary key
account_number varchar
amount int
type varchar
```

* Create a new project/module for lab04

* Implement the following in a BankService class

```
deposit  (pass the account number, amount and type(Salary, Dividend, etc.,) 
withdraw (pass the account number, amount and type(Interest, Card charges etc.,)) check for available balance
printStatement for an account number
```

* The methods will update the balance in accounts table and insert a statement in the account_statements table
* Implement the entity, repository classes
* Capture the relationship between account and statements
* Throw exceptions if the account number does not exist