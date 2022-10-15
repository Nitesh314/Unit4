package Practice_All_code_In_Lecture;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAndInheritance {
    public static void main(String[] args) {
        //how to declare array
        //example=>
        int[] arr;//declare array

     //*****************************************************************************************

        //how to create array
        //declare variable=<new><data type>[size of array]
        arr=new int[5];//5 is length of array
        System.out.println(arr);//print arr aderase

     //***************************************************************************************************

        //how to access array;
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
            System.out.println(arr[i]);//0 1 2 3 4 output
        }

    //******************************************************************************************************

        //another way to create array

        //<data type>[] <variable  name> = {put any thing acording data type}

        int[] arr1={5,10,15,20,25};

        System.out.println(arr1);//print arr1 addrase;

        //print 5,10,15,20,25;
        //there are two way to access arr1;
        //1st loop through;
        //Example is for loop
        String bag="";
        for(int i=0;i<arr1.length;i++)
        {
            bag+=arr1[i]+" ";
        }
        System.out.println(bag);//horigentaly print 5 10 15 20 25;

       //Example with while loop;

       int x=0;
       while(x<arr1.length){

           System.out.println(arr1[x]);//print wartical 5 10 15 20 25;

           x++;
       }

    //******************************************************************************************************

        //2nd way to access  array;
        //forEach or Enhanced forloop;

        //syntex=> for(<Data type><any name> : decleare array name)
         String m="";
        for(int mota:arr1){
            m+=mota+" ";
        }
        System.out.println(m);//horigentaly print 5 10 15 20 ;

       //3rd way to access array;
        Arrays.stream(arr1).forEach(mota-> System.out.println(mota));// wartical print 5 10 15 20 25;

        //**************************************************************************************************************
    }
}
