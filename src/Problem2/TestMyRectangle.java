package Problem2;
import Problem1.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        System.out.println("\n        Testing MyRectangle Class");

        // Create a new MyRectangle object
        MyRectangle rectangle = new MyRectangle(1, 1, 5, 5);

        // Test get methods
        System.out.println("\n    Test getter methods");
        System.out.println("Top-left point: " + rectangle.getTopLeft().toString());
        System.out.println("Bottom-right point: " + rectangle.getBottomRight().toString());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Diagonal length: " + rectangle.getDiagonalLength());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Test setTopLeft and setBottomRight methods
        System.out.println("\n    Test setter methods");
        MyPoint newTopLeft = new MyPoint(2, 2);
        MyPoint newBottomRight = new MyPoint(6, 6);
        rectangle.setTopLeft(newTopLeft);
        rectangle.setBottomRight(newBottomRight);
        System.out.println("New top-left point: " + rectangle.getTopLeft().toString());
        System.out.println("New bottom-right point: " + rectangle.getBottomRight().toString());
        rectangle.setTopLeft(3, 3);
        rectangle.setBottomRight(7, 7);
        System.out.println("New top-left point: " + rectangle.getTopLeft().toString());
        System.out.println("New bottom-right point: " + rectangle.getBottomRight().toString());

        // Test setWidth and setHeight methods
        System.out.println("\n    Test setWidth and setHeight");
        rectangle.setWidth(4);
        rectangle.setHeight(4);
        System.out.println("New width: " + rectangle.getWidth());
        System.out.println("New height: " + rectangle.getHeight());

        // Test toString method
        System.out.println("\n    Test toString");
        System.out.println(rectangle.toString());
    }
}