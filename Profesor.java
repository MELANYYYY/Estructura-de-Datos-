public class Profesor {
    private final String nombre;
    private final int edad;
    private final Categoria categoria;

    public Profesor(String nombre, int edad, Categoria categoria) {
        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return nombre + " | Edad: " + edad + " | Categoría: " + categoria;
    }
}
