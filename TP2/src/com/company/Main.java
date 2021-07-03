package com.company;

import java.util.ArrayList;

public class Main {
    static ArrayList<Unite> listeUnites;
    static ArrayList<Employe> listeEmployes;

    public static void main(String[] args) {

        listeUnites = Utils.creerUnites();
        Utils.creerRelationsUnites(listeUnites);
        listeEmployes = Utils.creerEmployes(listeUnites);
        Utils.creerComites(listeUnites, listeEmployes);
    }
}
