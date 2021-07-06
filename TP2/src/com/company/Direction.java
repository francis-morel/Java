package com.company;

public class Direction extends Unite{
    Unite parent;

    Direction(int num, String nom){
        this.num = num;
        this.nom = nom;
    }

    public void setParent(Unite parent){
        this.parent = parent;
    }
}
