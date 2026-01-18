package fisrtjava;

public class Admin extends User {

    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
    }

   
}
