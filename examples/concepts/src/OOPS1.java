
//oops --> consider everything as object
//object -->    1) properties/attributes
//              2) functionalities/behavior
//class --> template/blueprint for creating object
//empty enquiry form --> class
//filled enquiry form --> object

class Student{

    int id;
    String name;

    //constructor --> used for initialisation
    Student(int id,String name){
        System.out.println("from constructor.");
        this.id = id;
        this.name = name;
    }

    //this --> current object
    public void myIntro(){
        System.out.println("Hi this is "+this.name+" and my id is "+this.id);
    }
}

public class OOPS1 {
    public static void main(String[] args){
        Student st1 = new Student(101,"Rajesh");

        Student st2 = new Student(102,"Suraj");

        st1.myIntro();
        st2.myIntro();
    }
}





