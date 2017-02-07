import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Emiliano_Cantarutti on 2/6/2017.
 */
public class ListOfNames {
    public static void parsingCsvFile() throws IOException {


        BufferedReader csvFile = new BufferedReader(new FileReader("src/listofnames.csv"));


        List<String> lines = new ArrayList<>();
        String line = "";
        while ((line = csvFile.readLine()) != null) {
            lines.add(line);
            String[] name = line.trim().split(",");
            for (int i = 0; i < name.length; i++)
                System.out.println("Hello " + name[i]);
        }



    }


}

