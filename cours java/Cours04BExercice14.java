import java.util.Random;

public class Cours04BExercice14 {

    public static void main(String[] args) {
        throwTwoDices();
    }

    private static void throwTwoDices() {
        Random rand = new Random();
        int de1 = rand.nextInt(5) + 1;
        int de2 = rand.nextInt(5) + 1;

        System.out.println("Valeur du dé 1 : " + de1);
        System.out.println("Valeur du dé 2 : " + de2);

        if(de1 == 1 && de2 == 1) System.out.println("Snake Eyes!");
        if((de1 + de2) == 7) System.out.println("Natural!");
    }
    
}
