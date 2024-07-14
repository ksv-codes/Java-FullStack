package A13FunctionalProgramming.Lecture.FilternReduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);
        int sum = 0;
        for (Integer number : numbers) {
            sum+=number;
        }
        System.out.println(sum);

        int newSum = numbers.stream()
               .reduce(0, new BinaryOperator<Integer>() {

                @Override
                public Integer apply(Integer t, Integer u) {
                    return t+u;
                }
                
               });
        System.out.printf("\nsum using BinaryOpertor is %d",newSum);

        int newsum2 = numbers.stream()
                             .reduce(0, (a,b)->a + b);//terminal methpd
        System.out.printf("\nsum using reduce is %d",newsum2);

        int max = numbers.stream()
                         .reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b);
        System.out.printf("Max value is: ",max);


    }
}
