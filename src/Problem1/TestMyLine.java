package Problem1;

public class TestMyLine {
    public static void main(String[] args) {
        System.out.println("\n        Testing Myline Class");

        // Create a new MyLine object
        MyLine line = new MyLine(1, 2, 3, 4);

        // Test get methods
        System.out.println("\n    Test getter methods");
        System.out.println("Begin point: " + line.getBegin().toString());
        System.out.println("End point: " + line.getEnd().toString());
        System.out.println("Begin x-coordinate: " + line.getBeginX());
        System.out.println("Begin y-coordinate: " + line.getBeginY());
        System.out.println("End x-coordinate: " + line.getEndX());
        System.out.println("End y-coordinate: " + line.getEndY());

        // Test setBegin and setEnd methods
        System.out.println("\n    Test setter methods");
        MyPoint newBegin = new MyPoint(5, 6);
        MyPoint newEnd = new MyPoint(7, 8);
        line.setBegin(newBegin);
        line.setEnd(newEnd);
        System.out.println("New begin point: " + line.getBegin().toString());
        System.out.println("New end point: " + line.getEnd().toString());
        line.setBeginX(9);
        line.setBeginY(10);
        line.setEndX(11);
        line.setEndY(12);
        System.out.println("New begin x-coordinate: " + line.getBeginX());
        System.out.println("New begin y-coordinate: " + line.getBeginY());
        System.out.println("New end x-coordinate: " + line.getEndX());
        System.out.println("New end y-coordinate: " + line.getEndY());

        // Test getLength method
        System.out.println("\n    Test getLength");
        System.out.println("Length of the line: " + line.getLength());

        // Test getGradient method
        System.out.println("\n    Test getGradiant");
        System.out.println("Gradient of the line: " + line.getGradient());

        // Test toString method
        System.out.println("\n    Test toString");
        System.out.println(line.toString());
    }
}