package Practice_All_code_In_Lecture;

public class ThisKeyWord {
    int x=10;
    void fun(){
        int x=100;
        System.out.println(this);//this is print obj address;
        System.out.println(this.x);//this is print 10;because this keyword access obj instance variable;
        System.out.println(x);//this is print 100 because x is local variable of fun() method;
    }

    public static void main(String[] args) {
        int x=1000;
        ThisKeyWord obj=new ThisKeyWord();
       // System.out.println(obj);//this is print obj address
        obj.fun();//this is access to fun method
        System.out.println(x);//this is print 1000 local variable;
    }
}
/*
 #####>                   Important                  =>

  1=> This Keyword  related to constructor object method;
  2=> this keyword that is point to the curent obj;
  3=>this keyword not access in static area.
     because this keyword related to obj not class;
  4=>this keyword access instance variable in obj;

* */