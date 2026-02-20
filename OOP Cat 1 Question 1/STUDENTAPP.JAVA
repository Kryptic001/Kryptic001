import java.util.Scanner;

public class StudentRecord{
int studentID;
string name;
string course;
//constructor
StudentRecord(int studentID,string name,string course){
this. studentID = studentID;
this.name = name;
this.course = course;
}
//display info
public void displayInfo(){
System.out.println("STUDENTID:" + studentID);
System.out.println("NAME:" +name);
System.out.println("COURSE:" +course);
}
}
public class studentApp{
public static void main ( String[] args){
Scanner scanner =  new scanner (System.in);
//prompt the user to student details
System.out.println("Enter studentID,name and course:");
int studentID; = scanner nextInt();
string name; = scanner nextLine();
string course; = scanner nextLine();
//Instantiate an object
StudentRecord studcord = new StudentRecord(studentID,name,course);
System.out.println("student details");
studcord.dispalyInfo();
Scanner.close();
}
}