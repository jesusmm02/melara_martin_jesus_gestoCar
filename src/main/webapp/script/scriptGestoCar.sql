-- Usuario gestocar

DROP USER IF EXISTS 'gestocar'@'localhost';

CREATE USER 'gestocar'@'localhost' IDENTIFIED WITH mysql_native_password BY 'Java*2024';

GRANT ALL PRIVILEGES ON gestocardb.* TO 'gestocar'@'localhost';

REVOKE GRANT OPTION ON gestocardb.* FROM 'gestocar'@'localhost';


-- Base de datos gestocardb

DROP DATABASE IF EXISTS gestocardb;

CREATE DATABASE gestocardb;

USE gestocardb;



CREATE TABLE usuarios (
    idusuario SMALLINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(20) NOT NULL,
    apellidos VARCHAR(30) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    dni VARCHAR(8),
    campobaja CHAR(1) DEFAULT 'F',
    PRIMARY KEY (idusuario)
);

CREATE TABLE vehiculos (
    idvehiculo SMALLINT NOT NULL AUTO_INCREMENT,
    idusuario SMALLINT NOT NULL,
    marca VARCHAR(20) NOT NULL,
    modelo VARCHAR(30) NOT NULL,
    motor ENUM('gasolina', 'gasoil', 'eléctrico') NOT NULL,
    matricula VARCHAR(8) NOT NULL UNIQUE,
    cilindrada TINYINT NOT NULL,
    caballos TINYINT,
    color VARCHAR(10),
    fechacompra DATE NOT NULL,
    fechaventa DATE,
    preciocompra DECIMAL(7,2) NOT NULL,
    precioventa DECIMAL(7,2),
    PRIMARY KEY (idvehiculo)
);


CREATE TABLE fotos (
    idfoto SMALLINT NOT NULL AUTO_INCREMENT,
    idvehiculo SMALLINT NOT NULL,
    foto VARCHAR(12) NOT NULL,
    PRIMARY KEY (idfoto),
    FOREIGN KEY (idvehiculo) REFERENCES vehiculos(idvehiculo),
    CHECK (foto LIKE 'foto%' AND (foto LIKE '%.png' OR foto LIKE '%.jpg'))
);

CREATE TABLE gastos (
    idgasto SMALLINT NOT NULL AUTO_INCREMENT,
    idvehiculo SMALLINT NOT NULL,
    concepto VARCHAR(40) NOT NULL,
    fechagasto DATE NOT NULL,
    descripcion VARCHAR(100) NOT NULL,
    importe DECIMAL(6,2) NOT NULL,
    establecimiento VARCHAR(100),
    kilometros SMALLINT,
    PRIMARY KEY (idgasto)
);

	ALTER TABLE vehiculos
	ADD CONSTRAINT fk_usuario_vehiculos
	FOREIGN KEY (idusuario) REFERENCES usuarios(idusuario);
    
    
    ALTER TABLE fotos
	ADD CONSTRAINT fk_vehiculo_fotos
	FOREIGN KEY (idvehiculo) REFERENCES vehiculos(idvehiculo);
    
    
    ALTER TABLE gastos
	ADD CONSTRAINT fk_vehiculo_gastos
	FOREIGN KEY (idvehiculo) REFERENCES vehiculos(idvehiculo);

 INSERT INTO usuarios (nombre, apellidos, email, password, dni, campobaja) VALUES ("admin", "admin", "admin@iesalbarregas.es", md5("admin"), NULL, default);
