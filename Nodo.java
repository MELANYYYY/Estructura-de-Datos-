public class Nodo {
    private Profesor dato;
    private Nodo siguiente;

    public Nodo(Profesor dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Profesor getDato() {
        return dato;
    }

    public void setDato(Profesor dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
