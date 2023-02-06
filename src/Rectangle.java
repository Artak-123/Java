public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double calculateArea(int i){
        return length * width;
    }
    public double calculatePerimeter(int i){
        return 2 * (length + width);
    }
    public void area(){
        System.out.println(" The rectangle perimeters are " + width + " plus " + length);
    }
}
class rectanglePerimeter{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(-10,-10);
        rectangle.calculateArea(100);
        rectangle.calculatePerimeter(50);
        double area = rectangle.calculateArea(20);
        double perimeter = rectangle.calculatePerimeter(20);
        rectangle.area();
    }
}