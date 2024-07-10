package A11CollNgenerics.Lecture.Enums.Challenge;



public class TestEnhancedDay {
    public static void main(String[] args) {
        EnhancedDay[] daze = EnhancedDay.values();
        for (EnhancedDay enhancedDay : daze) {
            System.out.print(enhancedDay+" ");
            System.out.println(enhancedDay.getType());
            System.out.println();
        }

        EnhancedDay daya = EnhancedDay.MONDAY;
        System.out.println(daya.getType());
    }
   
   

    
}
