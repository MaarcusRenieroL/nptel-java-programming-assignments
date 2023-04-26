package week5;

//Prefixed Fixed Code:
import java.util.*;
public class programmingAssignment2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int length = sc.nextInt();

        // create an array to save user input
        int[] name = new int[length];

        int sum=0;//save the total sum of the array.

        //Define try-catch block to save user input in the array "name",if there is an exception then catch the exception otherwise print the total sum of the array.

        try {
            for(int i = 0;i < length;i++) {
                name[i] = sc.nextInt();
                sum = sum + name[i];
            }
            System.out.println("Sum of all the elements in the array is : " + sum);
        }
        catch(InputMismatchException e) {
            System.out.println("You entered bad data.");
        }
    }
}