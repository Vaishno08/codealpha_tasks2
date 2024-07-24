package trading;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
	private double cash;
    private Map<String, Integer> stocks;

    public Portfolio(double initialCash) {
        this.cash = initialCash;
        this.stocks = new HashMap<>();
    }

    public double getCash() {
        return cash;
    }

    public void buyStock(String ticker, int quantity, double price) {
        double totalCost = quantity * price;
        if (cash >= totalCost) {
            cash -= totalCost;
            stocks.put(ticker, stocks.getOrDefault(ticker, 0) + quantity);
        } else {
            System.out.println("Not enough cash to buy " + quantity + " shares of " + ticker);
        }
    }

    public void sellStock(String ticker, int quantity, double price) {
        int currentQuantity = stocks.getOrDefault(ticker, 0);
        if (currentQuantity >= quantity) {
            stocks.put(ticker, currentQuantity - quantity);
            cash += quantity * price;
        } else {
            System.out.println("Not enough shares to sell " + quantity + " shares of " + ticker);
        }
    }

    public Map<String, Integer> getStocks() {
        return stocks;
    }

}
