package Practice_All_code_In_Lecture;

public class MaximumElementInArray {
    public static void main(String[] args) {
          int[] a={1,2 ,5,8,9,4,5,8,4,11,26};
        System.out.println(maxEle(a));
    }
    static int maxEle(int[] array){
         int max=Integer.MIN_VALUE;
        if(array.length==0)
        {
            System.out.println("Empty Array");
            return max;
        }

            for(int i=0;i<array.length;i++)
                if(array[i]>max)
                {
                    max=array[i];
                }
                return max;
    }
}
