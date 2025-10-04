package in.Shriya;

public class TestEmployee {
 public static void main(String[] args) {
    Employee emp=new Employee("Shriya", 15, 350000);
    System.out.println(emp.getEmployeeDetails());
    emp.setage(20);
    System.out.println(emp.getEmployeeDetails());
 }
}
