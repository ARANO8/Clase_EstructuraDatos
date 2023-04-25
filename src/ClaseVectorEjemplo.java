import java.util.Vector;
public class ClaseVectorEjemplo {
    public static void main(String[] args) {
        Vector<String> miVector=new Vector<String>();
        //adiciona elementos
        miVector.add("Alan");
        miVector.add("Ruben");
        miVector.add("Marcos");
        //adiciona elementos en la posicion 1
        miVector.add(1,"Ana");
        //elimina el elemento de la posicion 0
        miVector.remove(0);
        //elimina el elemento "Marcos"
        miVector.remove("Marcos");
        //imprime el tamanio del vector
        System.out.println(miVector.size());
        //true su "Ana" esta en el vector
        miVector.contains("Ana");
        //obtiene el elemento de la posicion 1
        System.out.println(miVector.get(1));
        //borra el contenido del vector
        miVector.clear();
        //true si el vector es vacio
        miVector.isEmpty();

    }
}
