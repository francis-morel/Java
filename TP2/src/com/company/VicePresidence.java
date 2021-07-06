package com.company;

import java.util.ArrayList;

public class VicePresidence extends Unite{
    ArrayList<Unite> listeUnites;
    Unite parent;

    VicePresidence(int num, String nom){
        this.nom = nom;
        this.num = num;
    }

    public void setListeUnites(ArrayList<Unite> listeUnites){
        this.listeUnites = listeUnites;
    }

    public void setParent(Unite parent){
        this.parent = parent;
    }

    @Override
    public ArrayList<Unite> getListeUnites(){
        return this.listeUnites;
    }
}
