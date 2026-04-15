import java.util.*;
//  String  Cab class
class Cab {
    private int cabID;
    private String cabType;
    private int capacity;

    public Cab(int cabID, String cabType, int capacity) {
        this.cabID = cabID;
        this.cabType = cabType;
        this.capacity = capacity;
    }

    public int getCabID() {
        return cabID;
    }

    public String getCabType() {
        return cabType;
    }

    public int getCapacity() {
        return capacity;
    }
}

// Driver class
class Driver {
    private int driverID;
    private String driverName;
    private String driverPhoneNumber;

    public Driver(int driverID, String driverName, String driverPhoneNumber) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.driverPhoneNumber = driverPhoneNumber;
    }

    public int getDriverID() {
        return driverID;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }
}

// Location class
class Location {
    private int locationID;
    private String locationName;

    public Location(int locationID, String locationName) {
        this.locationID = locationID;
        this.locationName = locationName;
    }

    public int getLocationID() {
        return locationID;
    }

    public String getLocationName() {
        return locationName;
    }
}

// Customer class
class Customer {
    private int customerID;
    private String customerName;
    private String customerPhoneNumber;

    public Customer(int customerID, String customerName, String customerPhoneNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
}

// Ride class
class Ride {
    private int rideID;
    private Cab cab;
    private Driver driver;
    private Location pickupLocation;
    private Location dropLocation;
    private Customer customer;

    public Ride(int rideID, Cab cab, Driver driver, Location pickupLocation, Location dropLocation, Customer customer) {
        this.rideID = rideID;
        this.cab = cab;
        this.driver = driver;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.customer = customer;
    }

    public int getRideID() {
        return rideID;
    }

    public Cab getCab() {
        return cab;
    }

    public Driver getDriver() {
        return driver;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public Customer getCustomer() {
        return customer;
    }
}

// CabBookingSystem class
class CabBookingSystem {
    private List<Ride> rides;

    public CabBookingSystem() {
        this.rides = new ArrayList<>();
    }

    public void bookCab(Cab cab, Driver driver, Location pickupLocation, Location dropLocation, Customer customer) {
        int rideID = rides.size() + 1;
        Ride ride = new Ride(rideID, cab, driver, pickupLocation, dropLocation, customer);
        rides.add(ride);
    }

    public void displayRides() {
        System.out.println("Rides:");
    for (Ride ride : rides) {
        System.out.println("Ride ID: " + ride.getRideID());
        System.out.println("Cab ID: " + ride.getCab().getCabID());
        System.out.println("Cab Type: " + ride.getCab().getCabType());
        System.out.println("Driver ID: " + ride.getDriver().getDriverID());
        System.out.println("Driver Name: " + ride.getDriver().getDriverName());
        System.out.println("Pickup Location: " + ride.getPickupLocation().getLocationName());
        System.out.println("Drop Location: " + ride.getDropLocation().getLocationName());
        System.out.println("Customer ID: " + ride.getCustomer().getCustomerID());
        System.out.println("Customer Name: " + ride.getCustomer().getCustomerName());
        System.out.println("Customer Phone Number: " + ride.getCustomer().getCustomerPhoneNumber());
        System.out.println();
    }
}
}

// Main class
public class Main2 {
public static void main(String[] args) {
Cab cab1 = new Cab(1, "Sedan", 4);
Driver driver1 = new Driver(1, "John", "1234567890");
Location pickupLocation1 = new Location(1, "ABC");
Location dropLocation1 = new Location(2, "XYZ");
Customer customer1 = new Customer(1, "Alice", "9876543210");
    Cab cab2 = new Cab(2, "Hatchback", 4);
    Driver driver2 = new Driver(2, "Jane", "0987654321");
    Location pickupLocation2 = new Location(3, "PQR");
    Location dropLocation2 = new Location(4, "LMN");
    Customer customer2 = new Customer(2, "Bob", "1234567890");

    CabBookingSystem cabBookingSystem = new CabBookingSystem();
    cabBookingSystem.bookCab(cab1, driver1, pickupLocation1, dropLocation1, customer1);
    cabBookingSystem.bookCab(cab2, driver2, pickupLocation2, dropLocation2, customer2);
    cabBookingSystem.displayRides();
}
}
