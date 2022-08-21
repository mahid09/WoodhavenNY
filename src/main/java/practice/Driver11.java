package practice;

public class Driver11 {
    public static void main(String[] args){
        Encapsulate encapsulate = new Encapsulate();
        encapsulate.setAge(30);
        encapsulate.setName("John");
        encapsulate.setRoll(15);





        System.out.println("Geek's name:" + encapsulate.getName());
        System.out.println("Geek's age:" + encapsulate.getAge());
        System.out.println("Geek's roll:" + encapsulate.getRoll());
    }
}
