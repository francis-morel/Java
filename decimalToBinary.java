public class decimalToBinary {
    

    static String decimalToBinaryDec( double number){
        String resultat = "";
        double reste = number;

        for(int i = 0; i<1000; i++){
            String entier = "0";
            

            reste *= 2.0;
            if(reste >= 1.0){
                entier = "1";
                reste -= 1.0;
            }
            else{
                entier = "0";
            }

            resultat += entier;

            if (reste == 0.0){
               break;
            }
        }

        return resultat;
    }

    static String decimalToBinaryWhole(double number){
        String resultat = "";
        int nombre = (int)number;

        while (nombre > 1){
            if (nombre % 2 == 0){
                resultat = "0" + resultat;
            }
            else{
                resultat = "1" + resultat;
            }
            nombre /= 2;
        }
        return "1" + resultat;
    }

    public static void main(String[] args) {
        String[] separe = args[0].split("\\.");

        String whole = decimalToBinaryWhole(Double.parseDouble(separe[0]));
        String decimal = decimalToBinaryDec(Double.parseDouble("0." + separe[1]));
        
        System.out.println(whole + "." + decimal);
    }
}
