/*
* Notez que la classe "Demarrage" et la classe "FenetrePrincipale"
* sont dans la m�me librairie ("package") appel�e GUI.
*/
package gui;

public class GuiExemple {
	/*
	 * Cette approche qui s�pare le lancement de la fen�tre principale avec la
	 * d�finition de la fen�tre principale fait plus de sens.
	 */
	public static void main(String[] args) {
		/*
		 * Cette approche utilisant "invokeLater()" avec un objet de type "Runnable" a
		 * pour but de lancer un fil d'ex�cution pour l'affichage de la fen�tre. Comme
		 * vu dans l'exemple pr�c�dent, ce n'est pas n�cessaire mais c'est une bonne
		 * approche pour une future application ayant plusieurs fils d'ex�cution (ce
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