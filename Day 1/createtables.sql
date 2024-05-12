use  target;
create table REGIONS(
region_id int Primary key,
region_name varchar(50) not null
);
create table COUNTRIES(
country_id varchar(2) primary key,
country_name varchar(50) not null,
region_id int ,
FOREIGN KEY(region_id) references REGIONS(region_id)
);
create table JOBS(
job_id varchar(15) primary key,
job_title varchar(50) ,
min_salary int,
max_salary int
);
create table DEPARTMENTS(
department_id int primary key,
department_name varchar(50) ,
manager_id int ,
location_id int,
foreign key (location_id) references LOCATIONS(location_id)
);
create table EMPLOYEES(
employee_id int primary key,
first_name varchar(50),
last_name varchar(50),
email varchar(100),
phone_nuber varchar(50),
hire_date date,
job_id varchar(15),
salary double,
commission_pct double,
manager_id int,
department_id int,
foreign key(job_id) references JOBS(job_id),
foreign key(manager_id) references EMPLOYEES(employee_id),
foreign key(department_id) references DEPARTMENTS(department_id)
);
alter table DEPARTMENTS add foreign key(manager_id) references EMPLOYEES(employee_id);

create table LOCATIONS(
location_id int primary key,
street_address varchar(255),
postal_code varchar(10),
city varchar(50),
state_province varchar(50),
country_id varchar(2),
foreign key(country_id) references COUNTRIES(country_id)
);

alter table employees rename column phone_nuber to phone_number;

create table JOB_HISTORY(
employee_id int ,
start_date date,
end_date date,
job_id varchar(15),
department_id int,
primary key(employee_id,start_date),
foreign key(job_id) references JOBS(job_id),
foreign key(department_id) references DEPARTMENTS(department_id)
);


