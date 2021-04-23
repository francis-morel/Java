import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {

        //ceci est une collection en désordre
        Set<Integer> t = new HashSet<Integer>();
        t.add(4);
        t.add(1);
        t.add(15);
        t.add(95);

        boolean x = t.countains(15);

        t.remove(15);

        boolean y = t.countains(15);

        //t.clear(); //clear entire set

        boolean isSetEmpty = t.isEmpty();
        int setSize = t.size();
    }
}
