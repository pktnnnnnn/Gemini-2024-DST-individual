public class Main {
    public static void main(String[] args) {
        
        System.out.println("\nClient Information========================");
        Customer client = new Customer("C2002", "Ms. Emily Watson", 
                "456 Maple Avenue, Suburb, Chiang Mai 50000", "0912345678");
        client.addTradeInVehicle(new TradeInVehicle("Z789XY", "Toyota", "Corolla Hybrid", 2019, 60000));
        client.addTradeInVehicle(new TradeInVehicle("Y456PQ", "Mazda", "CX-5", 2021, 45000));
        System.out.println(client);

        client.showTradeInlist();

        System.out.println("\nEmployee Details========================");
        Employee staff = new Employee("E102", "Mr. Daniel Green", "0887654321");
        System.out.println(staff);

        System.out.println("\nCar Inventory========================");
        Vehicle car = new Vehicle("V900", "Ford", "Mustang Mach-E", 2022, "Ford Motors", 2200000);
        System.out.println(car);

        car.addInstalledOptions(new DealerInstalledOptions("Leather Seats", "D010", 80000));
        car.addInstalledOptions(new DealerInstalledOptions("Sport Package", "D011", 120000));
        car.showInstalledOptions();

        System.out.println("\n\nProcessing Invoice...\n");
        SalesInvoice.printInvoice(client, staff, car);
    }
}
