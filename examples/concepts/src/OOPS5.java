//access modifiers --> 1) public --> everywhere
// 2) private --> only within the class
// 3) protected and default

//getters/setters --> used for getting and setting private member variables

//POJO --> plain old java object
class Employee {

    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void myIntro() {
        System.out.println("Hey this is " + this.name);
    }

}

public class OOPS5 {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Rajesh", 50000);

        //emp.salary = 10000; //this is not good idea, may break up another part of code.
        //System.out.println(emp.salary);

        emp.setId(10000);
        System.out.println(emp.getId());

        emp.myIntro();
    }
}
