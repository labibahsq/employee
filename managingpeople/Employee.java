//Object Class
public class Employee {
    double salary;
    String name;

    /*Constractor Employee*/
    public Employee() {
        salary = 0;
        name = "";
        
    }
    //Constructor Parameter
    public Employee(String name, double Salary) {
        this.name = name;
        this.salary= Salary;
    }
    //method
    public void print() {
        System.out.println("Name :"+name);
        System.out.println("Salary :"+salary);

   }

}
