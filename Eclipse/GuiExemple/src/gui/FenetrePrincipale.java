package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FenetrePrincipale implements ActionListener {
// Attributs de nos contrôles ("widgets" ou "controls").
	private JButton bouton_incrementer = new JButton("Incrémenter");
	private JLabel etiquette = new JLabel("Valeur = 0");
	private JButton bouton_decrementer = new JButton("Décrémenter");
// Attribut qui se rappelle de la valeur courante affichée.
	int valeur = 0;

	public void creerEtAfficherLaFenetre() {
// Initialisation de la fenêtre.
		JFrame frame = new JFrame("Fenêtre principale yo !");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * Les événements liés à nos boutons seront gérés directement dans cette classe.
		 */
		bouton_incrementer.addActionListener(this);
		bouton_decrementer.addActionListener(this);
		/*
		 * Indique le mode de placement des contrôles ("widget") dans la fenêtre. Le
		 * "FlowLayout" place les contrôles l'un à la suite de l'autre (de gauche à
		 * droite typiquement).
		 */
		FlowLayout placement = new FlowLayout();
		frame.setLayout(placement);
// Ajout des contrôles ("widgets") à la fenêtre.
		frame.add(bouton_incrementer);
		frame.add(etiquette);
		frame.add(bouton_decrementer);
		/*
		 * Plutôt que d'utiliser la fonction "pack()" qui crée la fenêtre la plus petite
		 * possible avec les contrôles qu'on a, j'utilise la fonction "setSize()" qui
		 * permet de spécifier une taille en pixels.
		 */
		frame.setSize(600, 200);
// Rend la fenêtre visible.
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent un_evenement) {
		if (un_evenement.getSource() == bouton_incrementer)
			valeur++;
		else if (un_evenement.getSource() == bouton_decrementer)
			valeur--;
		etiquette.setText("Valeur = " + valeur);
	}
}