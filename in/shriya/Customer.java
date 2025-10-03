package in.shriya;
public class Customer {
public static void main(String[] args) {
 BankAccount ob =new BankAccount("001","Shriya");
 ob.depositMoney(1000);
 System.out.println(ob.withdrawMoney(2000));
 ob.depositMoney(-50);
 ob.withdrawMoney(0);
}
}
