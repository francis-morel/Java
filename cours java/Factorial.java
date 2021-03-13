import java.util.Scanner;

public class Factorial {

    private static int factiorielleFunc(int fact){
        int total = 1;
        for(int i = fact; i > 1; i--) {
            total *= i;
        }
        return total;

    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre entre 1 et 20: ");
        int input = scan.nextInt();
        if(input > 0 && input <= 20){
            System.out.println(factiorielleFunc(input));
        }
        else{
            System.out.println(-1);
        }
        scan.close();
    }
}
