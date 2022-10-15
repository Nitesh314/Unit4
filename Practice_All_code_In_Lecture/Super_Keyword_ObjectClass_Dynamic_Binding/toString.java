package Practice_All_code_In_Lecture.Super_Keyword_ObjectClass_Dynamic_Binding;

public class toString {
    public static void main(String[] args) {
        Object object;
        MyClass myClass=new MyClass();
        System.out.println(myClass);
        

    }


}
class MyClass extends Object {
    String msg="How have you been?";

//    @Override
//    public String toString() {
//        return "MyClass{" +
//                "msg='" + msg + '\'' +
//                '}';
//    }
    //output=>MyClass{msg='How have you been?'}

    @Override
    public String toString() {
        return msg;
    }
    //output=>How have you been?
}
