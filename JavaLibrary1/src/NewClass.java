
import org.apache.pdfbox.multipdf.PDFMergerUtility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CVAR
 */
public class NewClass {
    public  static void main(String[]args) throws Exception{
    PDFMergerUtility ut = new PDFMergerUtility();
ut.addSource("one.pdf");
ut.addSource("two.pdf");


ut.setDestinationFileName("result.pdf");
ut.mergeDocuments();
}
}