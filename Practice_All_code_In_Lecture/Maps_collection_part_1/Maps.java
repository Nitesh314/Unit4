package Practice_All_code_In_Lecture.Maps_collection_part_1;
import java.util.*;
public class Maps {
    public static void main(String[] args) {
        //map is a key-value pair;
        //how to create map;
        //in map  are allwes store value in{} this type bracket.
        Map<String,Integer> CountryToPopulation=new HashMap<>();
        //how to add value in map;
        CountryToPopulation.put("India",10000);
        CountryToPopulation.put("Chaina",15000);
        System.out.println(CountryToPopulation);
         }
}
