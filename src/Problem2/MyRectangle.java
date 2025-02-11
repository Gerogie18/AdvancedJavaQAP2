package Problem2;
import Problem1.MyPoint;
import Problem1.MyLine;

public class MyRectangle {
    //Attributes
    private MyPoint topLeft;
    private MyPoint bottomRight;

    //constructors
    // Default constructor
    public MyRectangle() {
        this.topLeft = new MyPoint(0, 0);
        this.bottomRight = new MyPoint(1, 1);
    }

    // Constructor with individual coordinates
    public MyRectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        if (topLeftX > bottomRightX || topLeftY > bottomRightY) {
            throw new IllegalArgumentException("Invalid rectangle coordinates");
        }
        this.topLeft = new MyPoint(topLeftX, topLeftY);
        this.bottomRight = new MyPoint(bottomRightX, bottomRightY);
    }

    // Constructor with MyPoint objects
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        if (topLeft.getX() > bottomRight.getX() || topLeft.getY() > bottomRight.getY()) {
            throw new IllegalArgumentException("Invalid rectangle coordinates");
        }
        this.topLeft = new MyPoint(topLeft);
        this.bottomRight = new MyPoint(bottomRight);
    }

    //getters
    public MyPoint getTopLeft () {
        return topLeft;
    }
    public MyPoint getBottomRight() {
        return bottomRight;
    }
    public double getWidth() {
        return Math.abs(topLeft.distance(new MyPoint(bottomRight.getX(), topLeft.getY())));
    }
    public double getHeight() {
        return Math.abs(topLeft.distance(new MyPoint(topLeft.getX(), bottomRight.getY())));
    }
    public double getDiagonalLength () {
        return new MyLine(topLeft, bottomRight).getLength();
    }
    public double getArea () {
        return getWidth()*getHeight();
    }
    public double getPerimeter () {
        return (getHeight()*2)+(getWidth()*2);
    }

    //setters
    //topLeft
    public void setTopLeft(MyPoint topLeft) {
        if (topLeft.getX() > bottomRight.getX() || topLeft.getY() > bottomRight.getY()) {
            throw new IllegalArgumentException("New top-left point would result in invalid rectangle");
        }
        this.topLeft = topLeft;
    }
    public void setTopLeft(int x, int y) {
        if (x > bottomRight.getX() || y > bottomRight.getY()) {
            throw new IllegalArgumentException("New top-left point would result in invalid rectangle");
        }
        this.topLeft = new MyPoint(x, y);
    }
    //bottomRight
    public void setBottomRight(MyPoint bottomRight) {
        if (bottomRight.getX() < topLeft.getX() || bottomRight.getY() < topLeft.getY()) {
            throw new IllegalArgumentException("New bottom-right point would result in invalid rectangle");
        }
        this.bottomRight = bottomRight;
    }
    public void setBottomRight(int x, int y) {
        if (x < topLeft.getX() || y < topLeft.getY()) {
            throw new IllegalArgumentException("New bottom-right point would result in invalid rectangle");
        }
        this.bottomRight = new MyPoint(x, y); // Corrected here
    }

    public void setWidth(int width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width cannot be negative");
        }
        int newX = topLeft.getX() + width;
        if (newX < topLeft.getX()) {
            throw new IllegalArgumentException("New width would result in invalid coordinates");
        }
        bottomRight.setX(newX);
    }

    public void setHeight(int height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        int newY = topLeft.getY() + height;
        if (newY < topLeft.getY()) {
            throw new IllegalArgumentException("New height would result in invalid coordinates");
        }
        bottomRight.setY(newY);
    }


    // Returns a string representation of the rectangle
    @Override
    public String toString() {
        return """
        MyRectangle[
            Corners:     (%d, %d), (%d, %d), (%d, %d), (%d, %d)
            topLeft:     (%d, %d)
            bottomRight: (%d, %d)
        ]
        """.formatted(
                topLeft.getX(), topLeft.getY(),
                bottomRight.getX(), topLeft.getY(),
                bottomRight.getX(), bottomRight.getY(),
                topLeft.getX(), bottomRight.getY(),
                topLeft.getX(), topLeft.getY(),
                bottomRight.getX(), bottomRight.getY());
    }
}
