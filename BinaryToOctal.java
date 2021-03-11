public class BinaryToOctal {

    private static int octalValue(String search){
        String[] octalValues = {"000", "001", "010", "011", "100", "101", "110", "111"};

        for(int i = 0; i < octalValues.length; i++){
            if(search.equals(octalValues[i])){           
                return i;
            }
        }        
        return -1;
    }

    private static String correctLeadingBinary(String binary){
        if(binary.length() % 3 == 1){
            binary = "00" + binary;
        }
        else if(binary.length() % 3 == 2){
            binary = "0" + binary;
        }
        return binary;
    }


    

    public static void main(String[] args){
        String binary = args[0];
        String binaryCorrected = correctLeadingBinary(binary);        
        String octal = "";

        for(int startInt = 0; startInt <= binaryCorrected.length()-3; startInt += 3){
            String section = binaryCorrected.substring(startInt, startInt+3);
            octal += octalValue(section);
        }
        System.out.println(octal);
    }
}
