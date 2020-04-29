create database ConexionJavaBD;

use ConexionJavaBD;

create table Personas
(
id int primary key identity(1,1),
nombre nvarchar (30) not null,
apellido nvarchar (30) not null,
);

insert into Personas values('cesar','de la rosa')
insert into Personas values('mayra','hipatl')
select * from Personas

