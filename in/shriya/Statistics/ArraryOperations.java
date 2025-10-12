package in.shriya.Statistics;

public class ArraryOperations {
 private int [] numbers;
   public ArraryOperations(int [] numbers){
    this.numbers=numbers;
   }

 public class Statistics{
    double mean(){
        double sum = 0;
        for (int number:numbers){
            sum=sum+number;
        }
     return sum/numbers.length;
    }
   double median(){
    return 0;
   }
 }
}
