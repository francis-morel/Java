import java.util.Scanner;

class PratiqueScanner {

    public static void main(String args[]) {
        System.out.print("Veuillez entrer un nombre entier: ");
        Scanner test = new Scanner(System.in);

        int input = test.nextInt();

        System.out.println(input);
    }
}