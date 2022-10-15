package Practice_All_code_In_Lecture.Super_Keyword_ObjectClass_Dynamic_Binding;
public class InstanceOfOperator {
    //instanceOf operator check karta hai data type of variable sam ehai or nahi.

    public static void main(String[] args) {
        Integer i=10;
        System.out.println(i instanceof Integer);//output true because this is same
        System.out.println(i instanceof Object);//true kuki Object super class hota hai.
       // System.out.println(i instanceof String);//false kuki yah same nahi hai.
    }
}
