package Practice_All_code_In_Lecture;

public class Day7_Preclass_Inheritance {

    //Inheritance=> Inheritance is a mechanism where in a new class is derived from in exiting class.
    //              in java class may inherit or acqurire the propertie and method of other class.A class
    //              drived from another class is called a subclass,where the class from a subclass is derived is called a superclass.

    /* There are 5 type of inheritance
    *  1=>single inheritance;
    * 2=>multilevel inheritance;
    * 3=>Hierarchical inheritance;
    * 4=>multiple inheritance
    * 5=>hybrid inheritance
    *
    * ==>single inheritance=> single inheritance ka matlab ki yek single class ke dwara dusre single class ko inherit karne
    * example=>
    *   there are two  class
    *   i=>class a
    *   ii=> class b
    *  in singler inheritance class a inherit by class b;
    *
    * 2=>multilevel inheritance=> multilevel inheritance wah hota hai jisme yek class ko dusra class inherit kare
    * or dusre ko tisra class in herit karen
    * example=>
    * there are three  class
     *   i=>class a
     *   ii=> class b
     *   iii=> class c
     *  in multilevel  inheritance class a inherit by class b and class b inherit by class c;
     *
     *  3=> Hierarchical inheritance=>Hierarchical inheritance wah hota hai jisme yek class ko do class inherit karte hain;
     * example=>
     * there are three  class
     *    i=> class a
     *   ii=> class b
     *   iii=> class c
     *  in multilevel  inheritance class a inherit by class b and class c;
     *
     *  4=>multiple inheritance=> multiple inheritance wha hota hai jisme do or do se adhik class  yek hi class ko  inherit karte hain;
     * * example=>
     * there are three  class
     *    i=> class a
     *   ii=> class b
     *   iii=> class c
     *  in multiple  inheritance class a and class b inherit by class c;
     *
     *
     * 5=> hybrid inheritance=> hybrid inheritance wah hota hai jisme yek class ko do or do se adhik class
     *    inherit karta hai or un dono ko kisi tisre class dwara inherit kiya jata hai;
     * example=>
     * there are four  class
     *    i=> class a
     *   ii=> class b
     *   iii=> class c
     *    iv=> class d
     *  in hybrid inheritance class a inherit by class b and class c and ;
     *  class b or class c inherit by class d;
     *
     Most Important =>
     * At the class level java  follows only three type of inheritance
    *  1=>single inheritance;
    *  2=>multilevel inheritance;
    *  3=>Hierarchical inheritance;
    *
    * and remaning two type are java not use in class level.
    * remaning two type of inheritance are  usable by  interface level in java
    *
    * *****************************************************************************************************************/

    /* How many type of class ;
    *
    * there are two type of class
    *   1=> parent class or super class;
    *   2=> child class or sub class;
    *
    * *****************************************************************************************************************/

    /* What is Is-A relationship
    *
    * Is-A relationship means jab koi class kisi class ko inherit karta hai ta dono class me
    * yek relationship banta hai jise Is-A relationship kahte hain;

    *******************************************************************************************************************/

    /* What is extends keyword;
    *  extents keyword yah kisi dusre class ko inherit karta hai;
    * example=>
    *    mano ki class A hai;
    *     or yaha class b hai
    *      agar class b ko class a inherit karna hai to wah eXTANDS KEY WORD KA USE KAREGA
    *
    * Example code=>
    *     mano ki yah class a hai
    *     public class A{
    *      int a=10;
    *      int b=10;
    *      void funX(){
    *         System.out.println(a+b);
    *      }
    *    }
    *
    *   yaha hum log dusre file me dusra class banayenge
    *
    *        public class B extends A{
    *       public static void main(String[] args) {
    *           B b=new B();
    *           b.funX();
    *        }
    *    }
    * output=>20;
    *
    *******************************************************************************************************************/

    /* What is method overriding
    *  in java method overriding occurs when a subclass(child class)
    *  has the same method as the parent class.in other words method
    *  overriding occurs when a subclass provide a particular implementation
    *  of a method declared by one of its parent classes.
    *
    * Example=>
    *
    *     mano ki yah class a hai
    *     public class A{
    *      int a=10;
    *      int b=10;
    *      void funX(){
    *         System.out.println(a+b);
    *      }
    *    }
    *
    *   yaha hum log dusre file me dusra class banayenge
    *
    *        public class B extends A{
    *          @Override           //extension to see this is override method
    *           void funX(){       //override method tabhi kam karta hai jab method dono class me same rahta hai.
    *             System.out.println(a*b);
    *          }
    *
    *       public static void main(String[] args) {
    *           B b=new B();
    *           b.funX();
    *        }
    *    }
    *  output=>100;
    *
    *******************************************************************************************************************/

    /* What is super Keyword ?
    *  The super keyword in java is a reference variable which is used to
    *  refer immediate parent class object
    *   Example=>
    *     public class A{
    *      int a=10;
    *      int b=10;
    *      void funX(){
    *         System.out.println(a+b);
    *      }
    *    }
    *  // second class in secopd page
    *
    *        public class B extends A{
    *          @Override           //extension to see this is override method
    *           void funX(){       //override method tabhi kam karta hai jab method dono class me same rahta hai.
    *             System.out.println(a*b);
    *          }
    *        //uperwala method override hai;
    *       //yaha dusra method banayenge.
    *        void display(){
    *         //agar hum yaha pr class A ke method ko bina override lana hai to hame use direct lana hoga
    *         // jiske liye hame super keyword ka use karna hai.
    *           super.funX();
    *         }
    *       public static void main(String[] args) {
    *           B b=new B();
    *           b.display();
    *        }
    *    }
    *   output=>20;
    *
    *******************************************************************************************************************/

    /* Runtime polymorphism
    *
    * imp=>Runtime polymorphism are depends only this statement
    *    Super class reference and child class object.
    *
    * we know the a class assign 3 possibal value;
    *  i=> child class object;
    * ii=> same class object;
    * iii=> null property.
    *******************************************************************************************************************/

    /*What is Upcasting?
    *
    *  Upcasting=> in upcasting we assign a parent class reference object
    *              to the child class.
    *
    *  example=>
    *    package Practise;

        public class B extends A{
            @Override  //extension to see this is override method
            void funX(){  //override method tabhi kam karta hai jab method dono class me same rahta hai.
                System.out.println(a*b);
            }
            void data(){
                super.funX();
            }

            public static void main(String[] args) {
             A  b=new B();
               b.funX();
            }
        }
        * output=>100;
    *******************************************************************************************************************/

    /* What is DownCating
    *
    * Downcasting=> in simple language object downcasting means the typecasting of a parent object to a child object.
     *    downcasting can't be done implicitly.
     *
     * example=>
    *    package Practise;

        public class B extends A{
            @Override  //extension to see this is override method
            void funX(){  //override method tabhi kam karta hai jab method dono class me same rahta hai.
                System.out.println(a*b);
            }
            void data(){
                super.funX();
            }

            public static void main(String[] args) {
             A  b=new B();//upcasting
               b.funX();

               B d=(b)b;
               d.data();
            }
        }
        * output=>20;
    * */
}
