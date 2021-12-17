package exception;
import java.util.Scanner;

public class ArithmeticExep {

    public  static int quotient(int number1, int number2){
        if(number2 == 0 ){
            throw new ArithmeticException("Divisor cannot be zero");
        }

        return number1/number2;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {

            int ans = quotient(number1, number2);
            System.out.println(ans);

        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}
