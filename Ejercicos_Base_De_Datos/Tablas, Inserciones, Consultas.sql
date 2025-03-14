create database Prueba;

use Prueba;

create table zapatos (
id int primary key,
nombre varchar(50),
talla int,
precio int
);

INSERT INTO zapatos (id, nombre, talla, precio) VALUES
(1, 'Zapato Deportivo', 42, 120),
(2, 'Botín de Cuero', 44, 150),
(3, 'Sandalia de Verano', 38, 40),
(4, 'Zapato Formal', 41, 110),
(5, 'Bota de Montaña', 45, 180);

select * from zapatos;