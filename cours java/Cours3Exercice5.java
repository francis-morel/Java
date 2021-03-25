public class Cours3Exercice5 {
    public static void main(String[] args) {
        double a = 2;
        double b = 5;
        double c = 3;

        double x1 = 0.0;
        double x2 = 0.0;

        x1 = -b + (Math.sqrt((b*b - 4 * a * c))/(2*a));
        x2 = -b - (Math.sqrt(b * b - 4 * a * c))/(2 * a);

        System.out.println("La valeur de b+ = " + x1);
        System.out.println("La valeur de b- = " + x2);
    }
}
