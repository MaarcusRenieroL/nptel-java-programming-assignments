// To check whether the number is an armstrong number or not

package week1;

import java.util.Scanner;

public class programmingAssignment4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt(), sum = 0;

        String s = Integer.toString(number);

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }

        if (sum == number) {
            System.out.println("The number is an armstrong number");
        } else {
            System.out.println("The number is not an armstrong number");
        }

    }
}
