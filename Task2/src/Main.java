public class Main {

    public static void main(String[] args) {

        Cafe firstCafe = new Cafe();

        //Read th coffee menu
        firstCafe.loadMenuData();

        //Print the coffee menu
        for(String coffee: firstCafe.getCoffeeMenu()) {

            System.out.println(coffee);
        }

    }
}