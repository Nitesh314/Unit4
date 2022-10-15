package Practice_All_code_In_Lecture.Collection_FrameWork.Lists;
import java.util.*;
public class TreeSets {
    public static void main(String[] args) {
        //treeSet are use to sort the value ..
        // it is called sorted set...
        // create string treeset... object...
        Set<String> ts=new TreeSet<>();
        ts.add("Delhi");
        ts.add("mumbai");
        ts.add("panjab");
        ts.add("gujarat");
        System.out.println(ts);//=>[Delhi, gujarat, mumbai, panjab]
        // tree set follow the capital leter first to small..
        //tree set sorted the value alphabatical...
        Set<Integer> ts1=new TreeSet<>();
        ts1.add(8);
        ts1.add(9);
        ts1.add(5);
        ts1.add(10);
        System.out.println(ts1);//=>[5, 8, 9, 10];
    }
}
