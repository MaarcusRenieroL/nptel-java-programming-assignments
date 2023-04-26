package week3;

import java.util.Scanner;

class QuestionScope {
    int sum(int a, int b){ //non-static method
        return a + b;
    }
    static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class programmingAssignment2{
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();

        QuestionScope st = new QuestionScope(); // Create an object to call non-

        //static method
        int result1 = st.sum(n1,n2); // Call the method

        int result2 = QuestionScope.multiply(n1,n2);    // Create an object to call
        //static method

        System.out.println("Sum of two numbers : " + result1);
        System.out.println("Product of two numbers : " + result2);

    }
}