import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[]{1,2,3,4,55,6,7,8,9,10};
        int[] c = new int[50];
        //ESTOS SON ALGUNOS EJERCICIOS CON ARRAYS
        //USANDO METODOS

        //usando el metodo equals de la clase Arrays
        System.out.println(Arrays.equals(a,b));
        //usando el metodo copyOf de la clase Arrays
        c=Arrays.copyOf(a,5);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        //usando el metodo fill de la clase Arrays
        Arrays.fill(c,7);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        //usando el metodo fill de la clase Arrays
        System.out.println("\n");
        Arrays.fill(c,2,5,6);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]+" ");         
        }
        //usando el metodo binarySearch (busqueda binaria)de la clase Arrays
        System.out.println("-->"+Arrays.binarySearch( a, 18));
        //Usando el metodo Sort de la clase Arrays
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
        
    }
}
