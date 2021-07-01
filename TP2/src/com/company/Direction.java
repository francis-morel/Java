package com.company;

public class Direction extends Unite{
    Unite parent;

    Direction(int num, String nom, Employe responsable, Comite comite){
        super(num, nom, responsable, comite);
    }
}
