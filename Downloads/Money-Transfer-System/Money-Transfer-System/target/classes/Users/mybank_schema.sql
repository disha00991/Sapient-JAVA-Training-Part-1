create database mybank_transact;

use mybank_transact;

create table customer(
    acNo varchar(15) primary key,
	name varchar(15),
    balance int
);