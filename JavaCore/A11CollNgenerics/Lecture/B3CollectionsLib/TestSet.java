package A11CollNgenerics.Lecture.B3CollectionsLib;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();//Create a HashSet under the reference of Set Interface(Parent(Jisme child ka obj dala ja skta hain))
        System.out.println(names.add("Keshav"));                                   //Create a Set using the implementation of HashSet class
        System.out.println(names.add("Tanuja"));                                   //Create a Set using the implementation of HashSet class
        System.out.println(names.add("Sharma"));    //BOOLEANS HAIN will eittern true
        System.out.println(names);                               //Create a Set using the implementation of HashSet class
        Utility.print(names);// can have the different order
        System.out.println(names.add("Keshav"));
        System.out.println(names.size());
        System.out.println(names.contains("Keshav"));
        System.out.println(names.remove("Keshav"));
        Utility.print(names);
    }
}
