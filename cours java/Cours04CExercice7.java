public class Cours04CExercice7 {
    public static void main(String[] args) {
        int VALEUR = 20;
        System.out.println(Math.exp(1));

        double demo = 0.0;
        for(int n = 0; n < VALEUR; n++) {
            demo += 1.0/factorielle(n);
        }
        System.out.println(demo);
    }

    private static long factorielle(long valeur) {
        long fact = 1;
        for(int i = 1; i <= valeur; i++) {
            fact *= i;
        }
        return fact;
    }
}
