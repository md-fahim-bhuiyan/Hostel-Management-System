package HostelManagementSystem;

public class DoubleBedRoom extends Room {

    public int numberOfBed;
    public String studentId1, studentId2;

    public void DoubleBedRoom() {
        System.out.println("");
        System.out.println("*****Double Bed Room*****");
    }

    public void info(int NB) 
    {
        numberOfBed = NB;
    }

    public void info() {
        System.out.println("Number of Bed= " + numberOfBed);
    }

    public void StudentId(String ID, String Id, String RM) {
        studentId1 = ID;
        studentId2 = Id;
        roomNumber = RM;
    }

    public void printSID() {
        System.out.println("" + roomNumber + " is Allowed Student Id = " + studentId1 + "&" + studentId2);
    }
}
