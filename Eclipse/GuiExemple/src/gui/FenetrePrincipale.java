package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FenetrePrincipale implements ActionListener {
// Attributs de nos contr�les ("widgets" ou "controls").
	private JButton bouton_incrementer = new JButton("Incr�menter");
	private JLabel etiquette = new JLabel("Valeur = 0");
	private JButton bouton_decrementer = new JButton("D�cr�menter");
// Attribut qui se rappelle de la valeur courante affich�e.
	int valeur = 0;

	public void creerEtAfficherLaFenetre() {
// Initialisation de la fen�tre.
		JFrame frame = new JFrame("Fen�tre principale yo !");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * Les �v�nements li�s � nos boutons seront g�r�s directement dans cette classe.
		 */
		bouton_incrementer.addActionListener(this);
		bouton_decrementer.addActionListener(this);
		/*
		 * Indique le mode de placement des contr�les ("widget") dans la fen�tre. Le
		 * "FlowLayout" place les contr�les l'un � la suite de l'autre (de gauche �
		 * droite typiquement).
		 */
		FlowLayout placement = new FlowLayout();
		frame.setLayout(placement);
// Ajout des contr�les ("widgets") � la fen�tre.
		frame.add(bouton_incrementer);
		frame.add(etiquette);
		frame.add(bouton_decrementer);
		/*
		 * Plut�t que d'utiliser la fonction "pack()" qui cr�e la fen�tre la plus petite
		 * possible avec les contr�les qu'on a, j'utilise la fonction "setSize()" qui
		 * permet de sp�cifier une taille en pixels.
		 */
		frame.setSize(600, 200);
// Rend la fen�tre visible.
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