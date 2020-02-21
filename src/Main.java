public class Main {
    public static void main(String[] args) {
        long initial_balance = 100; //в рублях
        double recharge_rub = 999.99; //в рублях
        double recharge_kop = recharge_rub * 100; //в копейках
        long bonus = 0;
        if (recharge_rub >= 1000) { //если пополнение больше 1000 руб
            bonus = (long) recharge_kop / 10000; //начисляем за каждые 100 руб (10000 коп) 1 рубль бонуса
            System.out.println("Вам начислен бонус " + bonus + " руб."); //сообщаем о начислении бонуса
        } else System.out.println("Для начисления бонуса пополните счет на 1000 рублей и более!");
    }
}
