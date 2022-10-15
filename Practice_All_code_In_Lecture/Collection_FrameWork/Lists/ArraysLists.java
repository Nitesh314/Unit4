package Practice_All_code_In_Lecture.Collection_FrameWork.Lists;
import java.util.*;
public class ArraysLists {
    //list allow duplicates or null...
    //Arraylist is a part of List
    /* What is list ?
    *  List is a interface which have a few impletation classes like ArrayList,
    *  linkList and so all...
    * */

    /* ArrayList =>
    *   ArrayList means Dyanamic array intialy it capacity is 10
    *  interly it have a lowFacter of size  isd .75 means when arrayList full a
    *  75% size of all capacit then his size is double or increage...
    * */
    public static void main(String[] args) {
        // in a ArrayList there are many methods...
        //i=> asList()  method...
        /* asList() method teak some value as list a fixed size ;
        *  means when we put value in asList() method then the size of asList are fixed to input;
        *  ex=> asList(1,2,3,4,5,6); then the size of asList is 6;
        * in simple it is fixed size list...
        *
        * */
        List<Integer> asLists=Arrays.asList(0,1,2,4,5,6);
        System.out.println(asLists);//output=>[0, 1, 2, 4, 5, 6]

    //******************************************************************************************************************
    //how to add another list value to my list...
    //ii=>addAll
        /*addAll() method are Use to another array list to my list...
        * */
        //i add asLists array list in my list=>
        //asLists.addAll(asLists);

        List<Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(52);
        arr1.add(25);
        List<Integer> arr2=Arrays.asList(5,10,15,20,25,30);

        //uper hame  2 array banaya hai..
     arr1.addAll(arr2);

        System.out.println(arr1);//output=>[1, 52, 25, 5, 10, 15, 20, 25, 30]
    //******************************************************************************************************************
      //how to check another list are copey my list or not...
        //containsAll() method yah check arta hai ki yek array ki property 2nd array me hai ya nahi...
        System.out.println(arr1.containsAll(arr2)); //true...
     //*****************************************************************************************************************
     // how to remove another lisrt to my list...

        System.out.println(arr1.removeAll(arr2));//true...

     //*****************************************************************************************************************

        List<Integer> arr3=new ArrayList<>();
        arr3.add(1);
        arr3.add(52);
        arr3.add(25);
        arr3.add(75);
     // how to iterate list...
     Iterator<Integer> it=arr3.iterator();
     while (it.hasNext())
         System.out.println(it.next());
      /*output=>
         1
        52
        25
        75
      * */
     //*****************************************************************************************************************
     /* Interview questions...
     * arraylist => internally it is an array
     * and we know that array is index based access and read
     * so as wel as arraylist  is index based access and read...
     * example=> when we accewss array we call like arr[5]...
     * means index 5 are called by user
     * so that in array list wehn we access and red a value then the time complecity is O(1)...
     *
     * in opposite side when we Delete or add something in array then the time complex City is O(n)...
     *
     * */

     /* LinkedList=>>
     *               in linked list when we lookup ,search  and access a  value.
     *  then the time complexcity is O(n);
     *
     * when we delete and add something in linked list then the time compexcity is O(1)...
     *
     * */
    }
}
