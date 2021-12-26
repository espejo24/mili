public class Main {
    public static void main(String[] args) {

        int cost = 325; // стоимость билета
        int mili = 20; // количество рублей за одну милю
        int mil_count = cost / mili; // количество миль



        System.out.println("Начислено:");
        System.out.println((mil_count) + " миль");

    }
}