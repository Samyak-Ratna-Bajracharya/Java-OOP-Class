package com.mycompany.mavenproject1;

import java.util.Scanner;

public class publicTransportManager {

    // ---------- Roads ----------
    Road road1 = new Road("City-A", "City-B", "City-C", "City-D", "City-E");
    Road road2 = new Road("City-B", "City-C", "City-D", "City-F", "City-G");
    Road road3 = new Road("City-A", "City-C", "City-E", "City-F", "City-G");
    Road road4 = new Road("City-B", "City-D", "City-E", "City-F", "City-A");
    Road road5 = new Road("City-C", "City-D", "City-F", "City-G", "City-B");

    // ---------- Vehicles ----------
    Vehicle train1 = new Vehicle("MetroTrans", "Siemens Velaro", "Silent Train", 250, road1, "City-A", 5, "MT-T1");
    Vehicle train2 = new Vehicle("MetroTrans", "Talgo Avril", "Silent Train", 260, road2, "City-B", 5, "MT-T2");
    Vehicle train3 = new Vehicle("GreenLine", "Alstom Avelia", "Silent Train", 220, road3, "City-A", 5, "GL-T3");
    Vehicle train4 = new Vehicle("SkyRail", "Hitachi Azuma", "Silent Train", 280, road4, "City-B", 5, "SR-T4");
    Vehicle train5 = new Vehicle("SkyRail", "Bombardier Zefiro", "Silent Train", 300, road5, "City-C", 5, "SR-T5");

    Vehicle bus1  = new Vehicle("MetroTrans", "Volvo", "Bus", 50, new Road("City-A","City-B","City-C"), "City-A", 3, "MT-101");
    Vehicle bus2  = new Vehicle("MetroTrans", "Mercedes", "Bus", 55, new Road("City-C","City-D","City-E"), "City-C", 3, "MT-102");
    Vehicle bus3  = new Vehicle("MetroTrans", "Scania", "Bus", 45, new Road("City-B","City-D","City-E"), "City-B", 3, "MT-103");
    Vehicle bus4  = new Vehicle("GreenLine", "Volvo", "Bus", 40, new Road("City-B","City-C","City-D"), "City-B", 3, "GL-201");
    Vehicle bus5  = new Vehicle("GreenLine", "Mercedes", "Bus", 60, new Road("City-D","City-F","City-G"), "City-D", 3, "GL-202");
    Vehicle bus6  = new Vehicle("GreenLine", "Scania", "Bus", 35, new Road("City-C","City-E","City-F"), "City-C", 3, "GL-203");
    Vehicle bus7  = new Vehicle("SkyRail", "Volvo", "Bus", 50, new Road("City-A","City-C","City-E"), "City-A", 3, "SR-301");
    Vehicle bus8  = new Vehicle("SkyRail", "Mercedes", "Bus", 55, new Road("City-B","City-F","City-G"), "City-B", 3, "SR-302");
    Vehicle bus9  = new Vehicle("SkyRail", "Scania", "Bus", 45, new Road("City-A","City-F","City-G"), "City-A", 3, "SR-303");
    Vehicle bus10 = new Vehicle("MetroTrans", "Volvo", "Bus", 48, new Road("City-B","City-D","City-F"), "City-B", 3, "MT-104");
    Vehicle bus11 = new Vehicle("GreenLine", "Mercedes", "Bus", 58, new Road("City-C","City-D","City-F"), "City-C", 3, "GL-204");
    Vehicle bus12 = new Vehicle("SkyRail", "Scania", "Bus", 42, new Road("City-D","City-E","City-G"), "City-D", 3, "SR-304");

    // Arrays for easy access
    Vehicle[] allVehicles = {train1, train2, train3, train4, train5,
                             bus1, bus2, bus3, bus4, bus5, bus6,
                             bus7, bus8, bus9, bus10, bus11, bus12};

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
        if (v != null) v.showVehicleInfo();
        else System.out.println("Vehicle not found.");
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
            case 1 -> { System.out.print("New company: "); v.setCompany(scanner.nextLine()); }
            case 2 -> { System.out.print("New brand: "); v.setBrand(scanner.nextLine()); }
            case 3 -> { System.out.print("New type: "); v.setType(scanner.nextLine()); }
            case 4 -> { System.out.print("New number of seats: "); v.setNumOfSeats(Integer.parseInt(scanner.nextLine())); }
            case 5 -> { System.out.print("New starting city: "); v.setStartingCity(scanner.nextLine()); }
            case 6 -> { System.out.print("New number plate: "); v.setNumberPlate(scanner.nextLine()); }
            default -> System.out.println("Invalid choice.");
        }
        System.out.println("Updated vehicle info:");
        v.showVehicleInfo();
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
                case 2 -> { for (Vehicle v : allVehicles) v.showVehicleInfo(); }
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
    
    public static void main(String[] args) {
        publicTransportManager manager = new publicTransportManager();
        // Run the interactive demo/menu
        manager.runDemo();
    }
}
