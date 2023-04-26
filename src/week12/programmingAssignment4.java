package week12;

class Parent {
    public static void testClassMethod() {
        System.out.println("The static method.");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method.");
    }
}

public class programmingAssignment4 extends Parent {
    public static void testClassMethod() {
    }

    public static void main(String[] args) {

        // Call the instance method in the Parent class
        programmingAssignment4 C = new programmingAssignment4();
        C.testInstanceMethod();

        // Call the static method in the Parent class
        Parent.testClassMethod();
    }
}