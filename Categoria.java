public enum Categoria {
    INSTRUCTOR("Instructor"),
    ASISTENTE("Asistente"),
    AUXILIAR("Auxiliar"),
    TITULAR("Titular");

    private final String etiqueta;

    Categoria(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return etiqueta;
    }
}
