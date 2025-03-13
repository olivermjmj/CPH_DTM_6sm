import java.util.ArrayList;

public class Building {

    private ArrayList<Room> rooms;
    private int numberOfFloors;

    //Constructor
    public Building(ArrayList<Room> rooms, int numberOfFloors) {

        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    //Getter methods
    public ArrayList<Room> getRooms() {

        return this.rooms;
    }

    public int getNumberOfFloors() {

        return this.numberOfFloors;
    }

    //Setter methods
    public void setRooms(ArrayList<Room> rooms) {

        this.rooms = rooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {

        this.numberOfFloors = numberOfFloors;
    }
}