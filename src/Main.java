public class Main {
    public static void main(String[] args) {

        int oldSum = 150;
        int addSum = 1555;

        int bonus = (addSum > 1000) ? (addSum / 100) : 0;
        int allSum = oldSum + addSum + bonus;

        System.out.println("Вы пополнили счет на " + addSum + " рублей");
        System.out.println("Бонус за пополнение счета составляет " + bonus + " рублей");
        System.out.println("Итоговая сумма на счете составляет " + allSum + " рублей");


    }
}
