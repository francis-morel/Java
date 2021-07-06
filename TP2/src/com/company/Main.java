package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Unite> listeUnites;
    static ArrayList<Employe> listeEmployes;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        listeUnites = Utils.creerUnites();
        Utils.creerRelationsUnites(listeUnites);
        listeEmployes = Utils.creerEmployes(listeUnites);
        Utils.creerComites(listeUnites, listeEmployes);


        menuPrincipal();

        scanner.close();
    }

    /**
     * Fonction pour obtenir un Int de l'utilisateur avec une valeur Min et Max
     * @param message Le message à afficher avant de demander un Int
     * @param min La valeur minimale que l'utilisateur peut entrer
     * @param max La valeur maximale que l'utilisateur peut entrer
     * @return Retourn un Int validé dans la plage précisée
     */
    public static int demanderInt(String message, int min, int max) {
        int nombre = min - 1;
        String messageMinMax = message + " (" + min + "-" + max + ")";

        while (nombre < min || nombre > max) {
            nombre = demanderInt(messageMinMax);

            if (nombre < min || nombre > max) {
                System.out.println("Le nombre entré n'est pas dans les choix");
            }
        }

        return nombre;
    }

    /**
     * Fonction pour obtenir un Int de l'utilisateur
     * @param message Le message à afficher avant de demander un Int
     * @return Retourne un Int validé
     */
    public static int demanderInt(String message) {
        int nombre = -1;

        while (nombre == -1) {
            System.out.print(message + ": ");
            String input = scanner.nextLine();

            try {
                nombre = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Nombre invalide");
            }
        }

        return nombre;
    }

    /**
     * Fonction pour afficher le menu principal et appeler les fonctions des menus d'interrogation
     */
    private static void menuPrincipal() {
        final String SEP = "====================================================";
        final String SEP_STAR = "****************************************************";
        int choix = -1;
        final int MENU_MIN = 0;
        final int MENU_MAX = 2;
        boolean quitter = false;

        System.out.println(SEP_STAR);
        System.out.println("*         Bienvenu dans le logiciel FMERP!         *");
        System.out.println(SEP_STAR + "\n\n");


        while (!quitter) {
            System.out.println(SEP);
            System.out.println("||                  Menu principal                ||");
            System.out.println(SEP);

            System.out.println("Voici les choix:");
            System.out.println("\t0. Quitter");
            System.out.println("\t1. Interroger l'organigramme");
            System.out.println("\t2. Interroger les employés");


            System.out.println();
            choix = demanderInt("Votre choix", MENU_MIN, MENU_MAX);

            switch (choix) {
                case 1:
                    menuOrganigramme();
                    break;

                case 2:
                    menuEmploye();
                    break;

                default:
                    quitter = true;
                    break;
            }
        }


        System.out.println("\n\nMerci d'avoir utilisé le logiciel FMERP!! Au revoir!");
    }

    /**
     * Fonction pour afficher le menu Interroger l'organigramme et appeler les fonctions de ce menu
     */
    private static void menuOrganigramme() {
        final String SEP = "====================================================";
        int choix = -1;
        final int MENU_MIN = 0;
        final int MENU_MAX = 5;
        boolean quitter = false;

        while (!quitter) {
            System.out.println(SEP);
            System.out.println("||           Interroger l'organigramme:           ||");
            System.out.println(SEP);

            System.out.println("Voici les choix:");
            System.out.println("\t0. Retour");
            System.out.println("\t1. Lister les unités de l'entreprise");
            System.out.println("\t2. Lister les unités qui relèvent d'une unité");
            System.out.println("\t3. Lister toutes les unités d'une niveau/type");
            System.out.println("\t4. Rechercher une unité");
            System.out.println("\t5. Lister les comités de gestion");


            System.out.println();
            choix = demanderInt("Votre choix", MENU_MIN, MENU_MAX);

            switch (choix) {
                case 1:
                    organigrammeListerUnites();
                    break;

                case 2:
                    organigrammeListerUniteReleveUnite();
                    break;

                case 3:
                    //call function
                    break;

                case 4:
                    //call function
                    break;

                case 5:
                    //call function
                    break;

                default:
                    quitter = true;
                    break;
            }
        }
    }

    private static void organigrammeListerUnites() {
        //Transfert des informations dans un array pour les passer à une fonction de formatage sous forme de tableau
        String[][] tableauAFormatter = new String[listeUnites.size()][3];

        for(int i = 0; i < listeUnites.size(); i++){
            tableauAFormatter[i][0] = String.valueOf(listeUnites.get(i).getNum());
            tableauAFormatter[i][1] = listeUnites.get(i).getNom();
            tableauAFormatter[i][2] = listeUnites.get(i).getResponsable().getNom();
        }
        String[] enTete = {"Numéro", "Nom", "Responsable"};
        System.out.println(array2dToString(enTete, tableauAFormatter));
    }

    private static void organigrammeListerUniteReleveUnite(){
        System.out.println("Voici la liste des numéros des unités ayant des sous-unités: ");
        String numerosUnites = "";
        for(Unite unite : listeUnites){
            if(unite.getListeUnites() != null) {
                numerosUnites += String.valueOf(unite.getNum()) + " ";
            }
        }
        System.out.println(numerosUnites);

        //*********************LA VALIDATION DES ENTRÉES N'EST PAS FAITE***********************************************
        int numeroUnite = demanderInt("Veuillez entrer un numéro d'unité");
        Unite unite = Utils.getUniteParNum(listeUnites, numeroUnite);

        if(unite != null) {
            ArrayList<Unite> sousUnite = unite.getListeUnites();
            if (sousUnite != null) {
                String[] enTete = {"Numéro", "Nom", "Responsable"};
                String[][] tableauSousUnite = new String[sousUnite.size()][3];

                for(int i = 0; i < sousUnite.size(); i++){
                    tableauSousUnite[i][0] = String.valueOf(sousUnite.get(i).getNum());
                    tableauSousUnite[i][1] = sousUnite.get(i).getNom();
                    tableauSousUnite[i][2] = sousUnite.get(i).getResponsable().getNom();
                }
                System.out.println(array2dToString(enTete, tableauSousUnite));
            }
        }
    }


    /**
     * Fonction pour afficher le menu Interroger les employés et appeler les fonctions de ce menu
     */
    private static void menuEmploye() {
        final String SEP = "====================================================";
        int choix = -1;
        final int MENU_MIN = 0;
        final int MENU_MAX = 5;
        boolean quitter = false;

        while (!quitter) {
            System.out.println(SEP);
            System.out.println("||            Interroger les employés:            ||");
            System.out.println(SEP);

            System.out.println("Voici les choix:");
            System.out.println("\t0. Retour");
            System.out.println("\t1. Lister les employés de l'entreprise");
            System.out.println("\t2. Lister les employés d'une unité");
            System.out.println("\t3. Lister les employés d'une unité ainsi que des unités qui relèvent de celle-ci");
            System.out.println("\t4. Lister les employés d'une catégorie de poste");
            System.out.println("\t5. Rechercher un employé");


            System.out.println();
            choix = demanderInt("Votre choix", MENU_MIN, MENU_MAX);

            switch (choix) {
                case 1:
                    //call function
                    break;

                case 2:
                    //call function
                    break;

                case 3:
                    //call function
                    break;

                case 4:
                    //call function
                    break;

                case 5:
                    //call function
                    break;

                default:
                    quitter = true;
                    break;
            }
        }
    }

    /**
     * Fonction pour rajouter des espaces devant une chaîne de caractère pour qu'elle ait une longueur minimale
     * @param string La chaîne de caractère à ajuster
     * @param len La longueur minimal que la chaîne de caractère doit avoir à la fin de la fonction
     * @param ch Le caractère pour remplir les espaces manquants à gauche de la chaîne
     * @return Retourne un String contenant la chaîne de caractère avec les caractères rajoutés au début
     */
    public static String stringFormatLeftPad(String string, int len, char ch){
        String sortie = string;

        while(sortie.length() < len){
            sortie = ch + sortie;
        }
        return sortie;
    }

    /**
     * Fonction pour rajouter des espaces après une chaîne de caractère pour qu'elle ait une longueur minimale
     * @param string La chaîne de caractère à ajuster
     * @param len La longueur minimal que la chaîne de caractère doit avoir à la fin de la fonction
     * @param ch Le caractère pour remplir les espaces manquants à droite de la chaîne
     * @return Retourne un String contenant la chaîne de caractère avec les caractères rajoutés à la fin
     */
    public static String stringFormatRightPad(String string, int len, char ch){
        String sortie = string;

        while(sortie.length() < len){
            sortie += ch;
        }
        return sortie;
    }


    /**
     * Fonction seulement pour faire le formatage en beau tableau pour l'affichage
     * @param enTete Un array contenant l'en-tête du tableau et doit avoir la même longueur que la quantité de colonnes que les données
     * @param tableau Un array deux dimensions contenant les données à formater
     * @return Renvoie un String prêt à afficher à la console
     */
    public static String array2dToString(String[] enTete, String[][] tableau){
        int[] dimensionColumns = new int[tableau[0].length]; //Cette variable va contenir la longueur max de chaque colonne
        String sortie = "";


        //Code pour déterminer les longueurs de colonnes
        for(int j = 0; j < dimensionColumns.length; j++){
            for(int i = 0; i < tableau.length; i++){
                if(dimensionColumns[j] < tableau[i][j].length()){
                    dimensionColumns[j] = tableau[i][j].length();
                }
            }
        }

        //Vérification pour être certain que l'en-tête est de la même dimension que le tableau
        if(enTete.length == dimensionColumns.length) {
            //formattage de l'en-tête du tableau
            for (int i = 0; i < enTete.length; i++) {
                //mise à jour de la longueur des colonnes si l'en-tête est plus long que le contenu
                if(dimensionColumns[i] < String.valueOf(enTete[i]).length()){
                    dimensionColumns[i] = String.valueOf(enTete[i]).length();
                }
                sortie += stringFormatRightPad(enTete[i], dimensionColumns[i] + 4, ' ');
            }
            sortie += "\n";

            //soulignement de l'en-tête
            for (int i = 0; i < enTete.length; i++) {
                sortie += stringFormatRightPad("", dimensionColumns[i], '-') + "    ";
            }
            sortie += "\n";
        }

        //formattage du string selon les longueurs
        for(int i = 0; i < tableau.length; i++){
            for(int j = 0; j < tableau[i].length; j++){
                sortie += stringFormatRightPad(tableau[i][j], dimensionColumns[j] + 4, ' ');
            }
            sortie += "\n";
        }

        return sortie;
    }


}
