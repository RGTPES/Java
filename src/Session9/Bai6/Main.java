package Session9.Bai6;


public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Rectangle(6);

        double total = 0;

        for (int i = 0; i < shapes.length; i++) {
            double area = shapes[i].calculateArea();
            System.out.println("Hinh " + (i + 1) + " - Dien tich: " + area);
            total += area;
        }
        System.out.println("Tong dien tich: " + total);
    }
}