package A13FunctionalProgramming.Lecture.FilternReduce;
import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static <T> void main(String[] args) {
        List<String> fruits =   List.of("Apple","Banana","Mango","Cherry","Date");
        System.out.println(fruits.size());//new ArrayList<>();
        System.out.println("printing Fruits Normally:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();


        System.out.println("Printing fruits Normally");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
            
        });
        System.out.println();
        System.out.println("Printing using filters:-");
        fruits.stream()
              .filter(fruit-> fruit.endsWith("e"))
              .forEach(fruit -> System.out.println(fruit));//Terminal operation
    }
}
