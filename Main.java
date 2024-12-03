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
    }
}
