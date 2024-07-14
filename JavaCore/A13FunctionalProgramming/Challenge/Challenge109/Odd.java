package A13FunctionalProgramming.Challenge.Challenge109;

import java.util.List;

public class Odd {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,6,7,8,9,4);
        numbers.stream()
               .filter(num -> num%2 == 1)
               .forEach(num->System.out.println(num));
    }
}
