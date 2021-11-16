package patterns;

public class Exchange {

    private static Exchange exchangeInstance = new Exchange();

    private Exchange() {}

    public double gbpToUsd(double gbp) {
        return gbp * 1.59834;
    }

    public double gbpToEur(double gbp) {
        return gbp * 1.19196;
    }

    public static Exchange getInstance() {
        return exchangeInstance;
    }
}