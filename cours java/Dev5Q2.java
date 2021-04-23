import java.util.Scanner;

public class Dev5Q2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int v1 = obtenirEntier(clavier, "V1");
        int v2 = obtenirEntier(clavier, "V2");
        int v3 = obtenirEntier(clavier, "V3");
        clavier.close();

        int valeurMax = valeurMaximale(v1, v2, v3);
        double moyenne = calculerMoyenne(v1, v2, v3);

        afficherResultats(valeurMax, moyenne);
    }

    public static int obtenirEntier(Scanner lecteur, String nom) {
        int valeur = -1;

        do {
            System.out.print("Entrez un entier " + nom + " entre 1 et 20 : ");
            if (lecteur.hasNextInt()) {
                valeur = lecteur.nextInt();
            }
            lecteur.nextLine();
        } while (valeur < 1 || valeur > 20);

        return valeur;
    }

    public static int valeurMaximale(int v1, int v2, int v3) {
        int max = -1;
        
        if (v1 > max) max = v1;
        if (v2 > max) max = v2;
        if (v3 > max) max = v3;

        return max;
    }

    public static double calculerMoyenne(int v1, int v2, int v3) {
        double moyenne = (v1 + v2 + v3) / 3.0;

        return moyenne;
    }

    public static void afficherResultats(int max, double moyenne) {
        System.out.println("La valeur max: " + max);
        System.out.println("La moyenne: " + moyenne);
    }

}
