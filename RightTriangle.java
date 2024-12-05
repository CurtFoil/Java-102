public class RightTriangle implements Shape{
    private final Point corner;
    private final double base;
    private final double height;

    public RightTriangle(Point corner, double base, double height) {
    this.corner = corner;
    this.base = base;
    this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }

    @Override
    public boolean isInside(Point p) {
        return p.x >= corner.x && p.x <= corner.x + base &&
        p.y >= corner.y && p.y <= corner.y + height;
    }

    @Override
    public boolean isOn(Point p){
        return (p.x == corner.x && p.y >= corner.y && p.y <= corner.y + height) || (p.y == corner.y && p.x >= corner.x && p.x <= corner.x + base) || (p.x == corner.x + base && p.y >= corner.y && p.y <= corner.y + height);
    }

    @Override
    public Shape translate(double x, double y) {
        Point nc = corner.translateX(x).translateY(y);
        return new RightTriangle(nc, base, height);
    }

    @Override
    public Shape scale(double s) {
        return new RightTriangle(corner, base * s, height * s);
    }

    public static boolean similar(RightTriangle t1, RightTriangle t2) {
        double ratioBase = t1.base / t2.base;
        double ratioHeight = t1.height / t2.height;
        return ratioBase == ratioHeight;
    }
}
