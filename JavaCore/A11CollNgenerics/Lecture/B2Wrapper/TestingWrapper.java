package A11CollNgenerics.Lecture.B2Wrapper;

public class TestingWrapper {
    public static void main(String[] args) {
        //Integer first = new Integer(55);
        Integer first = Integer.valueOf(55);
        Integer firstS = Integer.valueOf("55");//will convert stringInteger into integer
        System.out.println(firstS);
        Integer first2 = 55; //Automatic conversion from integer to object(AUTOBOXING)
        //can call various methods on them
        Integer a = null;//can put null in the a (int a me nhi kr skte the)
        int second = first;//UNBOXING

    }
}
