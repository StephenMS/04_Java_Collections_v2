import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class exercise_collections {
    public static void main(String[] args) {
        // start code here ...
        HashMap<String, Integer> testHashMap = new HashMap<String, Integer>();
        TreeMap<String, Integer> testTreMap = new TreeMap<String, Integer>();
        LinkedHashMap<String, Integer> testLinkedHashMap = new LinkedHashMap<String, Integer>();

        testHashMap.put("Pesho", 10);
        testHashMap.put("Gosho", 12);
        testHashMap.put("Tosho", 8);
        System.out.println(testHashMap);
        for (String s : testHashMap.keySet()) {
            System.out.printf("%s --> %d \n", s, testHashMap.get(s));
        }
        System.out.println("HashMap demo\n");

        testTreMap.put("Pesho", 10);
        testTreMap.put("Gosho", 12);
        testTreMap.put("Tosho", 8);
        System.out.println(testTreMap);
        for (String s : testTreMap.keySet()) {
            System.out.printf("%s -- > %d \n", s, testTreMap.get(s));
        }
        System.out.println("TreeMap demo: sorted Map with red-black tree\n");   // using red-black tree structure

        testLinkedHashMap.put("Pesho", 10);
        testLinkedHashMap.put("Gosho", 12);
        testLinkedHashMap.put("Tosho", 8);
        System.out.println(testLinkedHashMap);
        for (String s : testLinkedHashMap.keySet()) {
            System.out.printf("%s --> %d \n", s , testLinkedHashMap.get(s));
        }
        System.out.println("LinkedHashMap: in order by input\n");

        System.out.println(testLinkedHashMap.containsKey("Ivan"));
        testLinkedHashMap.clear();
        System.out.println(testLinkedHashMap);

    }
}
