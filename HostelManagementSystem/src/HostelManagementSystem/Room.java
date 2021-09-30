package HostelManagementSystem;

public class Room {

   private String  roomSize, numOfWindow;
   public String roomNumber;
   public double rentPDay, rentPMonth;

    void setRoomInfo(String RN, String RS, String NW) {
        roomNumber=RN;
        roomSize=RS;
        numOfWindow=NW;
    }

    

    void rentPerDay(double RD) {
        rentPDay = RD;
    }

    void rentPerMonth(double RM) {
        rentPMonth = RM;
    }
    void printRoomInfo() {
        System.out.println("Room Number = " + roomNumber);
        System.out.println("Room Size = " + roomSize);
        System.out.println("Number of Window = " + numOfWindow);
        System.out.println("Rent Per Month= "+rentPMonth);
        System.out.println("Rent Per Day = " + rentPDay);
    }
}
