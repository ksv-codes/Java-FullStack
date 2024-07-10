package A11CollNgenerics.Lecture.B1VarArgss;

public class VarArgs {
    public static void main(String... args) {
        System.out.println(sum(3, 4));
        System.out.println(sum(1,2,3,4));
        //System.out.println(sum());//can be called with zero elements(if first n second not defined ) it means an empty array
    }
    public static int sum(int first,int second,int... a){//a ki man kr chalo ki array hi hain of variable length
          int sum=first+second;      //it confirms ki atleast two elements toh dene hi hain aage kitne bhi dedo (just sum jase method me jha just one or zero arguments allowed nhi hain)
          for (int i : a) {
            sum+=i;
          }
          return sum;
    }
    public static int sum(int a,int b){
        return a+b;
    }
}

