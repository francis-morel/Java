import java.util.Scanner;
import java.util.Random;

public class PileFace {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean jeu = true;

        while(jeu) {
            System.out.print("pile ou face? ");
            String userInput = scanner.nextLine();

            if(!(userInput.equals("pile") || userInput.equals("face"))) {
                continue;
            }

            boolean pileOuFace = rand.nextBoolean();
            String ia = "";
            if(pileOuFace) {
                ia = "pile";
            }
            else{
                ia = "face";
            }

            if(pileOuFace) {
                System.out.println("La piece est tombee du cote " + ia + " GAGNE!");
            }
            else{
                System.out.println("La piece est tombee du cote " + ia + " PERD!");
            }

            while(true) {
                System.out.println("Rejouer? (y/n) ");
                String rejouer = scanner.nextLine();
                if((rejouer.equals("y") || rejouer.equals("Y"))) {
                    break;
                }
                else if(rejouer.equals("n") || rejouer.equals("N")){
                    jeu = false;
                    break;
                }
                System.out.println("Entree invalide");
            }
            



        }


    }
}
