package Practice_All_code_In_Lecture.RegularExprsion_ExcepationHandling.Throws;

public class Throw_Keyword {
    public static void main(String[] args) {
        // Throw Keyword are used when we create our own Exception.
        //Example=>
        int age=2;
        if(age<18){
            throw new ArithmeticException("Below 18 not are able to Sing-Up");
        }
        else System.out.println("eligible for Sing-Up");

    }
}
