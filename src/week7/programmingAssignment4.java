package week7;

import java.util.*;
public class programmingAssignment4{
    public static void main (String[] args){

        int i, n = 0, sum = 0;

        Scanner inr = new Scanner(System.in);

        for (i = 0;i < 3;i++) {

            System.out.print("Enter a number : ");
            n = inr.nextInt();

            sum += n;
        }

        System.out.println("Sum of three numbers is : " + sum);
    }
}