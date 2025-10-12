package in.shriya.Statistics;

public class TestArrary {
public static void main(String[] args) {
    ArraryOperations opr=new ArraryOperations(new int[]{1,2,3,4,5,6,7,8,9,10});
    ArraryOperations.Statistics statistics = opr.new Statistics();
    System.out.println(statistics.mean());
}
}
