package com.company;

import java.util.ArrayList;

public class Presidence extends Unite{
    ArrayList<Unite> listeUnites;

    Presidence(int num, String nom, Employe responsable, Comite comite){
        super(num, nom, responsable, comite);
        this.listeUnites = new ArrayList<>();
    }
}
