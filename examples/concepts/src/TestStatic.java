//static --> no object required

class Student4{
    private int id;
    private String name;
    static int val =10;

    static void printMe(){
        System.out.println("Hello from static.");
    }

}

public class TestStatic {
    public static void main(String[] args){
        Student4.val = 100;
        System.out.println(Student4.val);

        Student4.printMe();
    }

}
