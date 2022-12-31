package ListDemo;

import java.util.TreeSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<Integer>();
        set.add(10);
        set.add(100);

        set.add(3);
        set.add(89);

        for(int i=0;i<set.size();i++){
           System.out.println(set);  //[3, 10, 89, 100] TreeSet--> Performs the sorting of all the elements. Elements are sorted in ascending order

        }

    }
}
