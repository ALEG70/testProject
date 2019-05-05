-- table fines(id_fine, car_id, type_id(type of fine))
CREATE TABLE fines(id_fine INT NOT NULL PRIMARY KEY, car_id INT NOT NULL,
type_id INT NOT NULL, FOREIGN KEY(car_id) references cars(id_car),
FOREIGN KEY(type_id) REFERENCES fine_types(id_ft));