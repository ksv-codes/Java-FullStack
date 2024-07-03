package seven.lecture;

public class forEach {
    public static void main(String[] args) {
        String[] starArr = new String[]{"Keshav","tanuja"};
        printStr(starArr);
        for (int i = 0; i < starArr.length; i++) {
            System.out.print(starArr[i]+" ");
        }
    }

    private static void printStr(String[] srr) {
        for (String s : srr) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

}
 