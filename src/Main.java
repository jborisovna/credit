public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        int term = 3;
        double percent = 9.99;
        int payment = service.calculate(credit, term, percent);
        System.out.println("Ежемесячный платеж составит " + payment);
    }
}