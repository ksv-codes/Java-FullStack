package A11CollNgenerics.Challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chall98 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        map.put("Bharat", "New Delhi");
        map.put("China", "Beiging");
        map.put("Pakistan", "Islamabad");
        map.put("Bangladesh", "Islamabad");
        map.put("Srilanka", "Colombo");

        System.out.print("Please Enter the country name");
        String country = input.next();
        if (map.containsKey(country)) {
            System.out.printf("Capital of %s is %s",country,map.get(country));
        }
        else{
            System.out.println("Sorry I dont know");
        }
    }
}
