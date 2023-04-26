// largest of three numbers

package week1;

import java.util.Scanner;

public class programmingAssignment5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b && a > c) {
            System.out.printf("%d is the greatest number%n", a);
        } else if (b > a && b > c) {
            System.out.printf("%d is the greatest number%n", b);
        } else {
            System.out.printf("%d is the greatest number%n", c);
        }
    }
}
