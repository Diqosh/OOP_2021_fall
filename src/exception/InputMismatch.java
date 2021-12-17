package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;



public class InputMismatch {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("C:\\Users\\tleuz\\IdeaProjects\\untitled1\\src\\exception\\inpu1t.txt"));
        } catch (FileNotFoundException e) {
            System.out.println();
        }



    }


}
