// Collection Framework
import java.util.*;
public class Collection_Framework
{
    public static void main(String[] args)
    {
        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.add(1, 50); // This will add 50 at first position

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(90);

        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.remove(2));
        System.out.println(list.remove(Integer.valueOf(50))); // To remove value 50 from the list
       // list.clear();
        list.set(2, 1000);  // To update the value of Position 2
        list.contains(50);

        // To traverse the ArrayList
        for(int i=0; i<list.size(); i++)
        {
            System.out.println("The Element is : " + list.get(i));
        }

        for(Integer elm : list)
        {
            System.out.println("For each Element is : " + elm);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println("Iterator : " + it.next());
        }

        // Collections Class

        System.out.println("Min Element : " + Collections.min(list));
        System.out.println("Max Element : " + Collections.max(list));
        System.out.println(Collections.frequency(list, 30));
        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());

        */


        // Stack --------------------------------------------------

        /*

        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.print("Stack : " + animals);

        System.out.println(animals.peek()); // To see topmost animal

        animals.pop();

        System.out.println(animals.peek());

         */


        // Queue -------------------------------------------------------------

/*
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue);

 */




        // PriorityQueue ----------------------------------------------------------------

        /*

        PriorityQueue<Integer> pq = new PriorityQueue<>();  // Using Min Heap
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq); // Print min object at first

        pq.poll(); // Remove the Min element

        System.out.println(pq);

        System.out.println(pq.peek());


        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());  // Using Max Heap
        pq2.offer(40);
        pq2.offer(12);
        pq2.offer(24);
        pq2.offer(36);

        System.out.println(pq2); // Print max object at first

        pq2.poll(); // Remove the Max element

        System.out.println(pq2);

        System.out.println(pq2.peek());

        */

        // -----------------------------------------------------------------------------------

        // ArrayDeque

/*
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);        // offer function came from queue
        adq.offerFirst(12);  //  offerFirst function came from ArrayDequeue
        adq.offerLast(45);  //   offerLast function came from ArrayDequeue

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

 */



        //---------------------------------------------------------------------------------------

        /*
        // Set -> Always store unique element.

        Set<Integer> set = new HashSet<>();              // --> O(1)
     // Set<Integer> set = new LinkedHashSet<>();       // --> Always follows the order of Insertion.
     // Set<Integer> set = new TreeSet<>();            // -->  Always sort the Element   O(logN)
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);

        set.remove(54);

        System.out.println(set);

        System.out.println(set.contains(21));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);

         */

        // Sets of Custom Classes (hashCode and equals)  ----------------------------------------------

/*
        Set<Employee> empl = new HashSet<>();
        System.out.println(empl);

        empl.add(new Employee(1, "Saugata Dey"));
        empl.add(new Employee(2, "Akash"));
        empl.add(new Employee(3, "Rohit Kumar"));
        empl.add(new Employee(4, "Rahul Sahoo"));
        empl.add(new Employee(5, "Sumit Dey"));

        Employee e1 = new Employee(6, "Shyam");
        Employee e2 = new Employee(7, "Monty");

        System.out.println(e1.compareTo(e2));
*/
        /*
        Collections.sort(empl, new Comparator<Employee>() {
               @Override
               public int compare(Employee e1, Employee e2 ) {
                       return  e1.getName().compareTo(e2.getName());
               }
        });  */  // There might be some problem in this code




        // Map (Key, Value Pair)  ----------------------------------------------------------------------
        // TreeMap --> sort on the Basis of Key.

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);

        System.out.println(map);

        if(!map.containsKey("two"))
            map.put("two", 23);

        map.putIfAbsent("two", 23);

        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        for (String Key : map.keySet()){
            System.out.println(Key);
        }

        for(Integer value : map.values()){
            System.out.println(value);
        }

        System.out.println(map.containsValue(3));

        System.out.println(map.isEmpty());

        map.remove("Three");



        // Arrays Class -------------------------------------------------------------------

        /*
        int[] numbs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbs, 4);
        Arrays.sort(numbs);

        Arrays.fill(numbs, 12); // Every element of Array fill updated with 12.

        for (int elm : numbs)  // For-Each loop
            System.out.println(elm + " ");

        */

        // -------------------------------------------------------------------------------

        /*

            ArrayList<Emp> emps = new ArrayList<>();
            emps.add(new Emp("Durgesh", "123", 12));
            emps.add(new Emp("Ryan", "456", 15));
            emps.add(new Emp("Arti", "123", 12));

            System.out.println(emps);
            Collections.sort(emps);

            // Comparable
            System.out.println(emps);

            // Comparator
            Collections.sort(emps, new ID_Comparator());
            Collections.sort(emps, new Name_Comparator());

        */

        // -------------------------------------------------------------------------------

        /*
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);

        Iterator<Integer> it = l1.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

         */
















    }
}
