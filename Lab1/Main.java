package ua.lviv.iot;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\tClass Bank\n");
        Bank FamilyBank = new Bank(
                "Family Bank",
                7600,
                10300,
                22,
                8.6f,
                "St.Stephan st, 26",
                200000
        );
        Bank RedBank = new Bank(
                "Red Bank",
                11000,
                20500,
                46
        );
        Bank IronBank = new Bank();

        RedBank.setAddress("Liberty st, 46a");
        RedBank.setRating(8.9f);

        System.out.println(FamilyBank.toString() + "\n");
        System.out.println(RedBank.toString() + "\n");
        System.out.println(IronBank.toString() + "\n");

        RedBank.printStaticBankCount();
        IronBank.printBankCount();
    }
}
