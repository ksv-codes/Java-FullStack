package A11CollNgenerics.Lecture.Enums.Challenge;

public class TestDay {
    public static void main(String[] args) {
        System.out.println("Printing the days");
        Day day = Day.MONDAY;


        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        // .
        // .
        System.out.println(Day.SUNDAY);


        System.out.println();
        System.out.println("Prining by for loop");
        Day[] days = Day.values();//Day ki values are of Day enum type (not integer ya String) and as array aata hain toh Day[]
        for (Day day2 : days) {
            System.out.println(day2);
        } 
    }
}
