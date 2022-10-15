package Practice_All_code_In_Lecture;

public class CallingConstructorUsingThisKeyWord {

    //create default constructor
    CallingConstructorUsingThisKeyWord(){ // dibug ***3
        //calling parameteraizd constructor using this keyword
        this(10);//this is go to parameteraized  cons;    // dibug ***4
        System.out.println("default constructor");         // dibug ***8
    }

    //calling  parameteraized constructor

    CallingConstructorUsingThisKeyWord(int x){    // dibug ***5

        System.out.println(x);                  // dibug ***6
        System.out.println("parameteraized constructor");    // dibug ***7
    }

    public static void main(String[] args) { // dibug ***1
        //create class object;
        CallingConstructorUsingThisKeyWord obj=new CallingConstructorUsingThisKeyWord(); // dibug ***2

    }
}
