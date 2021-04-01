import java.util.Scanner;

public class Cours04CExercice5 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int entree = 0;
        System.out.print("Entrez un nombre entier: ");
        if(clavier.hasNextInt()) {
            entree = clavier.nextInt();
        }

        for(int i = 0; i < entree; i++) {
            if(i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        clavier.close();

    }
}
