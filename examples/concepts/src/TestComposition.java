
//code reusabilty --> 1) composition --> has-a relationship
//                --> 2) inheritance --> is-a relationship

//car --> borrow from neighbour -->has-a
//      --> father's car --> is-a

class Car{

    private int id;
    private String model;

    public Car(int id, String model) {
        this.id = id;
        this.model = model;
    }

}

class Person{

    private int id;
    private String name;
    private Car car; //has a relationship

    public Person(int id, String name, Car car) {
        this.id = id;
        this.name = name;
        this.car = car;
    }

}


public class TestComposition {

    public static void main(String[] args){
        Car mycar = new Car(1100,"Creta");

        Person person = new Person(101,"Rajesh",mycar);


    }
}
