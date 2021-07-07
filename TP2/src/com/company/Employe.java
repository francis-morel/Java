package com.company;

public abstract class Employe {
    static int numEmp = 101;

    int num;
    String nom;
    String titre;
    Unite affectation;
    double salaire;

    Employe(String nom, String titre, Unite affectation){
        this.num = numEmp;
        this.nom = nom;
        this.titre = titre;
        this.salaire = salaire;
        this.affectation = affectation;
        numEmp++;
    }

    public String getNom(){
        return this.nom;
    }

    public int getNum(){
        return this.num;
    }

    public String getTitre(){
        return this.titre;
    }

    public Unite getAffectation(){
        return this.affectation;
    }

    public void setAffectation(Unite unite){
        this.affectation = unite;
    }
}
