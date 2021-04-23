import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {
    public static void main(String[] args) {

        //ceci est une collection en ordre
        Set<Integer> t = new TreeSet<Integer>();
        t.add(5);
        t.add(15);
        t.add(4);

        t.remove(4);

        t.size();

        t.isEmpty()¸;

        t.contains(15);

        //t.clear(); //vider le set
    }
}
