package interfaces;

import java.io.IOException;
import java.util.ArrayList;

public interface PdfWriter {
    public void writeInfos(ArrayList<String> text) throws IOException;
}
