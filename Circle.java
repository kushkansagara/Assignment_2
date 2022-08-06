
/*
Name : Kansagara kush H. ID	: 21ce051.
Aim : Design a class named Circle containing following attributes and behavior.
•One double data field named radius. The default value is 1.
•A no-argument constructor that creates a default circle.
•A Single argument constructor that creates a Circle with the specified
radius.
•A method named getArea() that returns area of the Circle.
•A method named getPerimeter() that returns perimeter of it.
*/class Circle
{
    public double radius=1;
    //Default constructor for default value of the radius.
    public Circle(){
        radius=1;
    }
    //Parameterized constructor to assign the value of the radius.
    public Circle(double radius) {
        this.radius = radius;
    }
    //Method to calculate the area of the circle.
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    //Method to calculate the perimeter of the circle.
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}
