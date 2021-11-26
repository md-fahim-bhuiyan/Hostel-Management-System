package Room;

public class SingleBedRoom extends Room {

    private String studentId;

    public void SingleBedRoom() {
        System.out.println("");
        System.out.println("*****Single Bed Room*****");
    }

    public void StudentId(String RM, String ID) {
        roomNumber = RM;
        studentId = ID;
    }

    public void printSID() {
        System.out.println("" + roomNumber + " is Allowed Student Id = " + studentId);
    }
}
