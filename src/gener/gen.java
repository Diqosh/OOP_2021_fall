
package gener;
import java.util.ArrayList;

public class gen {
    public static void main(String[] args) {

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("text");
        list2.add("text2");
        print(list2);
    }

    public static <E> void print(ArrayList<E> list){
        for (E i : list){
            System.out.println(i);
        }
    }

}
