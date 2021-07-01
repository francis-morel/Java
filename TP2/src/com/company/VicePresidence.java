package com.company;

import java.util.ArrayList;

public class VicePresidence extends Unite{
    ArrayList<Unite> listeUnites;
    Unite parent;

    VicePresidence(int num, String nom, Employe responsable, Comite comite){
        super(num, nom, responsable, comite);
    }
}
