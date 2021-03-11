public class test {
    

    public static void main(String[] args) {

        int index = 0;
        Account[] objet = new Account[10];
        
        for(Account obj : objet) {
            obj = new Account();
        }

        for(Account obj : objet){
            obj.setData(index, index);
            index++;
        }

        for(Account obj: objet) {
            obj.printData();
        }
        
    }
}


class Account {
    int a;
    int b;
    public void setData(int c, int d) {
        a = c;
        b = d;
    }
    public void printData() {
        System.out.println("Valeur de a: " + a + " Valeur de b: " + b);
    }
}