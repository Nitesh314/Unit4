package Practice_All_code_In_Lecture;

public class UserDefinedObjectAsInputAndOutput{
    public static void main(String[] args){

        //creating Employee class object;
      Employee employee=new Employee();

      //declare age in employee obj;
      employee.age=22;

      //call myMethod
        System.out.println(myMethod(employee));

        Employee employee1=createobj();
        System.out.println(employee1.age);//default value is 0;
      //  System.out.println(employee1.age);// if the obj value return null than the output is NPE;



    }

   static int myMethod(Employee employee){ // declare employee obj as a input;

        return employee.age;
    }

    static Employee createobj(){
        //null is subtype of any objeccts;
       // return null;
        return new  Employee();
    }

}

class Employee{
    int age;
}
//important=> A method can take objecct as a input
//Example=>  static int myMethod(Employee employee){
//              employee.age=22;
//            }


// A method can be  return object .
//Example=>
//static Employee createobj(){
//    return new  Employee();
//}