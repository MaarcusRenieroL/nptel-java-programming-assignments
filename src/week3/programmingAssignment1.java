package week3;

import java.util.Scanner;

public class programmingAssignment1 extends Point{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();

        System.out.print("Enter the x1 co-ordinate : ");
        p1.x = sc.nextDouble();
        System.out.print("Enter the y1 co-ordinate : ");
        p1.y = sc.nextDouble();

        Point p2 = new Point();

        System.out.print("Enter the x2 co-ordinate : ");
        p2.x = sc.nextDouble();
        System.out.print("Enter the y2 co-ordinate : ");
        p2.y = sc.nextDouble();

        distance(p1,p2);

    }

}

class Point{
    double x;
    double y;

    public static void distance(Point p1,Point p2){
        double d;
        d=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
        System.out.println(d);
    }
}