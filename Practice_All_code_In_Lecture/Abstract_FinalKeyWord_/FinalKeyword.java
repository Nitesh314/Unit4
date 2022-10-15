package Practice_All_code_In_Lecture.Abstract_FinalKeyWord_;

public class FinalKeyword {
    // final ka matlab constant
    /*  Final keyword can be access three different Property;
    *  i=> Final Variables;
    *      when the user access variables using final keyword then the variable
    *      value is constant there should be no change.
    *
    *   ii=> Method final=> If  a user using final method then we can't change or overriding
    *         the methods.
    *
    *   iii=> finbal class => final class can't be extends or inherit
    * */
    //Example of variable=>
    public static void main(String[] args) {
        final int i=10;
       // i++; => we not change value of i
        System.out.println(i);
    }

}
class A{
    void Non_finalMethod(){
        System.out.println("Non-final method");
    }
    final void finalMethod(){
        System.out.println("this is final method ");
    }
}

class B extends A {
    @Override
        //we override Non_finalMethod
    void Non_finalMethod() {
        System.out.println("Non-final method");
    }
//    @Override
//    we can't override final method
//    final void finalMethod(){
  //      System.out.println("this is final method ");
 //  }
}


//Example => class final=>

final class Shap{
    final double pi=22/7;
}
//class circal extends Shap{
//    //this is wrong because final class can't be extends or inherit
//}