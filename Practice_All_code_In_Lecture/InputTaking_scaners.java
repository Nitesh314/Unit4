package Practice_All_code_In_Lecture;
import java.util.Scanner;
public class InputTaking_scaners {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Nmae");
        String Name=scanner.next();//string ke liye next() ka hi use hota hai;

        System.out.println("Enter Your Age");
        int age=scanner.nextInt(); //integer ke liye nextInt() ka use hota hai;
        System.out.println("All details is :"+" "+Name+" "+age);
    }
}
