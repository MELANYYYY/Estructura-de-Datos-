import java.util.ArrayList;
import java.util.List;

public class ListaSimplementeEnlazada {
    private Nodo cabeza;
    private int tamano;

    public ListaSimplementeEnlazada() {
        this.cabeza = null;
        this.tamano = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int getTamano() {
        return tamano;
    }

    public void agregar(Profesor profesor) {
        Nodo nuevo = new Nodo(profesor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamano++;
    }

    public List<String> ProxCambio() {
        List<String> nombres = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            Profesor p = actual.getDato();
            if (p.getCategoria() == Categoria.INSTRUCTOR && p.getEdad() > 26) {
                nombres.add(p.getNombre());
            }
            actual = actual.getSiguiente();
        }
        return nombres;
    }

    public List<String> MostrarLista() {
        List<Profesor> ordenados = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            Profesor p = actual.getDato();
            int pos = 0;
            while (pos < ordenados.size() && ordenados.get(pos).getEdad() >= p.getEdad()) {
                pos++;
            }
            ordenados.add(pos, p);
            actual = actual.getSiguiente();
        }

        List<String> resultado = new ArrayList<>();
        for (Profesor p : ordenados) {
            resultado.add(p.toString());
        }
        return resultado;
    }

    public String CantProfesores() {
        int instructores = 0, asistentes = 0, auxiliares = 0, titulares = 0;

        Nodo actual = cabeza;
        while (actual != null) {
            switch (actual.getDato().getCategoria()) {
                case INSTRUCTOR: instructores++; break;
                case ASISTENTE:  asistentes++;   break;
                case AUXILIAR:   auxiliares++;   break;
                case TITULAR:    titulares++;    break;
            }
            actual = actual.getSiguiente();
        }

        return "Instructor: " + instructores + "\n"
             + "Asistente: " + asistentes + "\n"
             + "Auxiliar: " + auxiliares + "\n"
             + "Titular: " + titulares;
    }
}
