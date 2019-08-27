import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class feature1{
    static ArrayList<ArrayList<String>> getMatchesPlayedPerYear(ArrayList<ArrayList<String>> matchesData){

        ArrayList<ArrayList<String>> result1 = new ArrayList<ArrayList<String>>();

        HashMap<String,Integer> map1 = new HashMap<>();

        for(ArrayList<String> list : matchesData){
            String year = list.get(1);
            if(map1.containsKey(year)){
                map1.put(year,map1.get(year)+1);  //check the year value if available than add or if not than put in to map
                continue;
            }
            map1.put(year,1);
        }

        for(String year : map1.keySet()){
            ArrayList<String> list1 = new ArrayList<>();
            list1.add(year);      //year is added
            list1.add(map1.get(year)+"");  //value added as per year
            result1.add(list1);  //add final list in result map
        }

        return result1;
    }

}























