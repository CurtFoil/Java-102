import java.util.ArrayList;

public class Main {
    
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
    }
}
