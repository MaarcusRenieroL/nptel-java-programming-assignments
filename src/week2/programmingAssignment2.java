package week2;

// This is the class named Printer
class Printer {
    // This are the methods in class Printer
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
    public void print(String s) {
        System.out.println(s);
    }
}

public class programmingAssignment2{
    public static void main(String[] args) {

        // Create an object of class Printer

        Printer printer_object = new Printer();

        // Call 'print()' methods for desired output

        printer_object.print();
        printer_object.print("Hi! I am class STUDENT");
    }
}