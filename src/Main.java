public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int payment1 = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платеж по кредиту на 1 год составит " + payment1 + " рублей");

        int payment2 = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платеж по кредиту на 2 года составит " + payment2 + " рублей");

        int payment3 = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платеж по кредиту на 3 года составит " + payment3 + " рублей");
    }
}