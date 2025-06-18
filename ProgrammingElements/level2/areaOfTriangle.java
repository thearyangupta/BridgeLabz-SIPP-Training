public class areaOfTriangle {
        public static void areaOfTriangles() {
        double base = 20.0;
        double height = 10.0; 

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);
    }
    public static void main(String[] args) {
        areaOfTriangles();
    }
}
