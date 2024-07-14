package A13FunctionalProgramming.Challenge.Challenge107;

import java.util.List;

public class PrintLamb {
    public static void main(String[] args) {
        List<String> names = List.of("Prashant","Keshav","Tanuja");
    names.stream()
         .forEach(name -> System.out.println(name));
    }
}
