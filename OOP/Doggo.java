public class Doggo {

    public final String subClassOfAnimas = "mammal";
    private int age;
    private String name;

    public void bark() {
        System.out.println("I'm barking!");
    }

    public Doggo(){

    }
    public Doggo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
