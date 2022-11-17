import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

class StudentObject {
    public String name;
    public int age;
    public String surname;
    public String email;


    public StudentObject StudentGenerator(String name, String surname, int age, String email) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.email = email;

        return this;
    }

}

class Student{
    int age;
    String name;
}

public class ArrList {
    public static void main(String[] args) {

        // Array list to store String objects
        ArrayList<String> listOne = new ArrayList<String>();

        // Array list to store any kind of objects
        ArrayList listTwo = new ArrayList();

        // Create Student Object
        StudentObject Mark = new StudentObject().StudentGenerator("Mark", "Anderson", 27, "markanderson@gmail.com");

        // Create basic student
        Student studentOne = new Student();
        studentOne.age = 26;
        studentOne.name = "Albert";

        // Add Data to listOne
        listOne.add("John");
        listOne.add("Jeff");
        listOne.add("Jim");
        listOne.add("Mark");
        listOne.add("Anna");
        listOne.add("Kirk");

        //listOne.add(4); error
        //listOne.add(2.6); error

        //Add data in listTwo
        listTwo.add("Dave");
        listTwo.add(5);
        listTwo.add(2.5);
        listTwo.add("Steve");
        listTwo.add("Dave The Second");
        listTwo.add(Mark);
        listTwo.add(studentOne);

        //Print reference to list
        System.out.println("List one is: " + listOne);
        System.out.println("List two is: " + listTwo);

        //Get element from a List
        String john = listOne.get(0);
        System.out.println("The name is " + john);

        Object obj = listTwo.get(2);
        System.out.println("The obj is " + obj);

        //Update Element
        listOne.set(2, "Andrew");

        //Remove Element
        listOne.remove(2);

        //listOne.clear();

        if(listOne.contains("John")) {
            System.out.println("We found John!");
        }

        //Iterate in ArrayList
        System.out.println("+++++++++Iterate with For loop+++++++++++");
        for(int i = 0; i < listOne.size(); i++){
            System.out.println(listOne.get(i));
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        System.out.println("----Iterate with enhanced for loop-------");
        Iterator<String> iterator = listOne.iterator();

        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
            if(str.equals("Kirk")){
                iterator.remove();
            }
        }
        System.out.println("-----------------------------------------");

        System.out.println("List one after the iterator is: " + listOne);
    }
}
