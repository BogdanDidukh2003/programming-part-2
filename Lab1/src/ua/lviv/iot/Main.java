package ua.lviv.iot;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\tClass Bank\n");
        Bank familyBank = new Bank(
                "Family Bank",
                7600,
                10300,
                22,
                8.6f,
                "St.Stephan st, 26",
                200000
        );
        Bank redBank = new Bank(
                "Red Bank",
                11000,
                20500,
                46
        );
        Bank ironBank = new Bank();

        redBank.setAddress("Liberty st, 46a");
        redBank.setRating(8.9f);

        System.out.println(familyBank.toString() + "\n");
        System.out.println(redBank.toString() + "\n");
        System.out.println(ironBank.toString() + "\n");

        Bank.printStaticBankCount();
        ironBank.printBankCount();
    }
}
