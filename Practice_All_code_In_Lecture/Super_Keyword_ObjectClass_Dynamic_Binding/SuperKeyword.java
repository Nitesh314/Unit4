package Practice_All_code_In_Lecture.Super_Keyword_ObjectClass_Dynamic_Binding;

public class SuperKeyword {
    //compiler does 2 things
    //it gives you a default constructor
    //the first line in each constructor is call to
    //the super constructor super();

    //super is alwayes  write in first line in class

    /* super keyword=> point ti the super class,super constructor we use super keyword.

    ==>   use of super keyword
    * i=> super can be used to refer to the immediate parent class instance variable;
    * ii=> super can be used to invoke the immediate parent class method.
    * iii=>super() can be used to invoke immediate parent class constructor;
    * */
    public static void main(String[] args) {
        //rule 1
        Dog dog=new Dog();
        dog.printColor();
        //**************Rule 2 *********************
        Nitesh nitesh=new Nitesh();
        nitesh.homeWork();
        nitesh.display();
        //****************Rule 3******************
        Calcu calc=new Calcu();
       Calcu calcu=new Calcu(5,4);

    }
}
//i=> super can be used to refer to the immediate parent class instance variable;
//Example for this line=>

class  Animal{
    String color="White";
}
class Dog extends Animal{
    //extends yah method ko inherit karta hai. na ki variables ko.
    String color="black";

    void printColor(){
        System.out.println(color);// output=> black;
        //if we call parent class variable then we use super keyword.
        System.out.println(super.color);//output=> white
    }
}
//*********************************************************************************************************************
//ii=> super can be used to invoke the immediate parent class method.
//example of second rule=>

class Students{
    void homeWork(){
        System.out.println("All of you done home work");
    }
}

class Nitesh extends Students{
    @Override
    void homeWork(){
        System.out.println("Nitesh donsent do home work");
    }
    void display() {
        super.homeWork();
    }
}
//**********************************************************************************************************************

//iii=>super() can be used to invoke immediate parent class constructor;
//Example of third rule=>

class Cons{
    Cons(){
        System.out.println("Default constructor");
    }
    Cons(int num,int num1){
        System.out.println(num+num1);
    }
}
class Calcu extends Cons{
    Calcu(){
//        super();//in a class constructor super or calling constructor are all ways up.
        //if i comment the super or i don't write the super then the default constructor are all reday there

        System.out.println("Calcu constructor");
    }

    public Calcu(int num, int num1) {
        //here if i comment super then the default constructor are here all reday
        super(num ,num1);
    }
}