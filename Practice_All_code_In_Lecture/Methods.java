package Practice_All_code_In_Lecture;

public class Methods {
    public static void main(String[] args) {
        //how to call method
        //1st create obj;
        Simple simple=new Simple();
        simple.MethodName();
    }

}
class Simple{
    void MethodName(){
        System.out.println("inside the body of the method");
    }
}
