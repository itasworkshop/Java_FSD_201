//polymorphism --> one thing behaving differently

class Calculator{

    //method over loading --> same name method but with different type or number of parameters
    public void addition(int a,int b){
        int result = a+b;
        System.out.println("Addition of two numbers is "+result);
    }

    public void addition(float a,float b){
        float result = a+b;
        System.out.println("Addition of two float numbers is "+result);
    }

    public void addition(int a,int b,int c){
        int result = a+b+c;
        System.out.println("Addition of three numbers is "+result);
    }
}

public class OOPS7 {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.addition(20,30);
        calc.addition(20,30,40);
    }

}
