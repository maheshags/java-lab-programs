import java.util.*;
abstract class Shape {
    Scanner input=new Scanner(System.in);
    double dim1;
    double dim2;
    abstract double area();
}


class Rectangle extends Shape {

   
     Rectangle() {
    System.out.println("Enter the length and breadth for the rectangle");
     dim1=input.nextDouble();
     dim2=input.nextDouble();
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}


class Triangle extends Shape {

   
     Triangle() {
    System.out.println("Enter the height and base for the triangle");
     dim1=input.nextDouble();
     dim2=input.nextDouble();
    }

    @Override
    double area() {
        return 0.5 * dim2 * dim2;
    }
}


class Circle extends Shape {

   
     Circle() {
    System.out.println("Enter the radius for the circle");
     dim1=input.nextDouble();
    
    }

    @Override
    double area() {
        return 3.5*dim1*dim1;
    }
}


public class Main3 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape circle = new Circle();

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
