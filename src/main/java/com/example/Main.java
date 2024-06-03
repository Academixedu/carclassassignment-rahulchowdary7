package com.example;

public class Main {
    public static void main(String[] args) {
        // Create a new car object
        Car myCar = new Car("Toyota", "Camry", 2020, "Red", 24000.00);


        // Display car details
        myCar.displayCarDetails();

        // Modify car details
        myCar.setColor("Blue");
        myCar.setPrice(23000.00);

        // Display updated car details
        System.out.println("\nUpdated Car Details:");
        myCar.displayCarDetails();

        Bank b1 = new Bank("sbi", "rahul", "00000", 33);
        b1.displayAccountDetails();
        b1.setAccountNumber("111111");
        b1.displayAccountDetails();
        System.out.println(b1.getAccountHolderName());

        Bike b =new Bike("xl", "m15", 2023, "red", 23.5);
        b.displayBikeDetails();
        b.setColor("green");
        b.displayBikeDetails();
        System.out.println(b.getBrand());

        Student s3 = new Student("rahul", 23, "14", "cse");
        s3.displayStudentDetails();

        
        
        





    }
}
