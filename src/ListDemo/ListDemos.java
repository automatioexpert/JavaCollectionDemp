package ListDemo;

import java.util.List;
import java.util.ArrayList;
public class ListDemos {

    public static void main(String[] args) {

        List<String> arrayList =new ArrayList<String>();
        System.out.println(arrayList); //[] -> Blank List - Without any element
        arrayList.add("steve");
        arrayList.add("Simon");
        arrayList.add("Mark");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        //Print all the element from the list
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println("=============================");
        //For Each loop
        for(String al:arrayList){
            System.out.println(al);
        }

    }
}
