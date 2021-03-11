public class BinaryToHexa {

    private static String hexaValue(String search) {
        String[] hexaValues = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        String[] hexaIndex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

        for(int i = 0; i < hexaValues.length; i++) {
            if(search.equals(hexaValues[i])){           
                return hexaIndex[i];
            }
        }        
        return "-1";
    }

    private static String correctLeadingBinary(String binary) {
        switch(binary.length() % 4){
            case 0:
            return binary;
            
            case 1:
            return "000" + binary;

            case 2:
            return "00" + binary;

            case 3:
            return "0" + binary;
        }
        return binary;
    }


    public static void main(String[] args) {
        String binary = args[0];
        String binaryCorrected = correctLeadingBinary(binary);
        String hexaReturn = "";

        for(int i = 0; i <= binaryCorrected.length() -4; i += 4) {
            hexaReturn += hexaValue(binaryCorrected.substring(i, i+4));
        }
        System.out.println(hexaReturn);
    }
}
