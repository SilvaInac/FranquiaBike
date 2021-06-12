drop database if exists bike;
create database bike;

use bike;

create table Franquia(
	cnpj int primary key not null,
	nome varchar(50) not null,
    telefone int not null,
    endereco varchar(100) not null
);

create table Bicicleta(
	id int not null,
    cor varchar(30) not null,
    modelo varchar(50) not null,
    aro int not null,
    alocada bool not null,
    primary key(id)
);

create table Usuario(
	cpf int not null,
	telefone int not null,
    nome varchar(30) not null,
    endereco varchar(50) not null,
    senha varchar(8) not null, 
    primary key(cpf)
);

create table Acessorio(
	id int not null,
    protecao bool,
	corCapacete varchar(30) not null,
    tamanhoCapacete int not null,
    primary key(id)
);

create table estoque(
	cnpjFranquia int not null,
    idBike int not null,
    idAcessorio int not null,
    CONSTRAINT fk4
    foreign key (idBike) 
    references Bicicleta(id) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    CONSTRAINT fk5
    foreign key (idAcessorio) 
    references Acessorio(id) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    primary key (idBike,idAcessorio)
);

create table Locar(
	idCliente int not null,
    idBike int not null,
    idAcessorio int not null,
    retirada varchar(30) not null,
    devolucao varchar(30) not null,
	CONSTRAINT fk1
    foreign key (idCliente) 
    references Usuario(cpf) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    CONSTRAINT fk2
    foreign key (idBike) 
    references Bicicleta(id) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    CONSTRAINT fk3
    foreign key (idAcessorio)
    references Acessorio(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    PRIMARY KEY(idCliente, idBike, idAcessorio)
);

CREATE USER 'User' identified by 'senha123';
CREATE USER 'Adm' identified by 'Administrador';

select* from Franquia;


