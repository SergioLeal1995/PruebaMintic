create schema tienda_reto_5;
use tienda_reto_5;

create table Producto(
	codigo int primary key not null,
	nombre varchar (45) not null,
	valor_compra varchar (45) not null,
	valor_venta varchar (45) not null,
	cantidad varchar (45) not null,
	categoria varchar (20)
);

insert into Producto (codigo, nombre, valor_compra, valor_venta, cantidad, categoria) values (001, 'Llave 7/16', 4000, 8000, 12, 'Herramienta');
insert into Producto (codigo, nombre, valor_compra, valor_venta, cantidad, categoria) values (002, 'Hombre solo', 7000, 12000, 15, 'Herramienta');
insert into Producto (codigo, nombre, valor_compra, valor_venta, cantidad, categoria) values (003, 'Piso cerámico', 50000, 72000, 800, 'Piso');
insert into Producto (codigo, nombre, valor_compra, valor_venta, cantidad, categoria) values (004, 'Piso cedro', 32000, 60000, 1000, 'Piso');
insert into Producto (codigo, nombre, valor_compra, valor_venta, cantidad, categoria) values (005, 'Tornillo aglomerado', 3000, 7000, 20000, 'Tornillo');
insert into Producto (codigo, nombre, valor_compra, valor_venta, cantidad, categoria) values (006, 'Tornillo bristol', 12000, 17000, 800, 'Tornillo');

select * from Producto;