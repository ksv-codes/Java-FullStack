package A13FunctionalProgramming.Challenge.Challenge108;

import java.util.List;

public class filternreduce {
    public static void main(String[] args) {
        List<String> strs = List.of("Prashant Jain","is teaching java","Suar","on KG Coding","Best youtube channel");
        String result = strs.stream()
            .filter(str -> str.length()>10)
            .reduce("",(a,b)-> a+" "+b);

        System.out.println(result);
    }       
}
