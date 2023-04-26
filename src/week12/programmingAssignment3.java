package week12;

import java.util.*;

public class programmingAssignment3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        //Read your first name in string
        String fname = s1.next();

        //Read  your last name in string
        String lname = s1.next();

        //Read  rollnumber in integer
        int rno = s1.nextInt();

        //Read  1st subject mark in float
        double m1 = s1.nextDouble();

        //Read  2nd subject mark in float
        double m2 = s1.nextDouble();

        // find the avg mark in the subject
        double avg = (m1 + m2) / 2;

        //Print the record in the format: name+" "+rollnumber+" "+avg_mark
        System.out.println(fname + lname + " " + rno + " " + avg);
    }
}