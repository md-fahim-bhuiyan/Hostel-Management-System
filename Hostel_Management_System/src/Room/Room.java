package Room;

public class Room {

    private String roomSize, numOfWindow;
    public String roomNumber;
    public double rentPDay, rentPMonth;

    public void setRoomInfo(String RN, String RS, String NW) {
        roomNumber = RN;
        roomSize = RS;
        numOfWindow = NW;
    }

    public void rentPerDay(double RD) {
        rentPDay = RD;
    }

    public void rentPerMonth(double RM) {
        rentPMonth = RM;
    }

    public void printRoomInfo() {
        System.out.println("Room Number = " + roomNumber);
        System.out.println("Room Size = " + roomSize);
        System.out.println("Number of Window = " + numOfWindow);
        System.out.println("Rent Per Month= " + rentPMonth);
        System.out.println("Rent Per Day = " + rentPDay);
    }
}
