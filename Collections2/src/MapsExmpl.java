import java.util.HashMap;

public class MapsExmpl {
    public static void main(String[] args) {
        HashMap<String, Integer> studentAges = new HashMap<>();

        studentAges.put("Mark", 29);
        studentAges.put("Steve", 34);
        studentAges.put("Anne", 24);

        System.out.println(studentAges);

        System.out.println(studentAges.get("Mark"));

        System.out.println(studentAges.containsKey("Anne"));

        System.out.println(studentAges.containsValue(54));

        studentAges.put("Mark", 30);
        System.out.println(studentAges);

        studentAges.replace("Steve", 35);
        System.out.println(studentAges);

        studentAges.replace("Kirk", 234);
        System.out.println(studentAges);

        studentAges.putIfAbsent("Mark", 68);
        System.out.println(studentAges);

        studentAges.putIfAbsent("Kirk", 234);
        System.out.println(studentAges);

        studentAges.remove("Kirk");
        System.out.println(studentAges);
    }
}
