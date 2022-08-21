package practice;

public class EnumTest {

    Day day;

    public EnumTest(Day day){
        this.day = day;
    }

    public void dayIsLike(){

        switch (day){

            case  MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends sucks");
                break;
            default:
                System.out.println("Weekdays are so ");
                break;
        }
    }
}
