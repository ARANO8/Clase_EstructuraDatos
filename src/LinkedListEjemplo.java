import java.util.LinkedList;

public class LinkedListEjemplo {
    public static void main(String[] args) {
        LinkedList<String> miLista1 = new LinkedList<String>();
        // adiciona elementos
        miLista1.add("Alan");
        miLista1.add("Ruben");
        miLista1.add("Marcos");
        // adiciona elmento en la posicion 1
        miLista1.add(1, "Ana");
        // elimina el elemento de la posicion 0
        miLista1.remove(0);
        // elimina el elemento "Marcos"
        miLista1.remove("Marcos");
        // imprime el tamanio de la lista
        System.out.println(miLista1.size());
        // true si "Ana" esta en la lista
        miLista1.contains("Ana");
        // obtiene el elemento de la posicion 1
        System.out.println(miLista1.get(1));
        // borra el contenido de la lista
        miLista1.clear();
        // true si la lista es vacia
        miLista1.isEmpty();
    }
}
