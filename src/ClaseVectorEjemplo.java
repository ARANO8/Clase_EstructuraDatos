import java.util.Vector;
public class ClaseVectorEjemplo {
    public static void main(String[] args) {
        System.out.println("==================CLASE VECTOR==========");
        System.out.println("Vector creado ...");
        Vector<String> miVector=new Vector<String>();
        System.out.println(miVector);
        //adiciona elementos
        System.out.println("Adicion de elementos al vector");
        miVector.add("Alan");
        miVector.add("Ruben");
        miVector.add("Marcos");
        System.out.println(miVector);
        //adiciona elementos en la posicion 1
        System.out.println("adiciona el elemento 'Ana' en la posicion 1");
        miVector.add(1,"Ana");
        System.out.println(miVector);
        //elimina el elemento de la posicion 0
        System.out.println("elimina el elemento de la posicion 0");
        miVector.remove(0);
        System.out.println(miVector);
        //elimina el elemento "Marcos"
        System.out.println("elimina el elemento 'Marcos'");
        miVector.remove("Marcos");
        System.out.println(miVector);
        //imprime el tamanio del vector
        System.out.println("imprime el tamanio del vector");
        System.out.println(miVector.size());
        //true su "Ana" esta en el vector
        System.out.println("devuelve true si 'Ana' esta en el vector");
        System.out.println(miVector.contains("Ana"));
        //obtiene el elemento de la posicion 1
        System.out.println("obtiene el elemento de la posicion 1");
        System.out.println(miVector.get(1));
        //borra el contenido del vector
        System.out.println("Contenido del vector borrado ...");
        miVector.clear();
        System.out.println(miVector);
        //true si el vector es vacio
        System.out.println("devuelve true si el vector es vacio");
        System.out.println(miVector.isEmpty());

    }
}
