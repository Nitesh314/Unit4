package Practice_All_code_In_Lecture;

public class StringMethods {
    public static void main(String[] args) {
        //how to concat string
        //there are two way to concat string;
        String s1="Nitesh";
        String s2="Shukla";
        System.out.println(s1+s2);//1st way to concat; output=>NiteshShukla
        System.out.println(s1.concat(s2));//2nd way  to concat; output=>NiteshShukla;

        //**************************************************************************************************************

        // how to finde string length;
        //we find string length using length() method;
        System.out.println("string".length());// output=>6
        //2nd example;
        String s3="ram ka nam amar hai";
        System.out.println(s3.length());//output=>19 include 4 space;

        //**************************************************************************************************************

        //how to print index number of character;
        String s4="Mahadev";
        //print the character using index no.
        System.out.println(s4.charAt(5));//output=> e because e is stay in 5 index no.

        //**************************************************************************************************************

        // how to print substring in one word;
        System.out.println(s4.substring(1));// output is ahadev m is remove by substring();

        //print the only maha;
        System.out.println(s4.substring(0,4));//how to put 0 or 4 in side substring();
        // here we print maha word inside s4
        // in maha word  index no. of m is (0) ;
        // last word in maha is a;
        // what is index no of a => 3;
        // every time we put last word indexNo+1;inside substring method;
        //s4.substring(0,4);

        //**************************************************************************************************************

        //how to print index no. using character;
         //we use indexOf(); method;
        String s5="Ramlal";
        //print indexno of m;
        System.out.println(s5.indexOf('m'));// output => 2;
        //indexof() meethod are overloaded means it will suport singal character or multiple character;
        System.out.println(s5.indexOf("lal"));//output=> 3;

        //in Ramlal string l is two time but when we print indexOf('l') then the output is 3 it is not given 5

        //**************************************************************************************************************

        //how to print last index no. of charecter;
        String s6="Mohablal";
        System.out.println(s6.lastIndexOf('l'));//output=>7 the last word l index number;

        //**************************************************************************************************************

        /*    how to comapre strings;

        * there are two method to comapre strings;
        *  i=> == double equale to operator;
        * ii=> equals() method;
        *
        *  i=> What is double equals operator ?
        *      == double equals operator compare string and object address;
        *
        * ii=> What is equals() method ?
        *     equals() method are compare content and not address;
        * */
         //Example =>

        String x="xyz";
        String y="xyz";
        String z="XYZ";
        //compare x and y using both methods
        //compare the x and y using == equals operator
        System.out.println(x==y);//output=> true,  because the string address are same ;

        //compare the x and y using equals() method;

        System.out.println(x.equals(y));//output=> true because the content ar same

        //java is k-senstive we know that
        // inside string z the value is capital latter;
        //we compare both method and see the output;

        //compare x and y using both methods
        System.out.println(x==z);// false because address are not same;

        //compare the x and y using equals() method;

        System.out.println(x.equals(z));//false because the content not same ;

        //**************************************************************************************************************

        /*    What is equalesIgnoreCase() method ?

        * =>equalesIgnoreCase() method are ignore capital and small latter
        *   it will check content only.
        * Example => a=ABC and B=abc;
        * in case we use equalesIgnoreCase() method to comapre this
        * a.equalesIgnoreCase(b)=> output is true;
        * */
        String a="ABC";
        String b="abc";
        System.out.println(a.equalsIgnoreCase(b));// true;

        //**************************************************************************************************************

        //how to convert lowercase to uppercase
        // convert to lowercase
        System.out.println(a.toLowerCase());//output=> abc;

        //convert to uppercase;
        System.out.println(b.toUpperCase());//output=>ABC;

        //**************************************************************************************************************

        /*  what is trim() method ?

         * =>trim() method ka use tab karte hain jab kisi string ke aage ya piche se space ko khatam karna hota hai
         *
         * example= String a="   Ram Raj    ";
           sout(a.trim())//output>=Ram Raj;
         */
        //not using trim()
        String m="    Ram Raj    ";
        System.out.println(m);//output => "    Ram Raj    ";
        //using trim()
        String o="    Ram Raj    ";
        System.out.println(o.trim());//output => Ram Raj ;

        //**************************************************************************************************************

        /* What is replace() method;

         * => replace() method yah use hota hai jab kisi character ko replace karna hota hai
         */

        String q="Nitesh";
        // replace the t word to l word;
        System.out.println(q.replace('t','l'));// output=> Nilesh

        System.out.println(q.replace('N','n'));//output=>nitesh;

        //**************************************************************************************************************

        /*  Why String are immutable ?

         * immutable=> means constant or unchange;

            string yah immutable isi liye hota hai kuki yah space kam leta hai
            jab bhi hum kisi string ko decleare karten hai tab hum usme value ko assing
            karte hain agar wah value same hi hai jise hamne decleare kiya hai
            example=> string s="hii";
                      string a="hii" ;
                      string b="hii" ;
              agar upper jo hamne string decleare kiya hai wahi string literal type ka string hai
              jo ki string pool memory me save hota hai object ke form me  too upar hamne 3 bar
              string ko likha hai same value ke sath hi too kya yahi 3 object banayega string pool me
              nahi yah yek hi object banayega string pol me or uski ko tino ke liye use karega isi
              liye kahte hai ki string  unchagebal hota hai means string immutable hota hai;
         */

        // example of string immutable
        String c="hii";
        String d="hii";
        String e="hii";
        //uper hamne 3 string banmay ahai or value sab ka same hai;
        // string c ,d , e yah string pool me jakr obj banakr store ho jayega pr yek hi bar na ki 3 bar
        // bari bari usko tino ke liye use krega

        // ager hum string ko string me assiung kren to kya string pool me store value/ obj change hoga nahi
        //example;

        c=d+e;
        System.out.println(c);// output=>hiihii hoga par string pool me value nahi change hoga wah wahi rahega bus usko use krega;

        // agare hum string c me "hum" assing karen to kya string pool ka value change hoga ? ha.
        c="hum";
        System.out.println(c);//output=> hum; hoga or value yah change ho gayega string pool me se ;
        //ise hi string immutable kahten hain;

        //*+***+**+*+*+*++**+*+*+*+*+*+*+*+**++**+*+*+*+*+*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*+**++**+*+*+*+*+*+*+*+*+******

        /*   What is compareTo() method ?
        *    compareTo() mathod yah character ke unic code ko compare karta hai;
        *    matalab mano char n="a"
        *                 char m="b"
        *    hai to jab hum compare n or m ko compareTo() method se compare karte hain tab
        *    n or m me assign value ke unic code me subtract hot hai
        *
        *   Example=> system.out.println(n.compareTo(m)); karu to output=> -1
        *   kuki a ka uniccode=>1;
        *        b ka uniccode=>2;
        * jab hum isko compare karte hain tab  humne n ko pahile or m ko bad me likha hai
        *   matalab uniccode me bole to humane 1-2 kiya to output -1 aaya
        *      system.out.println(n.compareTo(m)); output=>-1
        *
        *   agar hame ise ulta karna hai to hum m-n karenge;
        *
        * Ex=> system.out.println(m.compareTo(n)); output=>1
        *
        * in short ise hi compareTo() method kahte hain;
        * */



        System.out.println("a".compareTo("b"));// output=>-1;

        //compareTo() method me value decleare nahi karte hain direct sout karte hain;



        // isi ke sath  string ka part khatam ;

    }
}
