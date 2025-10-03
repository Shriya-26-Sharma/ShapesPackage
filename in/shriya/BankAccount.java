package in.shriya;
class BankAccount {
 private String accntNumber;
 private String accntHolderName;
 private double balance;

 public BankAccount(String accntNumber, String accntHolderName)
{
this.accntNumber=accntNumber;
this.accntHolderName=accntHolderName;
}

 public void depositMoney(double money){
    if(money<=0){
        System.out.println("Error");
    }else{
    balance +=money;
 }
}
 public double withdrawMoney(double money){
    if(balance>=money){
    balance -=money;  
    System.out.println("Name:"+accntHolderName);
    System.out.println("Account Number:"+accntNumber);
    System.out.println("Withdrawn Ammount :"+money);
    }else if(money<=0){
     System.out.println("");
    }else{
        money=balance;
        balance=0;
    }
    return money;
 }
}
