package Practice_All_code_In_Lecture.InterFace_Var_args_or_Enum;

public class Var_Args {
    static void fun1(int...i){ //three . are most imp in this things
        for(int a:i){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        /*this concept allows us to define a single method
        *  which can take xero or multiple arguments.
        * means iska use kar ke hum user se kitana bhi inout le sakte hain.
        * */
        fun1(1,2,3,45,6,7,8,9,9,110);
    }
}
