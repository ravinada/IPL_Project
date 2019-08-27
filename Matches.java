import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Matches {
    public static ArrayList<ArrayList<String>> CSVMatches(String path) {
       
        String splitBy = ",";
        String csvFile = path;
        String line = "";
        
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            
            while ((line = br.readLine()) != null) {
                String[] matches_data = line.split(splitBy);
                ArrayList<String> data = new ArrayList<String>();
                data.add(matches_data[0]);
                data.add(matches_data[1]);
                data.add(matches_data[2]);
                data.add(matches_data[3]);
                data.add(matches_data[4]);
                data.add(matches_data[5]);
                data.add(matches_data[6]);
                data.add(matches_data[7]);
                data.add(matches_data[8]);
                data.add(matches_data[9]);
                data.add(matches_data[10]);
                data.add(matches_data[11]);
                data.add(matches_data[12]);
                if(matches_data.length > 13){
                    data.add(matches_data[13]);
                }
                if(matches_data.length > 14){
                    data.add(matches_data[14]);
                }
                if(matches_data.length > 15){
                    data.add(matches_data[15]);
                }
                if(matches_data.length > 16){
                    data.add(matches_data[16]);
                }
                list.add(data);
            }
            
            //System.out.println();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.remove(0);
        return list;
    }
}
