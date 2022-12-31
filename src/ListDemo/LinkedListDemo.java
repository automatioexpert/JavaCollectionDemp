package ListDemo;

import java.util.List;
import java.util.LinkedList;
public class LinkedListDemo {

    public static void main(String[] args) {
        //Here the insertion order is preserved

        List<String> ll=new LinkedList<String>();
        ll.add("steve");
        ll.add("mike");
        ll.add("uber");
        ll.add("stewart");
        System.out.println(ll);

        //Print all the elements using for loop
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }

    }
}
