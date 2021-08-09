package classes;

import interfaces.PdfWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class PdfService implements PdfWriter {

    @Override
    public void writeInfos(ArrayList<String> a) throws IOException {

        Iterator it = a.iterator();
        PDDocument document = new PDDocument();
        PDPage page1 = new PDPage();
        document.addPage(page1);
        PDPageContentStream content = new PDPageContentStream(document, page1);
        content.beginText();
        content.setFont(PDType1Font.TIMES_ROMAN, 12);
        content.setLeading(10.1f);
        content.newLineAtOffset(5, 790);

        while (it.hasNext()) {
            content.newLine();
            content.showText(String.valueOf(it.next()));
        }
        content.endText();
        content.close();
        document.save("JavaYenilikleri.pdf");
        document.close();

    }
}
