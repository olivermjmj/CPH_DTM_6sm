public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter;

    public Customer(String firstName, String userName) {

        this.firstName = firstName;
        this.userName = userName;

        counter++;
        id = counter;
    }

    @Override
    public String toString() {

        String e = "So " + getFirstName() + " your username will now be: " + getUserName() + " and your id will be: " + getID();
        return e;
    }



    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public String getFirstName() {

        return this.firstName;
    }

    public String getUserName() {

        return this.userName;
    }

    public int getID() {

        return this.id;
    }

}
