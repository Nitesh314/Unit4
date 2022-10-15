package Practice_All_code_In_Lecture.RegularExprsion_ExcepationHandling.Throws;
import java.io.IOException;

//this is Throws example not a throw. both are different.
public class Main {
    /* there aretwo way to throw method
    * i=> handling with try and catch
    * ii=> passsit using throw;
    * */
    void m() throws IOException{
        throw new IOException("device error");//checked
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try {
            n();
        }catch (Exception e){
            System.out.println("Exception handling");
        }
    }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.p();
        System.out.println("Normal flow...");
    }
}
