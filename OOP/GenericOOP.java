public class GenericOOP {
    public static void main(String[] args) {
        Doggo dogOne = new Doggo();

        dogOne.setAge(5);
        dogOne.setName("Kirk");

        //dogOne.subClassOfAnimas = "reptile";

        dogOne.bark();
        int dogAge = dogOne.getAge();

        System.out.println("The dogs age is " + dogAge);
        System.out.println("The dog is " + dogOne.subClassOfAnimas);

        System.out.println("The name of the dog is " + dogOne.getName());

        Doggo dogTwo = new Doggo("James", 7);

        System.out.println("The dog is " + dogTwo.subClassOfAnimas);
        System.out.println("The name of the dog is " + dogTwo.getName());
        System.out.println("The age of the dog is " + dogTwo.getAge());

        System.out.println("James was born on " + ConstantsStorage.JAMES_BDAY);

        //ConstantsStorage storage = new ConstantsStorage();
        System.out.println("The number of days in a week is " + ConstantsStorage.NUMBER_OF_DAYS_IN_A_WEEK);
    }
}
