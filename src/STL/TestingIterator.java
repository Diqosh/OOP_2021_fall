package STL;
import java.util.*;

public class TestingIterator {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("New Yourk");
        list.add("Atlanta");
        list.add("Dallas");
        list.add("Madison");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toUpperCase(Locale.ROOT) + " ");
        }
    }
}
