import java.util.ArrayList;
public class ArrayListEjemplo
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("==================CLASE ARRAYLIST================");

        System.out.println("Array list creado ...");
        //Declaracion de un ArrayList de "String"
        ArrayList<String> miArrayList=new ArrayList<String>();
        System.out.println(miArrayList);
        //Adiciona el Dato al ArrayList
        System.out.println("Adiciona el elemento 'Dato' al ArrayList");
        miArrayList.add("Dato");
        System.out.println(miArrayList);
        //Adiciona el dato en la posicion 1
        System.out.println("Adiciona el dato 'Dato 2' en la posicion 1");
        miArrayList.add(1,"Dato 2");
        System.out.println(miArrayList);
        //Devuelve el dato de la posicion 1
        System.out.println("Devuelve el dato de la posicion 1");
        System.out.println(miArrayList.get(1));
        //numero de datos del arrayList
        System.out.println("numero de datos del arrayList:");
        System.out.println(miArrayList.size());
        //verificar si existe el dato
        System.out.println("verificar si existe el dato 'Dato':");
        System.out.println(miArrayList.contains("Dato"));
        //Devuelve la posicion de la primera ocurrencia del dato
        System.out.println("Devuelve la posicion de la primera ocurrencia del dato 'Dato':");
        System.out.println(miArrayList.indexOf("Dato"));
        //Devuelve la posicion de la ultima ocurrencia del dato
        System.out.println("Devuelve la posicion de la ultima ocurrencia del dato 'Dato':");
        System.out.println(miArrayList.lastIndexOf("Dato"));
        //Elimina el dato de la posicion 0
        System.out.println("dato de la posicion 0 eliminado");
        miArrayList.remove(0);
        System.out.println(miArrayList);
        //Elimina la primera ocurrencia del dato
        System.out.println("primera ocurrencia del dato 'Dato' eliminado");
        miArrayList.remove("Dato");
        System.out.println(miArrayList);
        //Elimina todo
        System.out.println("ArrayList eliminado ..");
        miArrayList.clear();
        System.out.println(miArrayList);
        //True si el arrayList esta vacio. caso contrario devuelve False
        System.out.println("True si el arrayList esta vacio. caso contrario devuelve False:");
        System.out.println(miArrayList.isEmpty());
        //Copiar un Arraylist
        ArrayList arrayListCopia=(ArrayList) miArrayList.clone();
        //Pasa el ArrayList a un Array
        Object[] array=miArrayList.toArray();
    }
}