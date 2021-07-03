package com.company;

import java.util.ArrayList;

public abstract class Unite {
    int num;
    String nom;
    Employe responsable;
    ArrayList<Employe> employes;
    Comite comite;

    Unite(int num, String nom, Employe responsable, Comite comite){
        this.num = num;
        this.nom = nom;
        this.responsable = responsable;
        this.comite = comite;
        this.employes = new ArrayList<>();
    }
}
