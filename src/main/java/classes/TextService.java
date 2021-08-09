package classes;

import interfaces.TextReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class TextService implements TextReader {
    BufferedReader br = new BufferedReader(new FileReader("JavaYenilikleri.txt"));
    String s;
    ArrayList<String> lines = new ArrayList<String>();

    public TextService() throws FileNotFoundException {
    }

    @Override
    public ArrayList<String> reader() {
        {
            try {

                while ((s = br.readLine()) != null) {
                    lines.add(s);
                }
                br.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return lines;
    }
}
