
//class variable --> common for all objects
//instance variable --> object specific

class Student3{

    //instance variable
    private int id;
    private String name;
    private int marks;

    //class variable
    private String uname = "IIIT Bengaluru";

    public Student3(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}

public class TestClassVsInstance {
    public static void main(String[] args){
        Student3 st1 = new Student3(101,"Rajesh",85);
        Student3 st2 = new Student3(102,"Suraj",95);
        Student3 st3 = new Student3(103,"Tom",75);


        System.out.println("Student info "+ st1.getId()+st1.getName()+st1.getMarks()+" "+st1.getUname());
        System.out.println("Student info "+ st2.getId()+st2.getName()+st2.getMarks()+" "+st2.getUname());
        System.out.println("Student info "+ st3.getId()+st3.getName()+st3.getMarks()+" "+st3.getUname());
    }
}
