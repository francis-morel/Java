package dev2_q3;

import java.util.Scanner;

public class Dev2Q3 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Entrez une première valeur flottante : ");
        double v1 = lecteur.nextDouble();
        System.out.print("Entrez une deuxième valeur flottante : ");
        double v2 = lecteur.nextDouble();
        double moyenne = (v1 + v2) / 2;
        System.out.println("Moyenne = " + moyenne);
        lecteur.close();
    }
}