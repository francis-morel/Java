package com.company;

import java.util.ArrayList;

public abstract class Unite {
    int num;
    String nom;
    Employe responsable;
    ArrayList<Employe> employes;
    Comite comite;

//    Unite(int num, String nom, Employe responsable, Comite comite){
//        this.num = num;
//        this.nom = nom;
//        this.responsable = responsable;
//        this.comite = comite;
//        this.employes = new ArrayList<>();
//    }
    Unite(){
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe){
        this.employes.add(employe);
    }

    public void setResponsable(Employe employe){
        this.responsable = employe;
    }

    public Employe getResponsable(){
        return responsable;
    }

    public void setComite(Comite comite){
        this.comite = comite;
    }

    public String getNom(){
        return this.nom;
    }

    public int getNum(){
        return this.num;
    }

    public ArrayList<Unite> getListeUnites(){
        return null;
    }

    public ArrayList<Employe> getEmployes(){
        return this.employes;
    }

}
