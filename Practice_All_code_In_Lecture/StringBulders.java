package Practice_All_code_In_Lecture;

import javax.print.DocFlavor;

public class StringBulders {
    public static void main(String[] args) {
      StringBuilder s=new StringBuilder("hello ");
      s.append("java");
        System.out.println(s);
        //how to convart string builder to string
       String x= s.toString();
        System.out.println(x);
        x.concat("rwm");
        System.out.println(x);//output=> hello java because this is string and string are immutable;

        //how to convert string to stringBuilder;
        StringBuilder m=new StringBuilder(x);//this way to convart string builder to string;

        m.append(" form nitesh Shukla");
        System.out.println(m);//output=> hello jav afrom nitesh shukla because this is mutable;

    }
}
