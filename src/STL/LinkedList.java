package STL;
import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        arrayList.add(0, 10);
        arrayList.add(3, 30);

        System.out.println(arrayList); //adding


    }
}
