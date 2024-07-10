package A11CollNgenerics.Challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chall90 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bear","zebra","lion","ant");//no need to worry ki implementation konsi list ki lu ArrayList ya koi bhi
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }
    public static void sortInDescending(List<String> stringList){
        Collections.sort(stringList);
        Collections.reverse(stringList);
    }
}
