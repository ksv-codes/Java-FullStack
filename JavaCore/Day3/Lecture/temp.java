package A4OperatorsIfelseNoSys.Lecture;

public class temp {
    public static void main(String[] args) {
        boolean isA = false;
        boolean isB = true;
        boolean isC = true;

        if (isA) {
            System.out.println("a");
        }
        else if (isA) { //The moment ek bhi {else if/if} wala block true hua aage ke else/else if wale block nhi chalenge (if wale chal jaenge)
            System.out.println("b");
        }
        if (isB) { //The moment isme ghusha toh yeh pure is else ladder ko skip krdega
            System.out.println("B");
        }
        else if (isC) {
            System.out.println("c");
        }
        else{
            System.out.println("Jai Ho");
        }
    }
}
