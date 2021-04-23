import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class C05BExercice4 {
  public static void main(String[] args) {
    // Bloc try-catch obligatoire en Java car la lecture du fichier peut lancer une exception.
    try {
      File fichier = new File("data.txt");
      Scanner lecteur = new Scanner(fichier);

      // Crée un tableau dynamique qui va pouvoir contenir les lignes lues dans le fichier. 
      ArrayList<String> liste_lignes = new ArrayList<String>(); 

      // Tant qu'il reste des lignes dans le fichier, on continue à lire. 
      while(lecteur.hasNextLine()) {
        // Lecteur d'une ligne dans le fichier.
        String ligne = lecteur.nextLine();
        // Ajout de la ligne dans le tableau dynamique.
        liste_lignes.add(ligne);
        // Fermeture du lecteur et du fichier.
        
      }
      lecteur.close();

      // On affiche à l'écran toutes les lignes qu'on a lues.
      for(int i=0; i<liste_lignes.size(); i++) {
        System.out.println("L" + i + " " + liste_lignes.get(i));
      }

    } catch(FileNotFoundException une_exception) {
      // Ce qu'on fait quand une exception est lancée lors de la manipulation du fichier.
      une_exception.printStackTrace();
    }
  }
}