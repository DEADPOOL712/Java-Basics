package ErrorHandaling;

import java.util.Scanner;

// Exception
public class Main {
    public static void main(String args[]) {

        // ? ---- try catch syntax

        // int a = 999;
        // int b = 0;
        // try {
        // int c = a / b;
        // System.out.println("The result : " + c);
        // } catch (Exception e) {
        // System.out.println("Exception occur : " + e);
        // }

        // ? ---- handaling specific execption

        // Scanner sc = new Scanner(System.in);
        // int marks[] = new int[3];
        // marks[0] = 999;
        // marks[1] = 419;
        // marks[2] = 598;

        // System.out.print("Enter the index of array : ");
        // int index = sc.nextInt();

        // System.out.print("Enter the value of devider : ");
        // int devider = sc.nextInt();

        // try {
        // System.out.println("The result of devising : " + marks[index] / devider);
        // } catch (ArithmeticException e) {
        // System.out.println("**** ArithmeticException occur !");
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("**** Array index out of Execption !");
        // } catch (Exception e) {
        // System.out.println("**** other Exception occur ");
        // }

        // System.out.println("End of the program");

        // ? Nested try catch block
        // use to hanlde inner error internally
        // syntax
        try {
            // The main try catch block
            try {
                // try something
            } catch (ArithmeticException e) {
                // handling specific exception inside try
            }
        } catch (Exception e) {
            // The main Exception block
        }
    }
}
