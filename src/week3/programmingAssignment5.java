package week3;

import java.util.Scanner;
class Shape{
    double length, breadth;
    Shape(double l, double b){ //Constructor to initialize a Shape object
        length = l;
        breadth= b;
    }
    Shape(double len){    //Constructor to initialize another Shape object
        length = breadth = len;
    }
    double calculate(){// To calculate the area of a shape object
        return length * breadth ;
    }
}
public class programmingAssignment5 extends Shape{

    //Template code:
    double height;
    programmingAssignment5(double length,double h) {
//base class constructor with one parameter is called
        super(length);
        height = h;
    }

    programmingAssignment5(double length,double breadth,double h) {
//base class constructor having two argument is called
        super(length,breadth);
        height = h;
    }

    double calculate()	{
        return length*breadth*height;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);//Create an object to read
        //input

        System.out.print("Enter the length : ");
        double l = sc.nextDouble(); //Read length

        System.out.print("Enter the breadth : ");
        double b = sc.nextDouble(); //Read breadth

        System.out.print("Enter the height : ");
        double h = sc.nextDouble(); //Read height


        programmingAssignment5 myshape1 = new programmingAssignment5(l,h);
        programmingAssignment5 myshape2 = new programmingAssignment5(l,b,h);

        double volume1;
        double volume2;

        volume1 = myshape1.calculate();
        volume2 = myshape2.calculate();

        System.out.println("Volume of shape 1" + volume1);
        System.out.println("Volume of shape 2" + volume2);
    }
}