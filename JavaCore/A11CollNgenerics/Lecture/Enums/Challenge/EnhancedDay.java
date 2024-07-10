package A11CollNgenerics.Lecture.Enums.Challenge;

public enum EnhancedDay {
    SUNDAY("Weekend"),
    MONDAY("WeekDay"),
    TUESDAY("WeekDay"),
    WEDNESDAY("WeekDay"),
    THRUSDAY("WeekDay"),
    FRIDAY("WeekDay"),
    SATURDAY("Weekend");

    private String type;

    EnhancedDay(String type){
        this.type = type;
    }

    public String getType() { 
        return type;
    }
}

