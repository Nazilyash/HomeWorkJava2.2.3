public class CreditPaymentService {
    public int calculate(int creditAmount, int creditPeriod, float interestRatePerYear) {
        float interestRatePerMonth = interestRatePerYear / 12 / 100;
        int creditPeriodInMonth = creditPeriod * 12;
        int monthlyPayment = (int) (creditAmount * interestRatePerMonth * Math.pow((interestRatePerMonth + 1), creditPeriodInMonth) / ( Math.pow((interestRatePerMonth + 1), creditPeriodInMonth) - 1 ));
        return monthlyPayment;
    }
}
