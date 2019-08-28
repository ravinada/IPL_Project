import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Matches {
    public static ArrayList<ArrayList<String>> CSVMatches(String path) {
        String csvFile = path;
        String line = "";
        String splitBy = ",";
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] matches_data = line.split(splitBy);
                ArrayList<String> data = new ArrayList<String>();
                for(int i=0;i<=12;i++)
                data.add(matches_data[i]);

                if(matches_data.length > 13)
                    data.add(matches_data[13]);

                if(matches_data.length > 14)
                    data.add(matches_data[14]);

                if(matches_data.length > 15)
                    data.add(matches_data[15]);

                if(matches_data.length > 16)
                    data.add(matches_data[16]);

                list.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
