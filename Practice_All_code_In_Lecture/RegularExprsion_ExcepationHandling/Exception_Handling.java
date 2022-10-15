package Practice_All_code_In_Lecture.RegularExprsion_ExcepationHandling;

public class Exception_Handling {
    /*there are two types of error in java
    * i=> Syntex error
    * ii=>logical Error
    *
    * i=> Syntex error=> Improper Environment and Syntactical error it result in
    *    Compiltion. error.
    *   matalb yah hai ki isme hamse kucha syntext error hota hai
    *
    *   Example=> Class Main{
    *     public static void main(String args[]){
    *     int i=100;
    *     int j=20;
    *    int k=i+j  => here we not put ; in last of k
    *   this is syntex error
    * }
    * }
    *
    * ii=> logical error=> somtime jvm would be unable ti execute statement
    *      in the byte code  due to some logical error occur in our program.
    *
    *    matalb yah hai ki kabi kabhi hamare logiac ko jvm samjha nahi pata hai to hame logical
    *    error ka samna karna padta hai.
    *
    *     isko solve karane ke liye try pt catch ka use hota hai.
    *
    * Example=>
    *
    *   class Main{
    *     public static void main(String args[]){
    *
    *     try{
    *      int i=100;
    *      int j=0;
    *     int k=-i/j;// this is Arithmatic
    *
    * */
    public static void main(String[] args) {
        try {
            int i=100;
            int j=0;
            int k=i/j;
            System.out.println("result is----"+k);
        }catch (ArithmeticException mi){ //mi is a name of error
            //ArithmeticException in=s type of bughs
            System.out.println("we in catch");
            System.out.println(mi.getMessage());

        }
    }
}
