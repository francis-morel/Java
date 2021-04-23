/*
* Notez que la classe "Demarrage" et la classe "FenetrePrincipale"
* sont dans la même librairie ("package") appelée GUI.
*/
package gui;

public class GuiExemple {
	/*
	 * Cette approche qui sépare le lancement de la fenêtre principale avec la
	 * définition de la fenêtre principale fait plus de sens.
	 */
	public static void main(String[] args) {
		/*
		 * Cette approche utilisant "invokeLater()" avec un objet de type "Runnable" a
		 * pour but de lancer un fil d'exécution pour l'affichage de la fenêtre. Comme
		 * vu dans l'exemple précédent, ce n'est pas nécessaire mais c'est une bonne
		 * approche pour une future application ayant plusieurs fils d'exécution (ce
		 * qu'on appelle le "multithreading").
		 */
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FenetrePrincipale ma_fenetre = new FenetrePrincipale();
				ma_fenetre.creerEtAfficherLaFenetre();
			}
		});
	}
}