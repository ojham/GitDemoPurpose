package pdfreader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadingPDf {

	public static void main(String[] args) {
		
		
boolean flag = false;
		
		PDFTextStripper pdfStripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		String parsedText = null;

		try {
			URL url = new URL("C:\\Users\\ojham\\Downloads\\MWL_Sept");
			BufferedInputStream file = new BufferedInputStream(url.openStream());
			pdDoc=PDDocument.load(file);
			
//			parser.parse();
//			cosDoc = parser.getDocument();
			
			pdfStripper = new PDFTextStripper();
			
			pdfStripper.setStartPage(1);
			pdfStripper.setEndPage(3);
			
		//	pdDoc = new PDDocument(cosDoc);
			
			parsedText = pdfStripper.getText(pdDoc);
		} catch (MalformedURLException e2) {
			System.err.println("URL string could not be parsed "+e2.getMessage());
		} catch (IOException e) {
			System.err.println("Unable to open PDF Parser. " + e.getMessage());
			try {
				if (cosDoc != null)
				//	cosDoc.close();
				if (pdDoc != null)
					pdDoc.close();
			} catch (Exception e1) {
				e.printStackTrace();
			}
		}
		
		System.out.println("+++++++++++++++++");
		System.out.println(parsedText);
		System.out.println("+++++++++++++++++");

	}

}
