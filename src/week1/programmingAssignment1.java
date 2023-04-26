// Find the highest and average mark scored in 's' number of subjects

package week1;

import java.util.Scanner;

public class programmingAssignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s, sum = 0;

        System.out.print("Enter the number of subjects : ");
        s = input.nextInt();

        int[] sub_mark = new int[s];

        for (int i = 0; i < s; i++) {
            System.out.print("Enter the marks scored for subject : ");
            sub_mark[i] = input.nextInt();
            System.out.println();
        }

        for (int i = 0; i < s; i++) {
            sum += sub_mark[i];
        }

        double avg_mark = (double) sum / s;

        int max = sub_mark[0];

        for (int i = 0; i < s; i++) {
            if (sub_mark[i] > max) {
                max = sub_mark[i];
            }
        }

        System.out.println("Average mark scored : " + avg_mark);
        System.out.println("Maximum mark scored : " + max);
    }
}