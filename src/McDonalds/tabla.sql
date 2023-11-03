CREATE TABLE productos(
idproducto int not null,
tipo varchar(30) not null,
descripcion varchar(30) not null,
precio decimal(8,2) not null,
CONSTRAINT pkProductos primary key(idproducto)
);