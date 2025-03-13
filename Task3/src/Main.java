import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Initiates 3 rooms, and assigns values
        Room room1 = new Room(3,2);
        Room room2 = new Room(1,4);
        Room room3 = new Room(4,3);

        //adds the three rooms to an ArrayList
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building firstBuilding = new Building(rooms, 1);

        System.out.println("The total amount of lamps in this establishment = " + countLampsInBuilding(firstBuilding) + "\n" +  "The building has a total of: " + countWindowsInBuilding(firstBuilding) +  " windows" + "\n" + "And the total amount of rooms in this building = " + countRoomsInBuilding(firstBuilding));

        System.out.println("Does the building have more or equal amount of floors as rooms? " + isNormal(firstBuilding));
    }

    public static boolean isNormal(Building whichBuilding) {

        if(whichBuilding.getRooms().size() <= whichBuilding.getNumberOfFloors()) {

            return true;
        } else {

            return false;
        }
    }

    public static int countLampsInBuilding(Building whichBuilding) {

        int count = 0;

        for(Room room: whichBuilding.getRooms()) {

            count += room.getNumberOfLamps();
        }
        return count;
    }

    public static int countWindowsInBuilding(Building whichBuilding) {

        int count = 0;

        for(Room room: whichBuilding.getRooms()) {

            count += room.getNumberOfWindows();
        }
        return count;
    }

    public static int countRoomsInBuilding(Building whichBuilding) {

        return whichBuilding.getRooms().size();
    }
 }