import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Que_Ans{
    static ArrayList<ArrayList<String>> getMatchesPlayedPerYear(ArrayList<ArrayList<String>> matchesData){

        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

        HashMap<String,Integer> map = new HashMap<>();

        for(ArrayList<String> list : matchesData){
            String year = list.get(1);
            if(map.containsKey(year)){
                map.put(year,map.get(year)+1);  //check the year value if available than add or if not than put in to map
                continue;
            }
            map.put(year,1);
        }

        for(String year : map.keySet()){
            ArrayList<String> list = new ArrayList<>();
            list.add(year);      //year is added
            list.add(map.get(year)+"");  //value added as per year
            result.add(list);  //add final list in result map
        }

        return result;
    }

}























