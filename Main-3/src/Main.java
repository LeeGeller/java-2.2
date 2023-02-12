import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int bonusRub = 100;
        int startAccount = 100;
        int transaction = 1200;

        if (transaction > 999) {
            int bonus = transaction / 100;
            int finalAccount = startAccount + transaction + bonus;
            System.out.println("Ваш баланс:" + finalAccount);
        } else {
            int finalAccount = startAccount + transaction;
            System.out.println("Ваш баланс:" + finalAccount);
        }
    }
}