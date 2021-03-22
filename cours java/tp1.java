import java.lang.Math;
import java.util.Scanner;

public class tp1{

    public static double piCalcul(int nombreIteration) {
        double value = 0.0;

        for(int i = 1; i <= nombreIteration; i++) {
            double denominateur = (double)i;
            value += (1.0 / (denominateur * denominateur));

        }

        return Math.sqrt(value*6.0);
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

    public static float rendementPi(double value) {
        float rendement = 0.0f;

        String valueStr = String.valueOf(value);
        char[] valueArray = valueStr.toCharArray();
        String piStr = String.valueOf(Math.PI);
        char[] piArray = piStr.toCharArray();

        int piLength = piArray.length;

        for(int i = 0; i<10; i++) {
            //si le premier chiffre n'est pas 3, retourner 0%
            //Le premier chiffre après la virgule vaut 80% de rendement
            //Les chiffres suivants ont de moins en moins de valeur
            
            if(valueArray[0] != '3'){
                return 0.0f;
            }

            if(valueArray.length >= i) {
                if (piArray[i] == valueArray[i]) {
                    rendement += 1.0f;
                }
            }
            
        }
        
        rendement = rendement/10.0f*100.0f;

        return rendement;
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez le nombre d'itérations désirées: ");
        int nombreIteration = Integer.parseInt(scan.nextLine());
        double piValue = piCalcul(nombreIteration);

        System.out.println("Calcul de pi avec " + nombreIteration + " itterations:");
        System.out.println(piValue);

        scan.close();

        float rendement = rendementPi(piValue);

        System.out.println(rendement);
               


    }
}