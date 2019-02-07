package com.company;

public class Bank {
    private String name;
    private int numberOfClients;
    private int numberOfCredits;
    private int numberOfEmployees;
    private float rating; // from 0 to 10
    private static int bankCount = 0;
    protected String address;
    protected int cashAmount;

    public void resetValues(
            String name,
            int numberOfClients,
            int numbersOfCredits,
            int numberOfEmployees,
            float rating,
            String address,
            int cashAmount
    ) {
        this.name = name;
        this.numberOfClients = numberOfClients;
        this.numberOfCredits = numbersOfCredits;
        this.numberOfEmployees = numberOfEmployees;
        this.rating = rating;
        this.address = address;
        this.cashAmount = cashAmount;
    }

    public void printBankCount() {
        System.out.println("Bank Count: " + bankCount);
    }

    public static void printStaticBankCount() {
        System.out.println("Bank Count: " + bankCount);
    }

    public String toString() {
        return "Bank name is " + this.name + "\n"
                + "Address: " + this.address + "\n"
                + "Rating: " + this.rating;
    }

    Bank() {
        this(
                "Iron Bank",
                12000,
                32090,
                220,
                9.1f,
                "Central st, 77",
                540000
        );
    }

    Bank(
            String name,
            int numberOfClients,
            int numbersOfCredits,
            int numberOfEmployees
    ) {
        this(
                name,
                numberOfClients,
                numbersOfCredits,
                numberOfEmployees,
                0f,
                "",
                0
        );
    }

    Bank(
            String name,
            int numberOfClients,
            int numbersOfCredits,
            int numberOfEmployees,
            float rating,
            String address,
            int cashAmount
    ) {
        resetValues(
                name,
                numberOfClients,
                numbersOfCredits,
                numberOfEmployees,
                rating,
                address,
                cashAmount
        );
        bankCount++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    public String getName() {return name;}
    public int getNumberOfClients() {return numberOfClients;}
    public int getNumberOfCredits() {return numberOfCredits;}
    public int getNumberOfEmployees() {return numberOfEmployees;}
    public float getRating() {return rating;}
    public String getAddress() {return address;}
    public int getCashAmount() {return cashAmount;}
}
