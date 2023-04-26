// Find the sum of numbers that are even and divisible by 3

package week1;

import java.util.Scanner;

public class programmingAssignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt(), sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if ( i % 3 == 0) {
                    sum += i;
                }
            }
        }

        System.out.print("Sum of all numbers divisible by 3 is : ");
        System.out.println(sum);

    }
}
