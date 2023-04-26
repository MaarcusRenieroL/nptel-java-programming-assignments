package week2;

// This is the class named School
class School {
    // This is a method in class School
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
}
// This is the class named Student
class Student {
    // This is a method in class Student
    public void print() {
        System.out.println("Hi! I am class STUDENT");
    }
}

public class programmingAssignment1 {
    public static void main(String[] args){

        // Create an object of class Student

        School school_object = new School();

        // Call 'print()' method of class Student

        Student student_object = new Student();

        // Create an object of class School

        school_object.print();

        // Call 'print()' method of class School

        student_object.print();

    }
}
