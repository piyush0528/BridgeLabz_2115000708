public class Vehicle {
static double registrationFee = 500.0;
final String registrationNumber;
String ownerName;
String vehicleType;
public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
this.ownerName = ownerName;
this.vehicleType = vehicleType;
this.registrationNumber = registrationNumber;
}
public static void updateRegistrationFee(double newFee) {
registrationFee = newFee;
}
public void displayRegistrationDetails() {
if (this instanceof Vehicle) {
System.out.println("Owner Name: " + ownerName);
System.out.println("Vehicle Type: " + vehicleType);
System.out.println("Registration Number: " + registrationNumber);
System.out.println("Registration Fee: " + registrationFee);
} else {
System.out.println("This is not a valid Vehicle object.");
}
}
public static void main(String[] args) {
Vehicle vehicle1 = new Vehicle("Alice", "Car", "AB123CD");
Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle", "XY456ZT");
vehicle1.displayRegistrationDetails();
vehicle2.displayRegistrationDetails();
System.out.println("Updating registration fee...");
updateRegistrationFee(600.0);
System.out.println("Updated registration fee for all vehicles:");
vehicle1.displayRegistrationDetails();
vehicle2.displayRegistrationDetails();
}
}
