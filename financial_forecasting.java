public class financial_forecasting {

    
    static double forecast(double amount, double rate, int years) {
        if (years == 0) return amount;
        return forecast(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double initialAmount = 10000.0;
        double annualGrowthRate = 0.08;  
        int numberOfYears = 5;

        double futureValue = forecast(initialAmount, annualGrowthRate, numberOfYears);
        System.out.printf("Forecasted value after %d years: ₹%.2f%n", numberOfYears, futureValue);
    }
}