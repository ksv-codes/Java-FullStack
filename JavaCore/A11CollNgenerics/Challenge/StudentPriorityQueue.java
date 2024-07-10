package A11CollNgenerics.Challenge;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    


    private static class Student {
        private final String name;
        private final char grade;
        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }
        public String getName() {
            return name;
        }
        public char getGrade() {
            return grade;
        }
    }
}
