package dev2_q2;

import java.util.Scanner;

public class Dev2Q2 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Combien de terre avez-vous besoin (entier, m3) : ");
        int volume = lecteur.nextInt();
        double nb_camions = volume / 8.0;
        System.out.println("Vous aurez besoin de " + nb_camions + " camions de terre.");
        lecteur.close();
    }
}