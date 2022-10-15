package Practice_All_code_In_Lecture.Collection_FrameWork.Lists;
import java.util.*;

public class Queues {
    //queue is nothing it is first in first out...
    public static void main(String[] args) {
        Queue<Integer> qu=new LinkedList<>();
        //in queue only add method are work. or remove method are work.. as well as peek() metosd work...

        qu.add(5);
        qu.add(10);
        qu.add(15);
        System.out.println(qu);//=>[5, 10, 15]

        //check peek()...
       // in queue peek means first value of queue..
        System.out.println(qu.peek());//=>5;

        //remove value in queue...
       // in queue remove method are remove first value of queue...
        qu.remove();
        System.out.println(qu);//=>[10, 15]
    }
}
