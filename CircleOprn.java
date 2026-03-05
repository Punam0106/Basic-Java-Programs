public class CircleOprn {

    public static void main(String[] args) {

        double radius = 7.5;

        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        System.out.println("Radius = " + radius);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);

    }

    static double calculateCircumference(double r)
    {
        return 2 * Math.PI * r;
    }

    static double calculateArea(double r)
    {
        return Math.PI * r * r;
    }

}