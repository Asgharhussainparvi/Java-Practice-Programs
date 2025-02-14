package ArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {
    public static void main(String[] args){
        //ArrayList Use
        List<String> StringList = new ArrayList<>();
        StringList.add("Asghar");
        StringList.add("Hussain");
        // StringList.add(10); Error

        //Map use
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Welcome!");
        map.put(2 , "Java");
        // map.put("3" , "programming") Error

        System.out.println("List Elements ; " + StringList);
        System.out.println("Map Elements : " + map);

    }
}
