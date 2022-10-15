package Practice_All_code_In_Lecture;

public class Constructor {
    public static void main(String[] args) {

        //create obj of MyClass;
        MyClass myClass=new MyClass();
        MyClass newobj =new MyClass(10);


    }
}

class MyClass{
    // by default ther are constructor method
    MyClass(){
        System.out.println("This is constructor method");
    }
    //overloading method

    // parameterized constructor;
    MyClass(int x){
        System.out.println(x);
    }
}

//Similarity and difference bitween constructor and method;

//# Similarity
//1=>both are function;
//2=> both have argument List
//3=> both are can be overloaded;

// # Difference
//1=> constructor can't be static
//2=> constructor dosen't have return type not even void ;
//3=> constructor have  same name as well as class name but method dosen't have same name;

