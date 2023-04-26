package week9;

import java.util.Scanner;

public class programmingAssignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Declaring 5x5 2D char array to store input
        char[][] original = new char[5][5];

        // Declaring 5x5 2D char array to store reflection
        char[][] reflection = new char[5][5];

        // Input 2D Array using Scanner Class
        for (int line = 0; line < 5; line++) {

            System.out.print("Enter 5 characters ( X or O only ) : ");
            String input = sc.nextLine();
            char[] seq = input.toCharArray();

            if (seq.length == 5) {
                for (int i = 0; i < 5; i++) {
                    original[line][i] = seq[i];
                }
            }
        }

        // Performing the reflection operation
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                reflection[i][j] = original[i][4 - j];
            }
        }

        // Output the 2D Reflection Array

        System.out.println("Flip flopped");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(reflection[i][j]);
            }
            System.out.println();
        }
    }

}
