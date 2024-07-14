package A13FunctionalProgramming.Lecture.MethodReferences;

import java.util.List;

public class TestingMethod {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);
        
        numbers.stream()
               .filter(num -> num%2==1)
               .forEach(num -> System.out.println(num));

        System.out.println("Using Method Reference");
        numbers.stream()
               .filter(num -> num%2==1)
               .forEach(System.out::println);

        int newsum2 = numbers.stream()
                             .reduce(0, (a,b)->a + b);//terminal methpd
        System.out.printf("\nsum using reduce is %d",newsum2);

        int newsum22 = numbers.stream()
        .reduce(0, Integer::sum);//terminal methpd
System.out.printf("\nsum using reduce is %d",newsum22);
    }
} 
