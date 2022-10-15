package Practice_All_code_In_Lecture;

public class FactoralMthod {
    public static void main(String[] args) {
           Sample sample=new Sample();
           // we are calling factoral two way;
          //1st=> int fact=sample.factoral(5);
          //2nd=> down;
           //when the method are returning saomething than we use this type sout;
        System.out.println(sample.factoral(5));

    }
}
class Sample{
   //we create factorial method ;

   int factoral(int num){
       if (num==1 || num==2)
       {
           return  num;
       }
       else
           return num*factoral(num-1);
   }
}
