public class Cours3Exercice4 {
    public static void main(String[] args) {
        double hauteur = 2;
		double rayon = 0.5;
		double pi = 3.1416;
		
		double surface_base = pi * rayon * rayon;
		double volume = surface_base * hauteur;
		
		System.out.println("Volume = " + volume + " m3");
    }
}
