package Practice_All_code_In_Lecture;

public class Strings {
    public static void main(String[] args) {
        //String are create two way
        //1st is String literal
        String s="Nitesh";

        //2nd is String with new operator
        String s1=new String("Nitesh");

        //compare the s and s1 bothe are String and value are same so what is output true or false
        System.out.println(s==s1);//output is false because string s address are not same to string s1;

        //compare 2 string literal
        String s2="name";
        String s3="name";
        System.out.println(s2==s3); // true because both are string literal and value are same;

        //compare 2 string new operator;
        String s4=new String("ram");
        String s5=new String("ram");

        System.out.println(s4==s5);//false because string new operator are go to heap memory and create new obj for each therefor the output false;
    }
    /*
      ### important =>
      1=>string a data type
      2=>string are create two way
        i)String literal; ex=> String s = "Nitesh";
        ii)String with new operator; ex=> String s1 = new String("Nitesh");

      ## difference between string literal and string with new operator;

      i=> string literal store value in string pool memory;
      ii) string with new operator are store value in form of object in heap memory;
     */


}
