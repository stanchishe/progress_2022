public class Doggos  {
    private String doggoName;
    private int doggoAge;
    private String favoriteFood;
    public Doggos(String doggoName) {
        this.doggoName = doggoName;
    }

    public String getName() {
        return doggoName;
    }

    public int getAge() {
        return doggoAge;
    }

    public String getFood() {
        return favoriteFood;
    }

    public void setAge(int age) {
        doggoAge = age;
    }

    public void setFood(String food) {
        favoriteFood = food;
    }
}
