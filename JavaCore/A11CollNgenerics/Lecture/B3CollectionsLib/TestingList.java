package A11CollNgenerics.Lecture.B3CollectionsLib;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();//child ka object parent me
        strList.add("Keshav");
        strList.add("Sharma");
        strList.add(1,"Rajesh");//beech me bhi dal skte hain apne aap adjust ho jaega
        strList.remove(0);//Rajesh is 0th element
        if (strList.contains("Sharma")) {
            System.out.print(strList.indexOf("Sharma"));
            System.out.println(" Jai Parshuram");
        }
        System.out.println(strList.get(0));
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i)+" ");
        }
        System.out.println();
        for (String string : strList) {
            System.out.print(string+" ");
        }
    }
}
