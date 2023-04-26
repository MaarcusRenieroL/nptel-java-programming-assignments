// Find the perimeter and area of a circle

package week1;

import java.util.Scanner;
import java.math.*;

public class programmingAssignment3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double radius = input.nextDouble();

        System.out.print("Perimeter of circle is : ");
        System.out.println(2 * Math.PI * radius);

        System.out.print("Area of circle is : ");
        System.out.println(Math.PI * radius * radius);

    }
}
