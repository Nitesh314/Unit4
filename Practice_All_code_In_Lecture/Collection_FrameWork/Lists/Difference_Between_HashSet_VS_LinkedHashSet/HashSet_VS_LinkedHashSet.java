package Practice_All_code_In_Lecture.Collection_FrameWork.Lists.Difference_Between_HashSet_VS_LinkedHashSet;
import java.util.*;

public class HashSet_VS_LinkedHashSet {
    /* Differrence between HashSet and LinkedHashSet;
    *  LinkedHashSet  is a child of HashSet.
    * LinkedHashSet preserve order of items...
    * HashSet never follow order of items LinkedHashSet follow the order of items...
    * */
    //Example   HashSet =>
    public static void main(String[] args) {
        //create HashSet object
        Set<String> hs=new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("panjab");
        hs.add("gujarat");
        System.out.println(hs);//=>[Delhi, panjab, gujarat, Mumbai]
        //the output is noy in orderd...

        //Example of LinkedHashSet=>

        //create LinkedHashSet object...
        Set<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("panjab");
        lhs.add("gujarat");
        System.out.println(lhs);//=>[Delhi, Mumbai, panjab, gujarat]
       //this is in order...

    }

}
