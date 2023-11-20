package com.mycompany.myapp;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;

public class CreateBlankPDF {

    public static void main(String[] args) {
        try {
            // Create a new document
            PDDocument document = new PDDocument();

            // Add 300 blank pages to the document
            for (int i = 0; i < 300; i++) {
                PDPage page = new PDPage();
                document.addPage(page);
            }

            // Save the document to a file
            document.save("BlankPDF.pdf");

            // Close the document
            document.close();

            System.out.println("Blank PDF with 300 pages created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
