package com.mycompany.mavenproject1;

import java.util.Scanner;

import java.util.Scanner;

public class publicTransportManager {

    // ---------- Roads ----------
    Road road1 = new Road("City-A", "City-B", "City-C", "City-D", "City-E");
    Road road2 = new Road("City-B", "City-C", "City-D", "City-F", "City-G");
    Road road3 = new Road("City-A", "City-C", "City-E", "City-F", "City-G");
    Road road4 = new Road("City-B", "City-D", "City-E", "City-F", "City-A");
    Road road5 = new Road("City-C", "City-D", "City-F", "City-G", "City-B");

    // ---------- Vehicles ----------
    Train train1 = new Train("MetroTrans", "Siemens Velaro", "Silent Train", 250, road1, "City-A", 5, "MT-T1", "Driver01", 8, 32, 75.0);
    Train train2 = new Train("MetroTrans", "Talgo Avril", "Silent Train", 260, road2, "City-B", 5, "MT-T2", "Driver02", 9, 28, 80.0);
    Train train3 = new Train("GreenLine", "Alstom Avelia", "Silent Train", 220, road3, "City-A", 5, "GL-T3", "Driver03", 7, 30, 70.0);
    Train train4 = new Train("SkyRail", "Hitachi Azuma", "Express Train", 280, road4, "City-B", 5, "SR-T4", "Driver04", 10, 30, 90.0);
    Train train5 = new Train("SkyRail", "Bombardier Zefiro", "High-Speed Train", 300, road5, "City-C", 5, "SR-T5", "Driver05", 12, 25, 95.0);
    Train train6 = new Train("GreenLine", "Siemens Velaro", "Regional Train", 240, road3, "City-A", 5, "GL-T6", "Driver06", 8, 28, 78.0);

    
    Bus bus1  = new Bus("MetroTrans", "Volvo", "Bus", 50, new Road("City-A","City-B","City-C"), "City-A", 3, "MT-101", "BusDriver1", 101.5, 2, 2.50);
    Bus bus2  = new Bus("GreenLine", "Mercedes", "Bus", 60, new Road("City-D","City-F","City-G"), "City-D", 3, "GL-202", "BusDriver2", 102.5, 2, 3.00);
    Bus bus3  = new Bus("MetroTrans", "Scania", "Bus", 45, new Road("City-B","City-D","City-E"), "City-B", 3, "MT-103", "BusDriver3", 103.5, 2, 2.75);
    Bus bus4  = new Bus("GreenLine", "Volvo", "Bus", 40, new Road("City-B","City-C","City-D"), "City-B", 3, "GL-201", "BusDriver4", 104.0, 2, 2.60);
    Bus bus5  = new Bus("SkyRail", "Mercedes", "Bus", 55, new Road("City-B","City-F","City-G"), "City-B", 3, "SR-302", "BusDriver5", 105.2, 2, 3.10);
    Bus bus6  = new Bus("SkyRail", "Scania", "Bus", 45, new Road("City-A","City-F","City-G"), "City-A", 3, "SR-303", "BusDriver6", 106.0, 2, 2.90);
    Bus bus7  = new Bus("MetroTrans", "Scania", "Bus", 45, new Road("City-B","City-D","City-E"), "City-B", 3, "MT-103", "BusDriver3", 103.5, 2, 2.75);
    Bus bus8  = new Bus("GreenLine", "Volvo", "Bus", 40, new Road("City-B","City-C","City-D"), "City-B", 3, "GL-201", "BusDriver4", 104.0, 2, 2.60);
    Bus bus9  = new Bus("SkyRail", "Mercedes", "Bus", 55, new Road("City-B","City-F","City-G"), "City-B", 3, "SR-302", "BusDriver5", 105.2, 2, 3.10);
    Bus bus10  = new Bus("SkyRail", "Scania", "Bus", 45, new Road("City-A","City-F","City-G"), "City-A", 3, "SR-303", "BusDriver6", 106.0, 2, 2.90);
    
    Taxi taxi1 = new Taxi("CityCabs", "Toyota Prius", "Taxi", 4, new Road("City-A","City-B"), "City-A", 2, "TX-01", "John Doe", "LIC12345", 1.2, true);
    Taxi taxi2 = new Taxi("CityCabs", "Honda Civic", "Taxi", 4, new Road("City-C","City-D"), "City-C", 2, "TX-02", "Jane Smith", "LIC67890", 1.5, false);

    Vehicle vehicle1 = new Vehicle("GenericCo", "GenericModel", "Shuttle", 30, road1, "City-A", 3, "V-001");
    Vehicle vehicle2 = new Vehicle("GenericCo", "GenericModel2", "Shuttle", 35, road2, "City-B", 4, "V-002");

    // Arrays for easy access
    Vehicle[] allVehicles = {train1, train2, train3, bus1, bus2, taxi1, taxi2, vehicle1, vehicle2};
    Road[] allRoads = {road1, road2, road3, road4, road5};

    Scanner scanner = new Scanner(System.in);

    // ---------- Find vehicle ----------
    public Vehicle findVehicle(String plate) {
        for (Vehicle v : allVehicles) {
            if (v.getNumberPlate().equalsIgnoreCase(plate)) return v;
        }
        return null;
    }

    // ---------- Find road by stop ----------
    public Road findRoad(String stop) {
        for (Road r : allRoads) {
            for (String s : r.getStops()) {
                if (s.equalsIgnoreCase(stop)) return r;
            }
        }
        return null;
    }

    // ---------- Display vehicle info ----------
    public void displayVehicle() {
        System.out.print("Enter vehicle number plate: ");
        String plate = scanner.nextLine();
        Vehicle v = findVehicle(plate);
        if (v != null) {
            v.showVehicleInfo();
            if (v instanceof Train t) {
                System.out.println("Train Driver ID: " + t.getTrainDriverID());
                System.out.println("Number of Carriages: " + t.getNumOfCarriages());
                System.out.println("Seats per Carriage: " + t.getNumOfSeatsPerCarriage());
                System.out.println("Ticket Price: " + t.getTicketPrice());
            } else if (v instanceof Bus b) {
                System.out.println("Bus Driver ID: " + b.getDriverID());
                System.out.println("Radio Frequency: " + b.getRadioFrequency());
                System.out.println("Emergency Exits: " + b.getNumOfEmergencyExits());
                System.out.println("Bus Fare: " + b.getBusFare());
            } else if (v instanceof Taxi x) {
                System.out.println("Driver Name: " + x.getDriverName());
                System.out.println("License Number: " + x.getDriverLicenseNumber());
                System.out.println("Fare per Km: " + x.getFarePerKm());
                System.out.println("Available: " + x.isAvailable());
            }
        } else System.out.println("Vehicle not found.");
    }

    // ---------- Edit vehicle ----------
    public void editVehicle() {
        System.out.print("Enter vehicle number plate to edit: ");
        String plate = scanner.nextLine();
        Vehicle v = findVehicle(plate);
        if (v == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        System.out.println("Choose field to edit:");
        System.out.println("1. Company\n2. Brand\n3. Type\n4. Number of Seats\n5. Starting City\n6. Number Plate");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1 -> v.setCompany(scanner.nextLine());
            case 2 -> v.setBrand(scanner.nextLine());
            case 3 -> v.setType(scanner.nextLine());
            case 4 -> v.setNumOfSeats(Integer.parseInt(scanner.nextLine()));
            case 5 -> v.setStartingCity(scanner.nextLine());
            case 6 -> v.setNumberPlate(scanner.nextLine());
            default -> System.out.println("Invalid choice.");
        }

        // Edit subclass-specific fields
        if (v instanceof Train t) {
            System.out.print("Edit train driver ID (current: " + t.getTrainDriverID() + "): ");
            t.setTrainDriverID(scanner.nextLine());
        } else if (v instanceof Bus b) {
            System.out.print("Edit bus driver ID (current: " + b.getDriverID() + "): ");
            b.setDriverID(scanner.nextLine());
        } else if (v instanceof Taxi x) {
            System.out.print("Edit driver name (current: " + x.getDriverName() + "): ");
            x.setDriverName(scanner.nextLine());
        }

        System.out.println("Updated vehicle info:");
        displayVehicle();
    }

    // ---------- Display road info ----------
    public void displayRoad() {
        System.out.print("Enter a city to find the road: ");
        String stop = scanner.nextLine();
        Road r = findRoad(stop);
        if (r != null) r.showRoad();
        else System.out.println("Road not found.");
    }

    // ---------- Edit road ----------
    public void editRoad() {
        System.out.print("Enter a city to find the road: ");
        String stop = scanner.nextLine();
        Road r = findRoad(stop);
        if (r == null) {
            System.out.println("Road not found.");
            return;
        }
        r.editRoadManually();
    }

    // ---------- Interactive menu ----------
    public void runManager() {
        while (true) {
            System.out.println("\n=== Public Transport Manager ===");
            System.out.println("1. Show all roads");
            System.out.println("2. Show all vehicles");
            System.out.println("3. Display a vehicle info");
            System.out.println("4. Edit a vehicle");
            System.out.println("5. Display a road info");
            System.out.println("6. Edit a road");
            System.out.println("7. Show total vehicles and roads");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");

            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> { for (Road r : allRoads) r.showRoad(); }
                case 2 -> { for (Vehicle v : allVehicles) displayVehicle(); }
                case 3 -> displayVehicle();
                case 4 -> editVehicle();
                case 5 -> displayRoad();
                case 6 -> editRoad();
                case 7 -> {
                    Vehicle.showTotalVehicles();
                    Road.showTotalRoads();
                }
                case 8 -> { System.out.println("Exiting..."); return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    // ---------- Demo ----------
    public void runDemo() {
        runManager();
    }

    // ---------- Main ----------
    public static void main(String[] args) {
        publicTransportManager manager = new publicTransportManager();
        manager.runDemo();
    }
}
