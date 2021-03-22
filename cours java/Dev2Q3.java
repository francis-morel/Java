import java.util.Scanner;
public class Dev2Q3 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Entrez une première valeur flottante : ");
        double v1 = Double.parseDouble(lecteur.nextLine()); //Le lecteur.nextDouble() retourne une erreur sur mon poste lorsque j'entre une valeur decimale comme 5.3
        System.out.print("Entrez une deuxième valeur flottante : ");
        double v2 = Double.parseDouble(lecteur.nextLine()); //Le lecteur.nextDouble() retourne une erreur sur mon poste lorsque j'entre une valeur decimale comme 5.3
        double moyenne = (v1 + v2) / 2;
        System.out.println("Moyenne = " + moyenne);
        
        lecteur.close();
    }
}
