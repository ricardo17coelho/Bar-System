package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * 
 * @author morga
 * Dieser Code habe ich selber für mich anpasst und weiterentwickelt.
 * Ich habe die meiste Informationen hier herausgefunden: https://howtodoinjava.com/apache-commons/create-pdf-files-in-java-itext-tutorial/
 */

public class PDFwriter{

	public PDFwriter() {
		// TODO Auto-generated constructor stub
	

	Document document = new Document();
	LocalDateTime aktuellDateTime = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
	String formatterDateTime = aktuellDateTime.format(formatter);
      try
      {
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Rechnung" + "-Nr.1_" + "Datum-" + formatterDateTime + ".pdf"));
         document.open();
         document.add(new Paragraph("A Hello World PDF document."));
//         Image image = Image.getInstance("/bar_logo.png");
//         loginLogo.scaleAbsolute(100, 50);
//         image.setAbsolutePosition(100f, 700f);
//		   document.add(new Paragraph(textKasseWindow.getText()));
         document.close();
         writer.close();
         JOptionPane.showMessageDialog(null, "PDF erfolgreich exportiert!");
      } catch (DocumentException e)  {
    	  JOptionPane.showMessageDialog(null, "Error 01");
         e.printStackTrace();
      } catch (FileNotFoundException e) {
    	  JOptionPane.showMessageDialog(null, "Error 02");
         e.printStackTrace();
      }
	}
}
