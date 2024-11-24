public class Main {
    
    public static void main(String[] args) {
        Point point = new Point(4, 3);   
        Point xTranslation = point.translateX(19);
        Point yTranslation = point.translateY(-56);
        Point xyTranslation = point.translateX(84).translateY(-34);System.out.println("x transl: (" + xTranslation.x + ", " + xTranslation.y + ")");System.out.println("y transl: (" + yTranslation.x + ", " + yTranslation.y + ")");System.out.println("xy transl: (" + xyTranslation.x + ", " + xyTranslation.y + ")");
    }
}
