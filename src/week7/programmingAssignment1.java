package week7;

import java.util.*;
public class programmingAssignment1 {
    public static void main(String[] args) {
        try{
            byte[] barr ={'N','P','T','E','L','-','J','A','V','A','J','A','N','-','N','O','C','C','S','E'};
            Scanner inr = new Scanner(System.in);

            System.out.print("Enter the index : ");
            int n = inr.nextInt();

            String s2 = new String(barr,n,1);

            System.out.println("ASCII Value : " + barr[n]);
            System.out.println("Value : " + s2);
        }
        catch (Exception e){
            System.out.println("exception occur");
        }
    }
}