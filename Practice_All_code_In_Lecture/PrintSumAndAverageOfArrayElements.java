package Practice_All_code_In_Lecture;

public class PrintSumAndAverageOfArrayElements {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        esumAverag(a);
    }
    static void esumAverag(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
              sum+=array[i];

        }
        System.out.println(sum);
        double av=sum/array.length;
        System.out.println("average : "+av);

    }
}
