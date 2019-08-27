import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Deliveries {
    public static ArrayList<ArrayList<String>> CSVDeliveries(String path) {

        String line = "";
        String splitBy = ",";
        String csvFile = path;

        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                String[] delivery_data = line.split(splitBy);
                ArrayList<String> data = new ArrayList<String>();
                data.add(delivery_data[0]);
                data.add(delivery_data[1]);
                data.add(delivery_data[2]);
                data.add(delivery_data[3]);
                data.add(delivery_data[4]);
                data.add(delivery_data[5]);
                data.add(delivery_data[6]);
                data.add(delivery_data[7]);
                data.add(delivery_data[8]);
                data.add(delivery_data[9]);
                data.add(delivery_data[10]);
                data.add(delivery_data[11]);
                data.add(delivery_data[12]);
                data.add(delivery_data[13]);
                data.add(delivery_data[14]);
                data.add(delivery_data[15]);
                data.add(delivery_data[16]);
                data.add(delivery_data[17]);
                if(delivery_data.length == 21 ) {
                    data.add(delivery_data[18]);
                }
                if(delivery_data.length == 21 ) {
                    data.add(delivery_data[19]);
                }
                if(delivery_data.length == 21 ) {
                    data.add(delivery_data[20]);
                }
                list.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.remove(0);
        return list;
    }
}
