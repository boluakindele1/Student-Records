/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentfive;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringReader;

public class multipleRecords5 {
    Scanner scnr = new Scanner(System.in);
    private ArrayList<Record5> completeList;
    
    
    boolean readingfile = false;
    
 
    public  multipleRecords5 () {
     completeList = new ArrayList<>();
}

    
public void openRecords () throws IOException {
   
   FileInputStream fileinput = null;
     fileinput =new FileInputStream ("studentfile.txt");
   Scanner scanner = null;
      scanner = new Scanner(fileinput);
  
    
String fn;
    String ln;
    String ID; 
    double sa;
int i = 0;

    
   while(scanner.hasNext()) {
        fn = scanner.next();
       ln= scanner.next();
       ID = scanner.next();
       
        sa = Double.parseDouble(scanner.nextLine());
         completeList.add(new Record5(fn,ln,ID,sa));
++i;
    }



fileinput.close();



}
    


public int findsinglerecord() {
      String id ;
     boolean found = false;
        int foundIndex = -1;
        int i =0;
       
       System.out.println("What is the ID of the record you want to find?");
        id = scnr.nextLine();
        while (i < completeList.size() && !found) {
           
            
            if (completeList.get(i).getID().compareTo(id) == 0) {
               completeList.get(i).displayRecord();
                found = true;
               foundIndex = i;
              
            
           }  
            
            
            
            ++i;
       } 
       
        return foundIndex;
        
        
    }    
    






    
    
   public void displayallrecords ()  { 
    
   
    for(int i = 0; i<completeList.size(); ++i) {
    completeList.get(i).displayRecord();
    
}
    

} 
    
    
 public void addRecordtoallrecords (String firstname,String lastname, String Idnum, double studentaccount) {
    
   
    completeList.add(new Record5(firstname,lastname,  Idnum,  studentaccount));
    
         
     }
    
    public void addRecord () {
   int i = 0;
        String firstname,lastname,IDnum;
     double studentaccount;   

        
     if (readingfile== false ) {
         System.out.println("What is your first name?");
         firstname = scnr.nextLine();
         
         System.out.println("What is your last name?");
         lastname= scnr.nextLine();
         
         System.out.println("What is your ID Number?");
         IDnum = scnr.nextLine();
         
         System.out.println("What is your balance?");
         studentaccount = Double.parseDouble(scnr.nextLine());
         addRecordtoallrecords(firstname,lastname,IDnum,studentaccount);
        
         System.out.println("Your information has been added to the database");
         displayallrecords();
         
     }
       
              

        
       else  {
         System.out.println("unable to perform this action");
     }
        
        
    } 
        
        
        
        
 public void editaRecord () {
    Record5 record = new Record5();
     String id;
    boolean found = false;
    int foundIndex = -1;
    int i = 0;
    int userchoices = 0;
    
     System.out.println("What is the ID of the record you want to edit?");
        id = scnr.nextLine();
        while (i < completeList.size() && !found) {
           
            
            if (completeList.get(i).getID().compareTo(id) == 0) {
               completeList.get(i).displayRecord();
                found = true;
               foundIndex = i;
            
            
             System.out.println("What would you like to edit?");
                        System.out.println("1. First Name");
                        System.out.println("2. Last Name");
                        System.out.println("3. ID Name");
                        System.out.println("4. Account balance");
        
            userchoices = Integer.parseInt(scnr.nextLine());
                       
                       
                       if (userchoices ==1) {
                        System.out.println("Enter first name");
                        String First = scnr.nextLine();
                        
                        completeList.get(i).setfirstname(First);
                        completeList.get(i).displayRecord();
                       }
               
                       
                       
                         else if(userchoices == 2 )     {
                         System.out.println("Enter last name");
                         String last = scnr.nextLine();
                         completeList.get(i).setlastname(last);
                         completeList.get(i).displayRecord();
                              }
           
                         else if (userchoices == 3) {
                             System.out.println("Enter ID");
                             String ied = scnr.nextLine();
                             completeList.get(i).setID(ied);
                             completeList.get(i).displayRecord();
                         }
                       
                         else if (userchoices ==4) {
                             System.out.println("Enter balance");
                             double bal = scnr.nextDouble();
                             completeList.get(i).setstudentAccount(bal);
                             completeList.get(i).displayRecord();
                         }
                       
                         else {
                             System.out.println("ID not found");
                         }
                       
            }
            
                        ++i;   
        }
            
            
 } 
            
            
            
            
  public void deleterecord() {
    String id;
    int i= 0;
    boolean found = false;
    int foundIndex = -1;
    System.out.println("What is the ID of the record you want to delete?");
        id = scnr.nextLine();
        
        while (i < completeList.size() && !found) {
           
            
            if (completeList.get(i).getID().compareTo(id) == 0) {
               completeList.get(i).displayRecord();
                found = true;
               foundIndex = i;
            
               if (i != -1) {
        completeList.remove(i);
        System.out.println("Record removed");
               displayallrecords();
               }
              else {
        System.out.println("record not found");
    }      
            }
                  
      
       ++i;
        }
  }   
            

public void saveafile  ()throws IOException {
    
    boolean savefile = true;
    File file = new File ("newfile.txt");
    FileOutputStream output = new FileOutputStream (file);
    PrintWriter printw = new PrintWriter(output); 
    String currline;
    
    
        int t = 0;
        
        if (savefile == true) {
        while (t< completeList.size()) {
            
            printw.print(completeList.get(t).getfirstname());
            printw.print("  ");
            
            printw.print(completeList.get(t).getlastname());
            printw.print("  ");
            
            printw.print(completeList.get(t).getID());
            printw.print("  ");
            
            printw.print(completeList.get(t).getstudentAccount());
            
            currline = printw.toString();
             DataOutputStream stream = new DataOutputStream(new FileOutputStream(file));
             BufferedReader reader = new BufferedReader(new StringReader(currline));
                    while ((currline = reader.readLine()) != null) {
                        stream.writeBytes(currline + "\r\n");
                        }
            stream.close();
            ++t;
            
        }
        
        printw.close();
        readingfile = false;
        completeList.clear();
        }
        else {
            System.out.println("Can not save.");
        }
    
}





















}







