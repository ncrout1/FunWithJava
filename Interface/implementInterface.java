interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        System.out.println("Area of circle");
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        System.out.println("perimeter of circle");
        return 2 * Math.PI * radius;
    }
    public static void main(String args[])
    {
        System.out.println("Hello Narsingh");
    }
}