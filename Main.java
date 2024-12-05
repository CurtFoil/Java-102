import java.util.ArrayList;

public class Main {
    static <T> String arrayToString(T[] arr) {
            String str = "[";
            for (int i = 0; i < arr.length - 1; i++) {
                str += arr[i] + ", ";
            }
            return str + arr[arr.length - 1] + "]";
        }
    static double sumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
           sum += shape.area();
        }
        return sum;
    }
    static Shape[] scaleAll(Shape[] shapes, double k) {
        Shape[] scaled = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scaled[i] = shapes[i].scale(k);
        }
        return scaled;
    }
    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }
    public static void checkOut(LibraryItem item) {
            item.checkOut();
    }
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableList = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.available()) {
                availableList.add(item);
            }
        }
        return availableList;
    }
    public static void main(String[] args) {
        Point point = new Point(4, 3);
        Point xTranslation = point.translateX(19);
        Point yTranslation = point.translateY(-56);
        Point xyTranslation = point.translateX(84).translateY(-34);
        
        // System.out.println("x transl: (" + xTranslation.x + ", " + xTranslation.y + ")");
        // System.out.println("y transl: (" + yTranslation.x + ", " + yTranslation.y + ")");
        // System.out.println("xy transl: (" + xyTranslation.x + ", " + xyTranslation.y + ")");

        System.out.println("point: " + point);
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);

        Point a = new Point (4.5, 3.9);
        Point b = new Point (7.2, 5.5);
        System.out.println(Point.distance(a, b));

        Point[] points = {a, b};
        System.out.println(Point.centerOMass(points));

        System.out.println(a.angle());
        System.out.println(a.rotate90());

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        System.out.println(arr);
        arr.set(0, "Goodbye");
        System.out.println(arr);

        ArrayList<Boolean> conditions = new ArrayList<>();
        conditions.add(true);
        conditions.add(arr.get(0) == "Hello");
        conditions.add(conditions.get(0) || conditions.get(1));
        System.out.println(conditions);

        // ArrayList<Integer> intArr = new ArrayList<>();
        // for (int i = 0; i < 50; i++) {
        //     intArr.add(0);
        // }
        // System.out.println(intArr.size());
        // System.out.println(intArr.get(32));

        Grid<Integer> grid = new Grid<>(5, 0);
        grid.set(2, 2, 4);
        System.out.println(grid);

        Grid<Integer> grid2 = new Grid<>(3, 10);
        grid2.set(0, 0, 1);
        grid2.set(1, 1, 2);
        grid2.set(2, 2, 3);

        System.out.println(grid2);
        ArrayList<Integer> diagonal = grid2.diagonal();
        System.out.println(diagonal);

        Circle circle = new Circle(point, 5);
        System.out.println(circle.area());
        Point tp = new Point(4.5, 1.8);
        System.out.println(circle.isInside(tp));
        System.out.println(circle.scale(5));

        Square square1 = new Square(new Point(0, 0), 10);
        Point on = new Point(5, 0);
        System.out.println(square1.isOn(on));
        System.out.println(square1.isInside(tp));

        Shape[] shapes = {new Circle(new Point(1.8, -20), 2), 
            new Square(new Point(100, 2.1), 5.4),
            new Circle(new Point(0, 0), 1),
            new Circle(new Point(4, 9.123), 98.32),
            new Square(new Point(-321, 0), 0.02)};
        System.out.println(sumArea(shapes));

        A a1 = new A(12.3, 430);
        B b1 = new B(-12.31, "hello");
        a1.method1();
        b1.method1();
        b1.method2();
        A bInDisguise = new B(1002.013, "world");
        bInDisguise.method2();
        // System.out.println(b.bField + " " + bInDisguise.bField);

        Book TO = new Book("The Odyssey", "6214769", "Homer", 1054);
        Book F451 = new Book ("Farenhigt 451", "1942657", "Ray Bradbury", 182);
        DVD dvd = new DVD("Does anyone still use DVDs?", "2169585", 232.232);
        LibraryItem[] items = {TO, F451, dvd};
        returnAll(items);
        System.out.println(F451.available());
        checkOut(F451);
        System.out.println(F451.available());
    }
}
