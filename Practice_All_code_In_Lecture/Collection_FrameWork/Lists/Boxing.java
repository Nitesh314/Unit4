package Practice_All_code_In_Lecture.Collection_FrameWork.Lists;

import Practice_All_code_In_Lecture._2DArray.InstanceOfOperator;

public class Boxing {
    public static void main(String[] args) {
        /* What is Boxing ?
        * Boxing means when we convert primitive data type
        * to wrapper data type this converting prossier called
        * Boxing...
        * */
        //Example=>
        System.out.println("*************");
        int i=10;
      //  Integer c=Integer.valueOf(i); => this is long way... so here sort is
        Integer c=i;
        System.out.println(c);
        System.out.println(c instanceof Integer);// true ...
    }

}
