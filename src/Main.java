public class Main {
    public static void main(String[] args) {
        Circle newCircle = new Circle(4);
        System.out.println(newCircle.getArea());
        System.out.println(newCircle.getPerimeter());

        Shape myShape = new Circle(3);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Shape secondShape = new Square(8);
        System.out.println(secondShape.getArea());
        System.out.println(secondShape.getPerimeter());







    }
}
