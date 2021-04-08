import java.util.Scanner;

public class Devoir4Q1 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        int valeur = -1;
        do {
            System.out.println("Entrez une valeur entière qui est : ");
            System.out.println(" - Divisible par trois,");
            System.out.println(" - Inférieure ou égale à 99,");
            System.out.println(" - Strictement supérieure à zéro,");
            System.out.print("Votre valeur : ");
            boolean tampon_contient_entier = lecteur.hasNextInt();
            if (tampon_contient_entier == true) {
                valeur = lecteur.nextInt();
            }
            // On vide le tampon.
            lecteur.nextLine();
        } while (!(valeur > 0 && valeur <= 99 && valeur % 3 == 0));
        lecteur.close();
        System.out.println("Valeur est " + valeur);
    }
}
/* Réponse à la question Q1a:

Si: 
    -valeur > 0
    ou
    -valeur <= 99
    ou
    valeur est divisible par 3

    on fait une autre itération de la boucle.

Les conditions du while ne sont pas entrées correctement.

*/