package practice;

public class Bicycle {
    //the bicycle has two fields or attributes
    public int gear;
    public int speed;
    // The Bicycle has one constructor
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;

    }

    // The bicyle class has this method to reduce the speed
    public  void applyBreak(int decrement){

        speed -= decrement; // speed = speed - decrement

    }

    //The bicycle has this method to reduce the speed
    public  void  speedup(int increment){
        speed += increment; // speed = speed + increment
    }

    //Yhe bicyle class has this method to print bicycle information
    public  String printInfo(){
        return("No of gears are " + "speed of bicycle is " + speed);
    }

}
