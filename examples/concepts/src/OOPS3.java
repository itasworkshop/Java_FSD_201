class Student1{

    int rollno;
    String name;
    int marks;

    Student1(int rollno,String name,int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

public class OOPS3 {

    public static void main(String[] args){

        //int marks = 87;
        Student1 st = new Student1(101,"Rajesh",85);

        if(st.marks >= 90 && st.marks<=100){
            System.out.println("Grade A"+st.name);
        }else if(st.marks >= 80 && st.marks<= 90){
            System.out.println("Grade B"+st.name);
        }else if(st.marks >= 70 && st.marks<= 80){
            System.out.println("Grade C"+st.name);
        }else {
            System.out.println("Failure!");
        }
    }
}
