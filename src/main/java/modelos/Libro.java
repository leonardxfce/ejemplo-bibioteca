package modelos;

public class Libro {
    String nombre;
    int ISBN;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setISBN(int isbn) {
        this.ISBN = isbn;
    }

    public void guardar() {
        System.out.println("Guardado en la BD");
    }
}

