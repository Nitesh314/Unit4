package Practice_All_code_In_Lecture;

public class UserDefaindIbjectInArray {
    public static void main(String[] args) {

        Student[] student=new Student[3];
        Student s1=new Student("ram");
        Student s2=new Student("mohan");
        Student s3=new Student("Ray");
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        for(Student s:student){
            System.out.println(s.name);
        }


    }
}
