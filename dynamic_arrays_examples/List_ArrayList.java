import java.util.ArrayList;


public class List_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<Integer>();

        t.add(1);
        t.get(0);

        t.add(15);
        t.set(1, 16);

        t.size();
        t.isEmpty();

        int fromIndex = 0;
        int toIndex = 2;
        t.subList(fromIndex, toIndex);
    }
}
