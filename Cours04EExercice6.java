import java.util.Scanner;

public class Cours04EExercice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer le diamètre d'un crayon: ");
        double rayonCrayon = askDouble(scanner)/2;

        switch(askFonction(scanner)) {
            case "circonference":
                System.out.println("Voici la circonférence du crayon: " + circonference(rayonCrayon));
                break;
            case "aire":
                System.out.println("Voici l'aire du crayon: " + aire(rayonCrayon));
                break;
            case "volume":
                System.out.println("Voici le volume de la sphère: " + volume(rayonCrayon));
                break;
        }


    }

    public static double circonference(double rayon) {
        return 2 * Math.PI * rayon;
    }

    public static double aire(double rayon) {
        return Math.PI * Math.pow(rayon, 2);
    }

    public static double volume(double rayon) {
        return (4 / 3) * Math.PI * Math.pow(rayon, 3);
    }

    public static double askDouble(Scanner scanner) {
        double valeurDouble = 0.0;

        if (scanner.hasNextDouble()) {
            valeurDouble = scanner.nextDouble();
        }
        scanner.nextLine();

        return valeurDouble;
    }

    public static int askInt(Scanner scanner) {
        int valeurInt = 0;

        if (scanner.hasNextInt()) {
            valeurInt = scanner.nextInt();
        }
        scanner.nextLine();

        return valeurInt;
    }

    public static String askFonction(Scanner scanner) {
        String retour = "";

        System.out.println("Quelle fonction désirez-vous effectuer?");
        System.out.println("1. Circonférence");
        System.out.println("2. Aire");
        System.out.println("3. Volume");

        switch(askInt(scanner)) {
            case 1:
                retour = "circonference";
                break;
            case 2:
                retour = "aire";
                break;
            case 3:
                retour = "volume";
                break;
        }
        return retour;
    }
}
