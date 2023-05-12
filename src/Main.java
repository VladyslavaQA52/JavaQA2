public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int balance = 200; //начальный счёт//
        int deposit = 1500; //сумма пополнения
        int bonus; // бонус
        if (deposit > 1000) {
            bonus = (deposit / 100);
        }

        bonus = deposit > 1000 ? deposit / 100 : 0;
        int totalBalance = balance + deposit + bonus;

        System.out.println("Баланс:" + totalBalance);
        System.out.println("Бонус:" + bonus);
    }


}
