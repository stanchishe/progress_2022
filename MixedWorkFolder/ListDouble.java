import java.util.ArrayList;

public class ListDouble {
    public static void main(String[] args) {
        ArrayList<Double> doubleList = new ArrayList<>();

        doubleList.add(3.5);
        doubleList.add(4.5);
        doubleList.add(5.5);
        doubleList.add(6.5);
        doubleList.add(7.5);
        doubleList.add(8.1);

        double sum = 0;
        for(int i = 0; i < doubleList.size(); i++) { 
            sum += doubleList.get(i);
        }
        System.out.print(sum);
    }
}
