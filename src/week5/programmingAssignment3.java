package week5;

import java.util.Scanner;
public class programmingAssignment3{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int i = scan.nextInt();
        int j;

        // Put the following code under try-catch block to handle exceptions
        try {
            switch (i) {
                case 0 -> {
                    int zero = 0;
                    j = 92 / zero;
                }
                case 1 -> {
                    int b[] = null;
                    j = b[0];
                }
                default -> System.out.println("No exception");
            }
        }
        catch(Exception f) {
            System.out.println(f);
        }
    }
}