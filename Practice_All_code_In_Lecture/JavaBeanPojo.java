package Practice_All_code_In_Lecture;

public class JavaBeanPojo {
    public static void main(String[] args) {
        // to access x we create obj of class javabean
        JavaBean obj=new JavaBean();
        //System.out.println(obj.x); this is soving error beacause this is private
        //in side class the x is accessesbal by main method
        System.out.println(obj.getX());//this is access by x and print default value of x is  0;

        // how to change value of x therefor we create value seter of x in class so go to class
       obj.setX(10);

    }
}
  // here a java bean class but in rule java bean class are allwayes public
  // therefor we take bean class in JavaBean.java

/**
  ###          important        =>

  1=> java bean known as POJO
  2=> POJO=> plain old java object.
 3=>java bean is a java class that has all a variables are
    private there are public geter and seter mthod they are
    are get and set value also it have a default constructor as well as parameteraized constructor;
 4=> bean class is always public;
     but we cant get two publice class in src files  therfor
     we set bean class to another class.

 **/
