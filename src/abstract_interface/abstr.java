package abstract_interface;

import java.util.Date;


public class abstr {
    public static void main(String[] args) {

        GeometricObject obj = new Circle(4, "yellow", true);
        System.out.println(obj.toString());

    }
}
