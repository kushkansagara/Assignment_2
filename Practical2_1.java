/*
Name : Kansagara kush H. ID	: 21ce051.
Aim : Design a class named Circle containing following attributes and behavior.
•One double data field named radius. The default value is 1.
•A no-argument constructor that creates a default circle.
•A Single argument constructor that creates a Circle with the specified
radius.
•A method named getArea() that returns area of the Circle.
•A method named getPerimeter() that returns perimeter of it.
*/

import java.util.Scanner;

public class Practical2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        double d=sc.nextDouble();
        //Create an object of circle class.
        Circle c1=new Circle(d);
        //Calls the getArea method of circle class.
        System.out.println("Area of circle is "+c1.getArea());
        //Calls the getPerimeter method of circle class.
        System.out.println("Perimeter of circle is "+c1.getPerimeter());
    }
}
