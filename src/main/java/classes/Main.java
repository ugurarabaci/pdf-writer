package classes;

import java.io.IOException;
/*

Text dosyasında yer alan bilgiler TextService classında okundu ve sonrasında PdfService classı ile de yazıldı.

*/

public class Main {
    public static void main(String[] args) throws IOException {
        TextService r = new TextService();
        PdfService pw = new PdfService();

        pw.writeInfos(r.reader());

    }
}
