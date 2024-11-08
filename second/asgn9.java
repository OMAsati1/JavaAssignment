package Assgn.second;

import java.util.Scanner;

// General class representing a 3D object
abstract class ThreeDObject {
    // Abstract methods to be implemented in derived classes
    abstract double wholeSurfaceArea();
    abstract double volume();
}

// Derived class representing a Box
class Box extends ThreeDObject {
    double length, width, height;

    // Constructor to initialize dimensions
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate surface area of the box
    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    // Method to calculate volume of the box
    @Override
    double volume() {
        return length * width * height;
    }
}

// Derived class representing a Cube
class Cube extends ThreeDObject {
    double side;

    // Constructor to initialize side length
    public Cube(double side) {
        this.side = side;
    }

    // Method to calculate surface area of the cube
    @Override
    double wholeSurfaceArea() {
        return 6 * (side * side);
    }

    // Method to calculate volume of the cube
    @Override
    double volume() {
        return side * side * side;
    }
}

// Derived class representing a Cylinder
class Cylinder extends ThreeDObject {
    double radius, height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate surface area of the cylinder
    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate volume of the cylinder
    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Derived class representing a Cone
class Cone extends ThreeDObject {
    double radius, height;

    // Constructor to initialize radius and height
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate surface area of the cone
    @Override
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    // Method to calculate volume of the cone
    @Override
    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

// Main class to test the implementation
public class asgn9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test Box
        System.out.print("Enter length, width, and height of the box: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Test Cube
        System.out.print("Enter the side of the cube: ");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Test Cylinder
        System.out.print("Enter radius and height of the cylinder: ");
        double radius = sc.nextDouble();
        height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Test Cone
        System.out.print("Enter radius and height of the cone: ");
        radius = sc.nextDouble();
        height = sc.nextDouble();
        Cone cone = new Cone(radius, height);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        sc.close();
    }
}

