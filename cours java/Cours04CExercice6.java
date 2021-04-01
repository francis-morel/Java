import java.util.Scanner;

public class Cours04CExercice6 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int cible = 0;

        System.out.print("Entrer une valeur entière pour la séquence de fibonacci : ");
        if(clavier.hasNextInt()) {
            cible = clavier.nextInt();
        }
        int premier = 0;
        int deuxieme = 1;
        int fib = 0;
        for(int i = 1; i < cible; i++) {
            fib = premier + deuxieme;

            premier = deuxieme;
            deuxieme = fib;
        }
        System.out.println(fib);


        clavier.close();
    }
}
