package A11CollNgenerics.Lecture.B3CollectionsLib;

import java.util.Collection;

public class Utility {          //manliya ki List wala collection aaegi but woh kis type ki aaegi integer string kuch bhi ho skti hain (Collection is List and E=Integer)
    public static <E> void print(Collection<E> collection){ //koi bhi collection aaega woh Collecion interface ka child ka hi object hoga toh collection interface me dal skte hain uss object ko ab yeh nhi pta ki woh object kis DataType(wrapperclass) ka aaega toh Generics use kr liya
        System.out.print("collection is:");
        for (E coll : collection) {//E is generic that represent all the DataTypes(Interger,String,Charater etc...)
            System.out.print(coll+" ");
        }
        System.out.println();
    }
}

// public static void print(Collection collection){
//     for (Object coll : collection) {//collection(List manlete hain aayi) me jo bhi object(wrapper class Integer,String etc..) hone wala uska DT(INteger,String etc.. ) hme nhi pta hian it can be Integer,Charater(wrapper class ) but woh objects honge toh Object class ke hi child toh unko Object(sbki parent) class ke reference me dal do
//         System.out.printf("%s ",coll.toString());
//     }
// }
