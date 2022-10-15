package Practice_All_code_In_Lecture.RegularExprsion_ExcepationHandling;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegularExpresion {
    /* Regular Expression called as (regex) it is an expression which represents a
    * group of String according to a particular pattern .
    *
    * we can write a regular expression to represent all valid mains and indian mobile numbers.
    * we mainly usesd following 2 class from the java.util.regex packages to provide facility of re in java.
    * i=>java.util.regex.Pattern:- A pattern object represent compiled version of
    *    regular Expression.
    * ii=> java.util.regex.Matcher:-Amatcher object we can use to match the given pattern in the target String.
    *
    * */

    //Example=>
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[abc]");
        Matcher m= p.matcher("ramanad Swami");
        while(m.find()){ // find() method yah pata karta hai ki condition true hai or nahi
            System.out.println(m.start()+"-----"+m.group());
            //start() method yah start ke index no. ko print karta hai
            // end() method yah last ke indec no. print karta hai
            //group() method sabhi ko print karta hai

        }
    }
}
