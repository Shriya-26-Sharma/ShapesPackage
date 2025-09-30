import java.util.*;
class guessingGame {
    int random;
    guessingGame(){
      random=(int)Math.ceil(Math.random()*100);
    }
    int guess(int guessNumber){
        return guessNumber-random;

    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    guessingGame ob=new guessingGame();
    System.out.println("Welcome to Guessing Game /n Enter any number between 1-100");
    int guess11,result ;
    do {
        System.out.println("Guess the number: ");
        guess11=sc.nextInt();
        result=ob.guess(guess11);
        if(result==0){
            System.out.println("YaYYYYY you guessed it!!!!!!!");
        }
        else if (result<0){
            System.out.println("Guess Higher");
        }else{
            System.out.println("Guess Lower");
        }
    }while(result!=0);
        sc.close();
   } 
}
