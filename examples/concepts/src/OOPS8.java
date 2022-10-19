//overriding --> same name method but in terms of parent child relationship
class Person1{

    public void myIntro(){
        System.out.println("Hey from person class");
    }
}

class Employee1 extends Person1{
    public void myIntro(){
        System.out.println("Hey from employee class");
    }

}

public class OOPS8 {
    public static void main(String[] args){
        Employee1 emp = new Employee1();
        emp.myIntro();
    }
}
