public class Main {
    public static void main(String[] args) {
        int amount = 300;
        int add = 1200;
        int bonus;
        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        System.out.println( "Бонусные рубли: " + bonus);
        System.out.println( "Итоговая сумма: " + amount + bonus);
    }