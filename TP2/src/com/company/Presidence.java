package com.company;

import java.util.ArrayList;

public class Presidence extends Unite{
    ArrayList<Unite> listeUnites;

    Presidence(int num, String nom){
        this.num = num;
        this.nom = nom;
        this.listeUnites = new ArrayList<>();
    }

    public void setListeUnites(ArrayList<Unite> listeUnites){
        this.listeUnites = listeUnites;
    }

    @Override
    public ArrayList<Unite> getListeUnites(){
        return this.listeUnites;
    }
}
