import java.util.ArrayList;
public class ArrayListEjemplo
{
    public static void main(String[] args) throws Exception
    {
        //Declaracion de un ArrayList de "String"
        ArrayList<String> miArrayList=new ArrayList<String>();
        //Adiciona el Dato al ArrayList
        miArrayList.add("Dato");
        //Adiciona el dato en la posicion 1
        miArrayList.add(1,"Dato 2");
        //Devuelve el dato de la posicion 1
        miArrayList.get(1);
        //numero de datos del arrayList
        System.out.println(miArrayList.size());
        //verificar si existe el dato
        miArrayList.contains("Dato");
        //Devuelve la posicion de la primera ocurrencia del dato
        miArrayList.indexOf("Dato");
        //Devuelve la posicion de la ultima ocurrencia del dato
        miArrayList.lastIndexOf("Dato");
        //Elimina el dato de la posicion 0
        //miArrayList.remove(5);
        //Elimina la primera ocurrencia del dato
        miArrayList.remove("Dato");
        //Elimina Dato
        miArrayList.clear();
        //True si el arrayList esta vacio. caso contrario devuelve False
        miArrayList.isEmpty();
        //Copiar un Arraylist
        ArrayList arrayListCopia=(ArrayList) miArrayList.clone();
        //Pasa el ArrayList a un Array
        Object[] array=miArrayList.toArray();
    }
}