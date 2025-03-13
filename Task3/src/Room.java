import java.util.ArrayList;

public class Room extends ArrayList<Room> {

    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfLamps, int numberOfWindows) {

        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //Getter methods
    public int getNumberOfLamps() {

        return this.numberOfLamps;
    }

    public int getNumberOfWindows() {

        return this.numberOfWindows;
    }

    //Setter methods
    public void setNumberOfLamps(int numberOfLamps) {

        this.numberOfLamps = numberOfLamps;
    }

    public void setNumberOfWindows(int numberOfWindows) {

        this.numberOfWindows = numberOfWindows;
    }
}