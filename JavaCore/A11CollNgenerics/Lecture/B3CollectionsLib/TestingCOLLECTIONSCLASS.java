package A11CollNgenerics.Lecture.B3CollectionsLib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCOLLECTIONSCLASS {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(4);
        numList.add(6);
        numList.add(2);
        Utility.print(numList);
        Collections.sort(numList);
        Utility.print(numList);
        Collections.reverse(numList);
        Utility.print(numList);
        
        List<Integer> unmodi = Collections.unmodifiableList(numList);
        Utility.print(unmodi);
        // unmodi.add(4); won't work
    }
}
