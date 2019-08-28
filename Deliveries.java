import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Deliveries {
    public static ArrayList<ArrayList<String>> CSVDeliveries(String path) {
        String csvFile = path;
        String line = "";
        String splitBy = ",";
        int flag = 0;
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] delivery_data = line.split(splitBy);
                ArrayList<String> data = new ArrayList<String>();
                for(int i=0;i<=17;i++)
                data.add(delivery_data[i]);

                if (delivery_data.length > 18)
                    data.add(delivery_data[18]);

                if (delivery_data.length > 19)
                    data.add(delivery_data[19]);

                if (delivery_data.length > 20)
                    data.add(delivery_data[20]);

                list.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
