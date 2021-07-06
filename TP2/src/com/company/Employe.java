package com.company;

public abstract class Employe {
    static int numEmp = 101;

    int num;
    String nom;
    String titre;
    Unite affectation;
    double salaire;

    Employe(int num, String nom, String titre, double salaire){
        this.num = numEmp;
        this.nom = nom;
        this.titre = titre;
        this.salaire = salaire;
        numEmp++;
    }

    public String getNom(){
        return this.nom;
    }
}
