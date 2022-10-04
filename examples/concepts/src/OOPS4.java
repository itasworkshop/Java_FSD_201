class Student2{

    int rollno;
    String name;
    int marks;

    Student2(int rollno,String name,int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

class StudentGradeCalculator{

    public String gradeCalculator(Student2 st){
        if(st.marks >= 90 && st.marks<=100){
            return "Grade A";
        }else if(st.marks >= 80 && st.marks<= 90){
            return "Grade A";
        }else if(st.marks >= 70 && st.marks<= 80){
            return "Grade A";
        }else {
            return "Failure!";
        }
    }
}

public class OOPS4 {

    public static void main(String[] args){

        //int marks = 87;
        Student2 st = new Student2(101,"Rajesh",85);
        Student2 st1 = new Student2(102,"Suraj",95);
        StudentGradeCalculator util = new StudentGradeCalculator();

        System.out.println("The grade of student "+ st.name+ " is "+util.gradeCalculator(st));
        System.out.println("The grade of student "+ st1.name+ " is "+util.gradeCalculator(st1));
    }
}
