import java.util.Map;
import java.util.TreeMap;

public class tp2 {
    public static void main(String[] args) {
        
        String texte = "ATITBEHSTHRTGXHTHSTYTPCQPEIXHITRATBTCIFJPCSCDJHRWPCITGDCHATITBEHSTHRTGXHTHTIVPXGDHHXVCDATIBTGATBDFJTJGHTGDCIIDJHTCUTITATHQTAATHPJGDCIAPUDAXTTCITITTIATHPBDJGTJMSJHDATXAPJRDTJGFJPCSCDJHRWPCITGDCHATITBEHSTHRTGXHTHHXUUATGPQXTCBXTJMATBTGATBDFJTJGBPXHXATHIQXTCRDJGIATITBEHSTHRTGXHTHDJADCHTCKPSTJMRJTXAAXGTCGTKPCISTHETCSPCIHSDGTXAATRTGXHTHSPBDJGPJMGDQTHKTGBTXAATHIDBQPCIHDJHAPUTJXAATTCVDJIITHSTHPCVBPXHXATHIQXTCRDJGIATITBEHSTHRTGXHTHETCSPCIHSTRDGPXAFJDCRJTXAATTCGTKPCIFJPCSKDJHHTGTOPJITBEHSTHRTGXHTHHXKDJHPKTOETJGSTHRWPVGXCHSPBDJGTKXITOATHQTAATHBDXFJXCTRGPXCHEPHATHETXCTHRGJTAATHYTCTKXKGPXEDXCIHPCHHDJUUGXGJCYDJGFJPCSKDJHTCHTGTOPJITBEHSTHRTGXHTHKDJHPJGTOPJHHXSTHRWPVGXCHSPBDJGYPXBTGPXIDJYDJGHATITBEHSTHRTGXHTHRTHISTRTITBEHAPFJTYTVPGSTPJRDTJGJCTEAPXTDJKTGITTISPBTUDGIJCTTCBTIPCIDUUTGITCTEDJGGPYPBPXHRPABTGBPSDJATJGYPXBTGPXIDJYDJGHATITBEHSTHRTGXHTHTIATHDJKTCXGFJTYTVPGSTPJRDTJG";
        System.out.println(analyse(texte));
        for (int decal = 1; decal <= 26; decal++) {
            System.out.println(decal + " : " + decription(texte, decal) + "\n");
        }
        
    }

    public static String decription(String texte, int decallage) {
        String texteDecripte = "";

        for (int c = 0; c < texte.length(); c++) {
            texteDecripte += decriptionChar(texte.charAt(c), decallage);
        }

        return texteDecripte;
    }

    public static char decriptionChar(char caractere, int decallage) {
        int ascii = (int)(caractere + decallage);
        if (ascii > 90) ascii -= 26; 
        char caractereDecripte = (char)ascii;

        return caractereDecripte;
    }

    public static Map analyse(String texte) {
        Map listeCar = new TreeMap();

        for (char letter : texte.toCharArray()) {
            if (listeCar.containsKey(letter)) {
                listeCar.put(letter, (int)listeCar.get(letter) + 1);
            } else {
                listeCar.put(letter, 1);
            }
        }

        for (int i = 65; i <= 90; i++) {
            if (!listeCar.containsKey((char)i)) listeCar.put((char)i, 0);
        }

        return listeCar;
    }
}
