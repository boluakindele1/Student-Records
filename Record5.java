/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentfive;


public class Record5 {
private String firstName;
private String lastName;
private String IDnum;
private double studentAccount;
     

public Record5 () {
    
}

public Record5(String firstName,String lastName, String IDnum, double studentAccount) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.IDnum = IDnum;
    this.studentAccount = studentAccount;
    
    
}

public void setfirstname (String firstName) {
    this.firstName = firstName;
}
   

public String getfirstname () {
    return firstName;
}

public void setlastname (String lastName) {
    this.lastName = lastName;
}

public String getlastname () {
    return lastName;
}

public void setID (String IDnum) {
    this.IDnum = IDnum;
}

public String getID () {
    return IDnum;
}

public void setstudentAccount (double studentAccount) {
    this.studentAccount = studentAccount;
}

public double getstudentAccount () {
    return studentAccount;
}

 public void displayRecord() {
          System.out.printf("First name: %s Last name: %s ID: %s Account amount: %f\n" ,firstName,lastName,IDnum,studentAccount);
 }
 
 
      


}
