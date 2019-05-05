-- table cars(id_car, maker, model, license_plate, owner_id)
CREATE TABLE cars(id_car INT NOT NULL, maker VARCHAR(20) not null, model VARCHAR(20) not null,
license_plate VARCHAR(12) UNIQUE NOT NULL, owner_id INT NOT NULL, FOREIGN KEY(owner_id)
REFERENCES owners(id_owner));