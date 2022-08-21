package practice;

public class Sum {
    //Overloaded method called summation. it takes two int value to sum

    public  int summation(int x, int y){
        return (x + y);
    }

    public int summation(int x, int y, int z){
        return(x + y + y);
    }

    //Overloaded method called summation. it takes two  value to sum
    public double summation(double x, double y){
        return (x + y);
    }

    public String nameContact(String firstName, String lastName){
        return ("First Name is: " + firstName + " Last Name is " + lastName);

    }

}
