CREATE TABLE IF NOT EXISTS prestamo (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nroSocio INTEGER,
    isbn INTEGER NOT NULL,
    fecha VARCHAR(10) NOT NULL
);