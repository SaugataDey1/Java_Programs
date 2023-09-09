package Durgesh.hashmap;

import java.util.HashMap;
import java.util.Map;

public class mainExample
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> friends = new HashMap<>();

        friends.put("Ankit", 20);
        friends.put("Uttam", 25);
        friends.put("Rahul", 27);
        friends.put("Saugat", 54);
        friends.put("Sita", 50);

        System.out.println(friends);

        friends.remove("Rahul");

        System.out.println(friends);

        // This way it's showing --> ConcurrentModificationException
        for(Map.Entry<String, Integer> node : friends.entrySet())
        {
         //   Map.Entry current = node;
            String name = node.getKey();

            if(node.getKey().equals("Saugat"))
                friends.remove(name);
            else
                continue;
        }

        System.out.println(friends);
    }
}
