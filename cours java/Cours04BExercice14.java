import java.util.Random;

public class Cours04BExercice14 {

    public static void main(String[] args) {
        for(int i = 0; i < 1000; i++) {
            System.out.print(throwTwoDices());
        }
    }

    private static String throwTwoDices() {
        Random rand = new Random();
        int de1 = rand.nextInt(5) + 1;
        int de2 = rand.nextInt(5) + 1;
        String sortie = "";

        sortie += ("Valeur du dé 1 : " + de1 + "\n");
        sortie += ("Valeur du dé 2 : " + de2 + "\n");

        if(de1 == 1 && de2 == 1) sortie += "Snake Eyes!\n";
        if((de1 + de2) == 7) sortie += "Natural!\n";

        return sortie;
    }
    
}
