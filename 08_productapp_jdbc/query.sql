
create table product_table
(
	id int not null primary key, 
	name varchar(80) not null, 
	price DECIMAL(10,2) not null,
 	isAvailable char(1) not null
);

insert into product_table(id,name, price, isAvailable) values(1,'laptop',56777,'Y');


