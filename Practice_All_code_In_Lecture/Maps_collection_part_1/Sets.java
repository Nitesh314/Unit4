package Practice_All_code_In_Lecture.Maps_collection_part_1;
import java.util.*;
public class Sets {
    /*Set is a Data Structure
    * set is a collection of similar type of items.
    * set doesn't have duplicate.
    * when to use set in java .
    * if size of the data structure is unknown .
    * there are no duplicate when we use set.
    * the initial capacity of set is (16).
    * when  a load factor of set growing 0.75 means
    * 75% the capacity are double means 32.
    * set is unordered
    * */
    //how to create set ?
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
    //how to put value in set
    set.add(10);
    set.add(20);
    set.add(30);

        System.out.println(set);//output=>[20,10,30] => set is un ordered;

        set.remove(20); //=> yah value ko set se renove karta hai.
        System.out.println(set);//output=> [10,30]

        set.contains(20);
        System.out.println("shfudfshfrfhduifhrifh"+set);

    // this is way to put value in set.
//        for(int i=0;i<=16;i++){
//            set.add(i);
//        }
//        set.forEach(items-> System.out.println(items));
   }
}
