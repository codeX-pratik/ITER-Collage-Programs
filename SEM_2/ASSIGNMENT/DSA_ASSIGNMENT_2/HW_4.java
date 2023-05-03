class PointType {
    double x , y;
    PointType(double x , double y) {
        this.x = x;
        this.y = y;
    }
    void setPoint(double x , double y) {
        this.x = x;
        this.y = y;
    }
    void displayCoordinates() {
        System.out.println("Coordinates are : " + "( " + x + " , " + y + " )");
    }
    double getx() {
        return x;
    }
    double gety() {
        return y;
    }
}

class CircleType extends PointType {
    double radius;
    CircleType(double x, double y, double r) {
        super(x, y);
        this.radius = r;
    }
    void setRadius(double r) {
        this.radius = r;
    }
    void displayRadius() {
        System.out.println("Radius : " + radius);
    }
    void circleCircumference() {
        double p = 2 * Math.PI * radius;
        System.out.println("The Circumference of the Circle : " + p);
    }
    void circleArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the Circle : " + area);
    }
}

public class HW_4 {
    public static void main(String[] args) {
        CircleType c = new CircleType(2, 2, 4);
        System.out.println("---> Center Point : ");
        c.displayCoordinates();//for printing the x and y coordinate

        c.displayRadius();//display the radius

        c.setPoint(7, 8);//setting new x and y coordinate

        c.setRadius(10);//setting new radius

        System.out.println("---> New center Point : ");
        c.displayCoordinates();//displaying the new x and y coordinates

        c.displayRadius();//displaying the new radius

        c.circleCircumference();//displaying the circumference using the new radius

        c.circleArea();//displaying the area using the new radius
    }
}
