package Practice_All_code_In_Lecture.Super_Keyword_ObjectClass_Dynamic_Binding;

public class UpCastings {
    public static void main(String[] args) {
       Mother mo =new Mother();
       Daughter doo=new Daughter();
       Mother mo1=new Daughter();
       mo1.ma();
       


    }
}
class Mother{
    void ma(){
        System.out.println("Hii Nitesh this is mother class method ");
    }
}
class Daughter extends Mother{
    String D="DSaughter";
}
