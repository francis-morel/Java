import java.util.Scanner;

public class Cours04BExercice11 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        
        System.out.println("Bienvenue dans la super calculatrice!");
        System.out.print("Veuillez entrer le premier nombre: ");
        int nombre1 = lecteur.nextInt();
        System.out.print("Veuillez entrer le deuxième nombre: ");
        int nombre2 = lecteur.nextInt();

        lecteur.nextLine();

        System.out.print("Veuillez entrer le type d'opération ( + - * / ) : ");
        String operation = lecteur.nextLine();

        switch(operation) {
            case "+":
                System.out.println(nombre1 + " + " + nombre2 + " = " + (nombre1+nombre2));
                break;
            
            case "-":
                System.out.println(nombre1 + " - " + nombre2 + " = " + (nombre1-nombre2));
                break;

            case "*":
                System.out.println(nombre1 + " * " + nombre2 + " = " + (nombre1*nombre2));
                break;

            case "/":
                if(nombre2 < 1) nombre2 = 1;
                System.out.println(nombre1 + " / " + nombre2 + " = " + ((double)nombre1/nombre2));
                break;

            default:
                System.out.println("Entrée invalide!");
        }

    lecteur.close();
    }
}
