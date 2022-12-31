package ListDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    //LinkedHashSet-->Elements added maintain the same order
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<String>();
        set.add("mike");
        set.add("tyson");
        set.add("steve");
        set.add("Bill");
        System.out.println(set);

    }
}
