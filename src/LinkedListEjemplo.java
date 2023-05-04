import java.util.LinkedList;

public class LinkedListEjemplo {
    public static void main(String[] args) {
        System.out.println("===============CLASE LINKEDLIST==========");
        System.out.println("Linked list creado ...");
        LinkedList<String> miLista1 = new LinkedList<String>();
        System.out.println(miLista1);
        // adiciona elementos
        System.out.println("Adicion de elementos al linkedlist");
        miLista1.add("Alan");
        miLista1.add("Ruben");
        miLista1.add("Marcos");
        System.out.println(miLista1);
        // adiciona elmento en la posicion 1
        System.out.println("adiciona el elemento 'Ana' en la posicion 1");
        miLista1.add(1, "Ana");
        System.out.println(miLista1);
        // elimina el elemento de la posicion 0
        System.out.println("Elemento de la posicion 0 eliminado");
        miLista1.remove(0);
        System.out.println(miLista1);
        // elimina el elemento "Marcos"
        System.out.println("elemento 'Marcos' eliminado");
        miLista1.remove("Marcos");
        System.out.println(miLista1);
        // imprime el tamanio de la lista
        System.out.println("imprime el tamanio de la lista");
        System.out.println(miLista1.size());
        // true si "Ana" esta en la lista
        System.out.println("regresa true si 'Ana' esta en la lista");
        System.out.println(miLista1.contains("Ana"));
        // obtiene el elemento de la posicion 1
        System.out.println("obtiene el elemento de la posicion 1:");
        System.out.println(miLista1.get(1));
        // borra el contenido de la lista
        System.out.println("Lista eliminada...");
        miLista1.clear();
        // true si la lista es vacia
        System.out.println("regresa true si la lista es vacia:");
        System.out.println(miLista1.isEmpty());
    }
}
