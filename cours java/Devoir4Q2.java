import java.util.Scanner;

public class Devoir4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NOMBRE_ENTREES = 5;
        int total = 0;

        for (int i = 0; i < NOMBRE_ENTREES; i++) {
            System.out.print("Veuillez entrer une valeur entière (" + (i+1) + "/" + NOMBRE_ENTREES + "): ");
            if (scanner.hasNextInt()) {
                total += scanner.nextInt();
            }
            scanner.nextLine();
        }
        System.out.print(total + " / " + NOMBRE_ENTREES + " = ");
        System.out.println( (double)total / NOMBRE_ENTREES);
        scanner.close();
    }
}