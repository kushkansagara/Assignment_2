/*
Name : Kansagara Kush H.
Id	: 21ce051
Aim : Develop a Program that illustrate method overloading concept.
*/
class Practical2_5
{
    void average(int a, int b)
    {
        // here we have three functions.
        // one is taking two args and another is taking only one args.
        // methods like these having same name and different args is knows a method overloading.

        float avg;
        avg = (a + b) / 2;
        System.out.println("The average of the numbers is :" + avg);
    }
    void average(float a, float b) {
        float avg;
        avg = (a + b) / 2;
        System.out.println("The average of the numbers is :" + avg);
    }
    void average(Double a, Double b) {
        double avg;
        avg = (a + b) / 2;
        System.out.println("The average of the numbers is :" + avg);
    }
}