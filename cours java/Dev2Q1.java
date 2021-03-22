public class Dev2Q1 {
    public static void main(String[] args) {
        double total = 0;
        double terme = 1;

        for(int i = 0; i < 6; i++) {
        total = total + terme;
            System.out.println(total);
            terme = terme / 100; 
            System.out.println(terme);
        }
    }
}    