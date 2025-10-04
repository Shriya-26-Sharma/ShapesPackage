package in.Shriya;
 class Employee {
    private String name;
    private int age;
    private double salary;
    String getEmployeeDetails(){
        return "Employee Details: Name:"+name+" ,  Age:"+age+"  , Salary: "+salary;
    }
    Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
    this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    public double getsalary(){
        return salary;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }

}
