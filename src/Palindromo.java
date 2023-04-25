import java.util.Collections;
import java.util.Vector;
public class Palindromo {
    public static void main(String[] args) {
        Vector<String> a = new Vector<String>();
        a.add("");
        a.add("a");
        a.add("b");
        for (int i = 0; i < 50; i++) {
            String cad=a.get(i);
            a.add("a"+cad+"b");
            a.add("b"+cad+"a");
        }
        Collections.sort(a);
        for (String elem : a) {
            System.out.println(elem);
        }
        System.out.println(a.get(0));
        System.out.println(a.get(2));
        System.out.println(a.get(4));
        System.out.println(a.get(8));
        System.out.println(a.get(52));
    }
}
