package tp2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TP2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String texte = "ATITBEHSTHRTGXHTHSTYTPCQPEIXHITRATBTCIFJPCSCDJHRWPCITGDCHATITBEHSTHRTGXHTHTIVPXGDHHXVCDATIBTGATBDFJTJGHTGDCIIDJHTCUTITATHQTAATHPJGDCIAPUDAXTTCITITTIATHPBDJGTJMSJHDATXAPJRDTJGFJPCSCDJHRWPCITGDCHATITBEHSTHRTGXHTHHXUUATGPQXTCBXTJMATBTGATBDFJTJGBPXHXATHIQXTCRDJGIATITBEHSTHRTGXHTHDJADCHTCKPSTJMRJTXAAXGTCGTKPCISTHETCSPCIHSDGTXAATRTGXHTHSPBDJGPJMGDQTHKTGBTXAATHIDBQPCIHDJHAPUTJXAATTCVDJIITHSTHPCVBPXHXATHIQXTCRDJGIATITBEHSTHRTGXHTHETCSPCIHSTRDGPXAFJDCRJTXAATTCGTKPCIFJPCSKDJHHTGTOPJITBEHSTHRTGXHTHHXKDJHPKTOETJGSTHRWPVGXCHSPBDJGTKXITOATHQTAATHBDXFJXCTRGPXCHEPHATHETXCTHRGJTAATHYTCTKXKGPXEDXCIHPCHHDJUUGXGJCYDJGFJPCSKDJHTCHTGTOPJITBEHSTHRTGXHTHKDJHPJGTOPJHHXSTHRWPVGXCHSPBDJGYPXBTGPXIDJYDJGHATITBEHSTHRTGXHTHRTHISTRTITBEHAPFJTYTVPGSTPJRDTJGJCTEAPXTDJKTGITTISPBTUDGIJCTTCBTIPCIDUUTGITCTEDJGGPYPBPXHRPABTGBPSDJATJGYPXBTGPXIDJYDJGHATITBEHSTHRTGXHTHTIATHDJKTCXGFJTYTVPGSTPJRDTJG";

		boolean running = true;
		while (running) {
			switch (menuPrincipal(scanner)) {
			case 1:
				System.out.println(analyse(texte));
				break;
			case 2:
				System.out.print("Quelle valeur de decallage? ");
				int choixDecallage = demanderInt(scanner);
				System.out.println(decryption(texte, choixDecallage));
				break;
			case 3:
				running = false;
				break;
			}
		}

	}

	public static int menuPrincipal(Scanner scanner) {
		int choix = -1;
		do {
			System.out.println("Logiciel de decryptage");
			System.out.println("1. Analyse du texte");
			System.out.println("2. Decrypter le texte");
			System.out.println("3. Quitter");
			System.out.print("Votre choix? ");
			choix = demanderInt(scanner);
		} while (choix < 0 || choix > 3);

		return choix;
	}

	public static String decryption(String texte, int decallage) {
		String texteDecripte = "";

		for (int c = 0; c < texte.length(); c++) {
			texteDecripte += decryptionChar(texte.charAt(c), decallage);
		}

		return texteDecripte;
	}

	public static char decryptionChar(char caractere, int decallage) {
		int ascii = (int) (caractere + decallage);
		if (ascii > 90)
			ascii -= 26;
		char caractereDecripte = (char) ascii;

		return caractereDecripte;
	}

	public static String analyse(String texte) {
		Map<Character, Integer> listeCar = new TreeMap<Character, Integer>();

		for (char letter : texte.toCharArray()) {
			if (listeCar.containsKey(letter)) {
				listeCar.put(letter, (int) listeCar.get(letter) + 1);
			} else {
				listeCar.put(letter, 1);
			}
		}

		for (int i = 65; i <= 90; i++) {
			if (!listeCar.containsKey((char) i))
				listeCar.put((char) i, 0);
		}
		
		String retour = "";
		for (char k : listeCar.keySet()) {
			retour += k + " : " + listeCar.get(k) + "\n";
		}

		return retour;
	}

	public static int demanderInt(Scanner scanner) {
		int retour = -1;
		if (scanner.hasNextInt()) {
			retour = scanner.nextInt();
		}
		scanner.nextLine();
		return retour;
	}
}
