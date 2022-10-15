package Practice_All_code_In_Lecture;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Movie objmovie=new Movie(5,"commady");
        
        System.out.println("Quanity of movie :"+objmovie.qun);
        System.out.println("Type of movie :"+objmovie.type);

    }
}

class Movie{
    int qun;
    String type;
// default constructor
    Movie(){
        System.out.println("Default constructor");
    }

    //parametrized constructor
    Movie(int con, String type1){
        qun=con;
        type=type1;

    }
}
