import java.lang.Math;

public class tp1{

    public static double piCalcul(int nombreIteration) {
        double value = 0.0f;

        for(int i = 1; i <= nombreIteration; i++) {
            double denominateur = (double)i;
            value += (1 / (denominateur * denominateur));

        }

        return Math.sqrt(value*6);
    }

    public static boolean isValidInt(String valeur) {
        try {
            Integer.parseInt(valeur);
        }
        catch( Exception e) {
            System.out.println(e);
        }


        return true;
    }

    public static void main(String[] args) {
        isValidInt(args[0]);
        /*int nombreIteration = Integer.parseInt(args[0]);
        System.out.println(nombreIteration);
        double piValue = piCalcul(nombreIteration);

        System.out.println("Calcul de pi avec " + nombreIteration + " itterations:");
        System.out.println(piValue);*/

    }
}