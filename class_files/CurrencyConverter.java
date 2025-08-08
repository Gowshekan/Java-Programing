import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Supported Currencies: USD, EUR, INR, GBP, JPY");

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.print("From Currency (e.g., USD): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("To Currency (e.g., INR): ");
        String toCurrency = scanner.next().toUpperCase();

        double converted = CurrencyConverter.convert(amount, fromCurrency, toCurrency);

        if (converted != -1) {
            System.out.printf("Converted Amount: %.2f %s\n", converted, toCurrency);
        } else {
            System.out.println("Invalid currency entered.");
        }

        scanner.close();
    }
}

// ----- Conversion Logic -----
class CurrencyConverter {
    public static double convert(double amount, String from, String to) {
        double rate = CurrencyRates.getRate(from, to);
        if (rate == -1) {
            return -1;
        }
        return amount * rate;
    }
}

// ----- Exchange Rate Data -----
class CurrencyRates {
    public static double getRate(String from, String to) {
        switch (from) {
            case "USD":
                switch (to) {
                    case "INR": return 83.0;
                    case "EUR": return 0.92;
                    case "GBP": return 0.78;
                    case "JPY": return 157.5;
                    case "USD": return 1.0;
                }
                break;

            case "INR":
                switch (to) {
                    case "USD": return 0.012;
                    case "EUR": return 0.011;
                    case "GBP": return 0.0094;
                    case "JPY": return 1.89;
                    case "INR": return 1.0;
                }
                break;

            case "EUR":
                switch (to) {
                    case "USD": return 1.09;
                    case "INR": return 90.5;
                    case "GBP": return 0.85;
                    case "JPY": return 171.0;
                    case "EUR": return 1.0;
                }
                break;

            case "GBP":
                switch (to) {
                    case "USD": return 1.28;
                    case "INR": return 105.8;
                    case "EUR": return 1.17;
                    case "JPY": return 200.4;
                    case "GBP": return 1.0;
                }
                break;

            case "JPY":
                switch (to) {
                    case "USD": return 0.0063;
                    case "INR": return 0.53;
                    case "EUR": return 0.0058;
                    case "GBP": return 0.0050;
                    case "JPY": return 1.0;
                }
                break;
        }
        return -1;
    }
}
