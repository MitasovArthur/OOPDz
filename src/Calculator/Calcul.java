package Calculator;

public class Calcul {
    static public double sScircle(double radius) {
        double result = Math.PI * (Math.pow(radius, 2));
        System.out.printf("%.2f", result);
        return result;
    }

    static public double sCube(double side) {
        double result = side * 4;
        System.out.println(result);
        return result;
    }

    static public double sRectangle(double side1, double side2) {
        double result = side1 * side2;
        System.out.println(result);
        return result;
    }

}

