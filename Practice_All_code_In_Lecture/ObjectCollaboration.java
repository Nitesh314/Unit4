package Practice_All_code_In_Lecture;

public class ObjectCollaboration {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="Nitesh Shukla";
        person.city="Nallasopare";
        person.zip="401-209";
        System.out.println(person.name);
       // creating office object;
        Office office=new Office();
        office.comapnyName="Masai School";
       //creating address object;
        Address newAddress=new Address();
        newAddress.city="Blr";
        newAddress.zip="474747";
        //inside office obj we initialize address variables;
        office.address=newAddress;
        System.out.println(office.comapnyName);
        System.out.println(office.address.city);
        System.out.println(office.address.zip);






    }
}

class Person{
    String name;
    String city;
    String zip;
}
class Address{
    String city;
    String zip;
}
class Office{
    String comapnyName;
    Address address;//compostion is one obj are present in another obj ;
}
