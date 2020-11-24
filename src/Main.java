public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentOneYear = service.calculate (1_000_000, 1, 9.99F);
        System.out.println(monthlyPaymentOneYear);

        int monthlyPaymentTwoYears = service.calculate (1_000_000, 2, 9.99F);
        System.out.println(monthlyPaymentTwoYears);

        int monthlyPaymentThreeYears = service.calculate (1_000_000, 3, 9.99F);
        System.out.println(monthlyPaymentThreeYears);
    }
}
