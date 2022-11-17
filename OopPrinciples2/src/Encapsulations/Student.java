package Encapsulations;

public class Student {

    private String id;
    private int age;
    private String name;

    public Student(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getNameOfStudent() {
        return name;
    }

    public void setAge(int age) {
        if(age > 18) {
            this.age = age;
        }
    }

    public void setNameOfStudent(String name) {
        this.name = name;
    }
}