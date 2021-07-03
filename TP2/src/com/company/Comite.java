package com.company;

import java.util.ArrayList;

public class Comite {
    String nom;
    ArrayList<Employe> membres;

    Comite(String nom){
        this.membres = new ArrayList<>();
        this.nom = nom;
    }

    public void ajouterEmploye(Employe employe){
        membres.add(employe);
    }
}
