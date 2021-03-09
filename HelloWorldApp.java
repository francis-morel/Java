class HelloWorldApp {

    static int[] addition(){
        int[] nombre = new int[10];
        for(int i = 0; i < nombre.length; i++){
            nombre[i] = i;
        }
        return nombre;
    }

    public static void main(String[] args) {
        for(int i: addition()){
            System.out.println(i);
        }
    }
}