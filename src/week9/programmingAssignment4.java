package week9;

import java.util.Scanner;

public class programmingAssignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the code : ");
        String input = sc.nextLine();
        char[] seq = input.toCharArray();

        int outflag = 0;

        // Start the mapping process for each input character
        for (int i = 0; i < seq.length; i++) {
            seq[i] = gui_map(seq[i]);
        }

        //Print Mapped GUI (remove comment to see the mapped sequence input)

        /*
        for(int i=0; i<seq.length; i++){
            System.out.print(seq[i]);
        }
        */

        // Use double type of values for entire calculation
        double operand1;
        String o1 = "";
        double operand2;
        StringBuilder o2 = new StringBuilder();
        double output = 0.0;

        // Perform calculaton operations
        outerloop:
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == '+' || seq[i] == '-' || seq[i] == '/' || seq[i] == 'X' || seq[i] == '=') {
                for (int j = 0; j < i; j++) {
                    o1 += Character.toString(seq[j]);
                }
                operand1 = Double.parseDouble(o1);
                for (int k = i + 1; k < seq.length; k++) {
                    if (seq[k] == '=') {
                        outflag = 1;
                        operand2 = Double.parseDouble(o2.toString());
                        if (seq[i] == '+') {
                            output = operand1 + operand2;
                        } else if (seq[i] == '-') {
                            output = operand1 - operand2;
                        } else if (seq[i] == '/') {
                            output = operand1 / operand2;
                        } else if (seq[i] == 'X') {
                            output = operand1 * operand2;
                        }
                        break outerloop;
                    } else {
                        o2.append(seq[k]);
                    }
                }
            }
        }

        // Check if output is available and print the output
        if (outflag == 1)
            System.out.print(output);
    }// The main() method ends here.

    // A method that takes a character as input and returns the corresponding GUI character
    static char gui_map(char in) {
        char out = 'N';// N = Null/Empty
        char[][] gm = {{'a', '.'}
                , {'b', '0'}
                , {'c', '='}
                , {'d', '+'}
                , {'e', '1'}
                , {'f', '2'}
                , {'g', '3'}
                , {'h', '-'}
                , {'i', '4'}
                , {'j', '5'}
                , {'k', '6'}
                , {'l', 'X'}
                , {'m', '7'}
                , {'n', '8'}
                , {'o', '9'}
                , {'p', '/'}};

        // Checking for maps
        for (char[] chars : gm) {
            if (chars[0] == in) {
                out = chars[1];
                break;
            }
        }
        return out;
    }
}