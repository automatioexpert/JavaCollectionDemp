package ListDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,String> map=new HashMap<String,String>();
        map.put("name","steve");
        map.put("id","1000000");
        map.put("role","CEO");
        System.out.println(map);
    }
}
