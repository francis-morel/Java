import java.util.Scanner;

public class Cours04BExercice13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenu dans le programme de soumission automatisé de la compagie Francis Assure!");
        System.out.println("Quel type d'auto désirez-vous assurer?");
        System.out.println("1. Sport");
        System.out.println("2. Luxe");
        System.out.println("3. Autre");
        int autoType = scan.nextInt();
        String autoTypeStr = "";
        scan.nextLine();
        
        System.out.println("Quel age avez-vous? ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Combien d'accidents avez-vous eu dans les 5 dernières années? ");
        int nombreAccidents = scan.nextInt();

        double montantSoumission = 0;

        switch( autoType) {
            case 1:
                montantSoumission += 2000.0; //si c'est un auto sport
                autoTypeStr = "Sport";
                break;
            
            case 2:
                montantSoumission += 1000.0; // si c'est un auto de luxe
                autoTypeStr = "Luxe";
                break;

            default:
                montantSoumission += 500.0; //si c'est un autre type d'auto
                autoTypeStr = "Autre";
        }

        if(age < 25 || (age >=75 && age <= 85)) {
            montantSoumission += 1000;
        }
        else if (age > 85) {
            System.out.println("Désolé vous n'êtes pas admissible à notre assurance");
            return;
        }

        if(nombreAccidents >= 1 && nombreAccidents <=3) {
            montantSoumission *= 1.5;
        }
        else if(nombreAccidents > 3){
            System.out.println("Désolé vous n'êtes pas admissible à notre assurance");
            return;
        }

        System.out.println("Vous conduisez un véhicule de type " + autoTypeStr + ", vous avez " + age + " ans et vous avez eu " + nombreAccidents + " accidents dans les 5 dernières années.");
        System.out.println("Félicitation! Vous êtes donc admissible à notre assurance pour seulement " + montantSoumission + "$ !!!");


    }
    
}
