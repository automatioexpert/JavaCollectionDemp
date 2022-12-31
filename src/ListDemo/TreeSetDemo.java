package ListDemo;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("mike");
        set.add("simon");
        set.add("john");
        set.add("stewart");

        for (String s : set) {
            System.out.print(s+"  ");
        }

    }
}
