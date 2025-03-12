import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private ArrayList<String> coffeeMenu = new ArrayList<>();

    //We don't need a constructor.

    public void loadMenuData() {

        File file = new File("Data/coffees.txt");


        try {

            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()) {

                coffeeMenu.add(scan.nextLine());

            } scan.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found. Check path and filename");
        }

    }

    public ArrayList<String> getCoffeeMenu() {

        return this.coffeeMenu;
    }
}