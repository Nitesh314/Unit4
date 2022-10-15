package Practice_All_code_In_Lecture;

public class Polymorphism {
    public static void main(String[] args) {
        //create obj of Sum class;
        Sum sum =new Sum();

        System.out.println(sum.add(2,5));//this is calling 1st add method;

        System.out.println(sum.add(4,5,2));//this is calling 2nd add method;

        System.out.println(sum.add('a','b','c','d'));//this is calling 3rd add method;

        //i am calling square method ;

        System.out.println(sum.square(5)); //  which is callin first int x  or byte b;
        //ans is int x because overloading identify first in line;
       // if i put value in point then what we do;
        // 1st=> we cast the value;
        //exanole=> (byte)5.9
        System.out.println(sum.square((byte)5.9));
    }
}
class Sum{
    //Polymorphism;
    //there are two type of polymorphism but this time learn 1st type ;
    //1st=>the first type polymorphism is known as
    //method overloading.
    //there are many Name of method overloading;
    //static binding , compile time polymorphism or method overloading;

    int add(int a, int b){
        return a+b;
    }
    int add (int m,int n,int p){
        return (m+n)-p;
    }
    String add (char a,char b,char c,char m){
        return "abcm";
    }
    int square(int x){
        System.out.println("integer");
        return x*x;
    }
    int square(byte b){
        System.out.println("byte");
        return b*b;
    }
}
// Rules of overloading method;
//1st=> return type are same as well as difference;
//2nd=> argument list should be difference;

