public class DebuggerTwo {
    public static void main(String[] args) {

        Doggos dogOne = new Doggos("Bryan");
        dogOne.setAge(5);
        dogOne.setFood("Brit");
        System.out.println(dogOne.getAge());

        Doggos dogTwo = new Doggos("Шаро");
        dogTwo.setAge(3);
        dogTwo.setFood("GO!");
        System.out.println(dogTwo.getAge());

        Doggos[] doggos = new Doggos[2];

        doggos[0] = dogOne;
        doggos[1] = dogTwo;
    }
}
