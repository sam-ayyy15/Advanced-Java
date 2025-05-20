### 8A. Read all the existing records from the table coffee which is from the database test and insert a new coffee product into it \[Create a table coffee with fields ( id,coffee\_name,price)] using HTML and JSP to get the fields and display the results respectively

### 8B. Read all the existing records from the table coffee which is from the database test and update an existing coffee product  in the table with its id. \[Create a table coffee with fields ( id,coffee\_name,price)] using HTML and JSP to get the fields and display the results respectively
---
## SQL STRUCTURE
CREATE TABLE IF NOT EXISTS `coffee` (  
`id` int(5) NOT NULL AUTO_INCREMENT,  
`coffee_name` varchar(100) NOT NULL,  
`priced` int(5), PRIMARY KEY (`id`)  
);
