import java.util.Scanner;

public class PratiqueScanner {
    

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre: ");

        int retour = input.nextInt();
        System.out.println(retour);
        input.close();
    }
}
