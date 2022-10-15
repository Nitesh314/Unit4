package Practice_All_code_In_Lecture.RegularExprsion_ExcepationHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        /*The finally  is always executed wheathe ran exception is handeled or not.
           there for it contains all the necessary statements that need to be executed regardles of the
           exception occurs or not.
        * */
        try{
            int i=10;
            int j=20;
            System.out.println("sum of number:-  "+i+j);
            //when we use System.exit(); in side to try block then finally block not access.
          //  System.exit(1);
        }
        catch(Exception e){
            System.out.println("catch block");
        }
        finally {
            System.out.println("finally block are always run");
        }
    }
}
