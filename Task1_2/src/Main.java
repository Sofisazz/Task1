import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ATM newATM = new ATM(1,0,8);

        System.out.println("\nБаланс: " + newATM.getCash());
        System.out.println(newATM.getBanknote());
        System.out.println("\nБаланс: " + newATM.getCash());

        newATM.addBanknote20(2);
        System.out.println("\nБаланс: " + newATM.getCash());
        System.out.println(newATM.getBanknote());
        System.out.println("\nБаланс: " + newATM.getCash());
    }
}
