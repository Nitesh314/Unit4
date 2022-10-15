package Practice_All_code_In_Lecture.Collection_FrameWork.Lists;
import java.util.*;
public class Stacks {
    public static void main(String[] args) {
       //Stack means first in last out=>
        //how to create stack...
        //create stack object..
        Stack<Integer> st=new Stack<>();
        //how to add value in stack...
        //there are 2 type to add value in stack
        //i=> .add();
        //ii=> .push();
        st.add(5);
        st.add(10);
        st.push(15);
        st.push(20);
        System.out.println(st);
        // what is peak() in stack
        //peak() means top of stack we know that what is top => st.length-1 ===> peak()
        st.peek();
        System.out.println(st.peek());

        //how to remove value in stack...
        /* there are two type to remove value in stack...
        *  i=> .remove();
        *  in remove method we put which index no.. we removing
        *
        * ii=> .pop();
        * in pop method it allweys  remove top or peek of stack...
        * */
        st.remove(0);//=>[10, 15, 20]
        st.pop();
        System.out.println(st); //=>[10, 15]

        /* imp=>
        *  empty stack are called under flow stack..
        *
        * if we cross the size of stack then called over flow...
        * */


    }
}
