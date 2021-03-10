public class decimalToBinary {
    

    static String decimalToBinaryFN( double number){
        String resultat = "0.";
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

    public static void main(String[] args) {

        System.out.println(decimalToBinaryFN(Double.parseDouble(args[0])));
    }
}
