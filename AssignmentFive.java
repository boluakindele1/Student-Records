/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentfive;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.ArrayList;



/**
 *
 * @author bolua
 */
public class AssignmentFive {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int inputfromuser = 0;
        Scanner scan = new Scanner(System.in);
        multipleRecords5 allRecords = new multipleRecords5 ();
      
        while (inputfromuser != 8) {
        
        System.out.println("What would you like to do?");
        
        System.out.println("1. Open Records");
        System.out.println("2. Display a record");
        System.out.println("3. Display all records");
        System.out.println("4. Add a new record to the database");
        System.out.println("5. Edit a record");
        System.out.println("6. Delete a record");
        System.out.println("7. Save records");
        System.out.println("8. Exit");
        inputfromuser = Integer.parseInt(scan.nextLine());
        String id = "0";
        if (inputfromuser == 1) {
            
            allRecords.openRecords();
            
        }
        
        else if (inputfromuser == 2) {
            
            allRecords.findsinglerecord();
        }
            
         
        else if (inputfromuser == 3) {
            allRecords.displayallrecords();
            
        }
        
        else if (inputfromuser == 4) {
           
            allRecords.addRecord();
            
        }
        
        
        else if (inputfromuser == 5) {
            allRecords.editaRecord();
            
        }
        
        else if (inputfromuser == 6) {
            allRecords.deleterecord();
        }
        
        else if (inputfromuser == 7) {
            allRecords.saveafile();
            
        }
        
        else if (inputfromuser == 8) {
            System.out.println("Goodbye");
            break;  
        }
        else {
            System.out.println("Enter a number 1-8 please!");
        }
      
        
    }
    }
}
