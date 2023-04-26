package week7;

import java.io.*;
public class programmingAssignment5 {
    public static void main(String[] args){
        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);

            System.out.print("Enter a number : ");
            String number = br.readLine();

            int x = Integer.parseInt(number);
            System.out.println(x*x);
        }
        catch (Exception e){
            System.out.println("Please enter valid data");
        }
    }
}