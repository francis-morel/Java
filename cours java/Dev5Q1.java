import java.util.Scanner;

public class Dev5Q1 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez une valeur paire entre 1 et 99 : ");
        int entree = -1;

        if (clavier.hasNextInt()) {
            entree = clavier.nextInt();
        }

        clavier.close();
        boolean retour = determinerSiValide(entree);

        if (retour == true) {
            System.out.println("La valeur entrée est valide.");
        } else {
            System.out.println("La valeur entrée n'est pas valide.");
        }
    }
    public static boolean determinerSiValide(int valeur) {
        if (valeur>0) {
            if (valeur<100) {
                if (valeur%2==0) {
                    return true;
                }
            }
        }
        return false; //Q1a. le code ne compile pas parce que la fonction ne retournait rien si la valeur n'est pas "valide" et voici la correction.
    }
}
