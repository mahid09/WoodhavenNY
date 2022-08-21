package practice;

public class Driver9 {
    public  static void main(String[] args){
        MountainBike mb = new MountainBike(3,100,25);
        System.out.println("Original value=> " + mb.printInfo());
        mb.applyBreak(25);
        System.out.println("Decreasing the speed => " +mb.printInfo());
        mb.speedup(50);
        System.out.println("Increasing the speed => " + mb.printInfo());
        mb.setHeight(35);
        System.out.println("Increasing the height" + mb.printInfo());
    }
}
