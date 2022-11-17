import java.util.Iterator;
import java.util.TreeSet;

public class HashTreeExample {
    public static void main(String[] args){
        TreeSet<String> set = new TreeSet<>();

        //Here data is not added as indexing
        //Instead we have hashCodes

        set.add("John");
        set.add("Jeff");
        set.add("Adam");
        set.add("Kate");
        set.add("John");
        set.add("Peter");
        set.add("Maria");
        set.add("John");
        set.add("Kate");
        set.add("Joe");

        //Data is unique
        //Data is unsorted in the output due to hashing

        System.out.println("The set is: " + set);
        System.out.println("The size of the set is: " + set.size());

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        set.remove("John");
        System.out.println("The set after removing John is: " + set);

        if(set.contains("John")) {
            System.out.println("How did we find John?!");
        }

        System.out.println("The size of the set is: " + set.size());
    }
}
