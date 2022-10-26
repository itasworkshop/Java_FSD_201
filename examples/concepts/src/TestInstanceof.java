
class Dog{

    public void mySound(){
        System.out.println("Barking!!!!");
    }
}

class BullDog extends Dog{

    public void mySize(){
        System.out.println("Big size!!!");
    }
}

class GSDog extends Dog{

    public void myFriend(){
        System.out.println("I am more friendly.");
    }
}

class MyDogChoice{

    public void pickMyDog(Dog dog){
        if (dog instanceof BullDog){
            ((BullDog) dog).mySize();
        }else if (dog instanceof GSDog){
            ((GSDog) dog).myFriend();
        }
    }
}


public class TestInstanceof {

    public static void main(String[] args){
        Dog d1 = new BullDog();
        Dog d2 = new GSDog();

        MyDogChoice util = new MyDogChoice();
        util.pickMyDog(d2);


    }
}
