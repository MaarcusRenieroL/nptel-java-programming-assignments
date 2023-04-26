package week2;

// This is the main class Question
public class programmingAssignment3{
    public static void main(String[] args) {
        // Object of the main class is created
        programmingAssignment3 q = new programmingAssignment3();
        // Print method on object of Question class is called
        q.student();
    }

    // 'print()' method is defined in class Question
    void print(programmingAssignment3 object){
        System.out.print("Well Done!");
    }

    // 'studentMethod()' method is defined in class Question23
    void student(){
        // Calling a method named 'print()' in class Question23
        print(this);
    }

}
