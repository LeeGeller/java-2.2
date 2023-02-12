import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int startAccount;
        int finalAccount;
        int transaction;
        int bonusRub;
        int bonus;

        bonusRub = 100;
        startAccount = 100;
        transaction = 1200;

        if (transaction > 999) {
            bonus = transaction/100;
            finalAccount = startAccount + transaction + bonus;
            System.out.println("Ваш баланс:" + finalAccount);
        }else {
            finalAccount = startAccount + transaction;
            System.out.println("Ваш баланс:" + finalAccount);
        }
    }
}