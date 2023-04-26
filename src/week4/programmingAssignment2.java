package week4;

import java.util.Calendar;

// The following is the declaration of the main class named Question42
public class programmingAssignment2 {
    public static void main(String[] args){
        int year; // integer type variable to store year

        // Create an object of Calendar class.
        java.util.Calendar current;

        // Use getInstance() method to initialize the Calendar object.
        current = java.util.Calendar.getInstance();

        // Initialize the int variable year with the current year
        year = current.get(Calendar.YEAR);


        // Print the current Year
        System.out.println("Current Year: "+year);
    }
}