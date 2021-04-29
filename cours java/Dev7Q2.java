import java.util.Scanner;
import java.util.ArrayList;

public class Dev7Q2 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        ArrayList<Integer> listeNombres = new ArrayList<Integer>();

        final int NOMBRE_VALEURS = 5;

        for (int i = 0; i < NOMBRE_VALEURS; i++) {
            int une_valeur = obtenirValeur(lecteur);
            listeNombres.add(une_valeur);
        }

        for (int i = 0; i < listeNombres.size(); i++) {
            int valeur = listeNombres.get(i);
            if (valeur % 2 == 1) {
                valeur++;
                listeNombres.set(i, valeur);
            }
        }

        for (Integer i: listeNombres) {
            System.out.println(i);
        }
        
    }

    public static int obtenirValeur(Scanner clavier) {
        boolean valide = false;
        int valeur = 0;
        do {
            System.out.print("Entrez une valeur entière entre 1 et 100 : ");
            if (clavier.hasNextInt()) {
                valeur = clavier.nextInt();
                if (valeur >= 1 && valeur <= 100) {
                    valide = true;
                }
            }
            clavier.nextLine();
        } while (valide == false);
        System.out.println("Merci pour la valeur !");
        return valeur;
    }
}