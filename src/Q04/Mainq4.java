
public class Mainq4 {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle("Nimal", "0716789678");

        System.out.println("Owner Name: " + bike.getOwnerName());
        System.out.println("Phone Number: " + bike.getPhoneNo());

        bike.setOwnerName("Kamal");
        bike.setPhoneNo("0704567890");

        System.out.println("Updated Owner Name: " + bike.getOwnerName());
        System.out.println("Updated Phone Number: " + bike.getPhoneNo());
    }
}