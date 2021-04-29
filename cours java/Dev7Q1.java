import java.util.Random;
import java.util.ArrayList;

public class Dev7Q1 {
    public static void main(String[] args) {
        Random generateur = new Random(460113);
        ArrayList<Integer> tableau = new ArrayList<Integer>();
        // Génération des valeurs
        for (int i = 0; i < 5; i++) {
            // Génère une valeur entre 0 et 99.
            Integer valeur = generateur.nextInt(100);
            if (valeur % 2 == 0) {
                tableau.add(valeur);
            }
        }
        // Calcul de la moyenne
        double somme = 0;
        for (int i = 0; i < tableau.size(); i++) {
            somme = somme + tableau.get(i);
        }
        double moyenne = somme / tableau.size();
        // Affichage de la moyenne
        System.out.println("Moyenne = " + moyenne);
    }
}