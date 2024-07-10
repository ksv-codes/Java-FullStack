package A11CollNgenerics.Challenge;

public class Chall89 {
    public static void main(String[] args) {
        String ans = StringConcat("Keshav","Sharma","Tanuja");
        System.out.println(ans);
    }
    public static String StringConcat(String... a){
        String res="";//Cant make it null
        // StringBuilder sb = new StringBuilder();
        for (String string : a) {
            res+=string; //sb.append(a)
        }
        return res;//sb OR sb.toString;
    }
}
