import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();
        lista.agregar(new Profesor("Ana Pérez", 25, Categoria.INSTRUCTOR));
        lista.agregar(new Profesor("Luis Gómez", 30, Categoria.INSTRUCTOR));
        lista.agregar(new Profesor("María Díaz", 45, Categoria.AUXILIAR));
        lista.agregar(new Profesor("Carlos Ruiz", 58, Categoria.TITULAR));
        lista.agregar(new Profesor("Elena Torres", 27, Categoria.INSTRUCTOR));
        lista.agregar(new Profesor("Jorge Núñez", 33, Categoria.ASISTENTE));
        lista.agregar(new Profesor("Sofía Vega", 26, Categoria.INSTRUCTOR));
        lista.agregar(new Profesor("Pedro Lara", 45, Categoria.ASISTENTE));

        System.out.println("===== CASO 1: lista con datos variados =====");
        probar(lista, List.of("Luis Gómez", "Elena Torres"));

        ListaSimplementeEnlazada vacia = new ListaSimplementeEnlazada();
        System.out.println("\n===== CASO 2: lista vacía =====");
        probar(vacia, List.of());

        ListaSimplementeEnlazada sinCambio = new ListaSimplementeEnlazada();
        sinCambio.agregar(new Profesor("Rosa Mena", 24, Categoria.INSTRUCTOR));
        sinCambio.agregar(new Profesor("Raúl Soto", 50, Categoria.TITULAR));
        System.out.println("\n===== CASO 3: nadie próximo a cambio =====");
        probar(sinCambio, List.of());
    }

    private static void probar(ListaSimplementeEnlazada lista, List<String> esperadoProxCambio) {
        List<String> prox = lista.ProxCambio();
        System.out.println("\n-- ProxCambio() --");
        System.out.println(prox.isEmpty() ? "(ninguno)" : prox);
        System.out.println("Esperado: " + esperadoProxCambio
                + " -> " + (prox.equals(esperadoProxCambio) ? "OK" : "FALLO"));

        System.out.println("\n-- MostrarLista() (edad de mayor a menor) --");
        List<String> ordenada = lista.MostrarLista();
        if (ordenada.isEmpty()) {
            System.out.println("(lista vacía)");
        }
        for (String linea : ordenada) {
            System.out.println(linea);
        }

        System.out.println("\n-- CantProfesores() --");
        System.out.println(lista.CantProfesores());
    }
}
