package Practice_All_code_In_Lecture.InterFace_Var_args_or_Enum;

public class Enums {
    public static void main(String[] args) {
        /* With the help of enum we create our own  data means some fixed data
        *  just lke sunday to saturday or january to december.etc.
        * */
        //Example of Enum=>
        Weeks w=Weeks.SATURDAY;
        switch (w){
            case SUNDAY -> System.out.println("First day Sunday");
            case MONDAY -> System.out.println("Second day Monday");
            case TUESDAY -> System.out.println("Third day Monday");
            case WEDNESDAY -> System.out.println("Fourth day Wednesday");
            case THURSDAY -> System.out.println("Fifth day Thursday");
            case FRIDAY -> System.out.println("Sixth day Friday");
            case SATURDAY -> System.out.println("Seventh day Saturday");
        }
    }
    public enum Weeks{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    }
}
