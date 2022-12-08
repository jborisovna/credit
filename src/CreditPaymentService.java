public class CreditPaymentService {
    public int calculate(int credit, int term, double percent) {
        double monthTerm = term * 12;
        double monthlyPercent = percent / 12 / 100;
        double factor = monthlyPercent + 1;
        double ratio = (monthlyPercent * Math.pow(factor, monthTerm)) / (Math.pow(factor, monthTerm) - 1);
        int payment = (int) (credit * ratio);
        return payment;
    }
}
