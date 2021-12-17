package STL;
import java.util.*;
public class SetTest {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");

        System.out.println("set1 is" + set1);

        Set<String> set2 = new HashSet<>();
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
//
//        System.out.println(set2.contains("Paris"));
        System.out.println(set2);
        set1.addAll(set2);
        System.out.println(set1);

//        set1.removeAll(set2);
//        System.out.println(set1);

        set1.retainAll(set2);
        System.out.println(set1);



    }
}
