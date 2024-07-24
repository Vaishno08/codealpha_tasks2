package trading;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class StockMarket {
	private Map<String, Double> stockPrices;

    public StockMarket() {
        stockPrices = new HashMap<>();
        stockPrices.put("AAPL", 150.0);
        stockPrices.put("GOOGL", 2800.0);
        stockPrices.put("AMZN", 3400.0);
    }
    public double getPrice(String ticker) {
        return stockPrices.getOrDefault(ticker, 0.0);
    }

    public void updatePrices() {
        Random random = new Random();
        for (String ticker : stockPrices.keySet()) {
            double change = random.nextDouble() * 10 - 5;
            stockPrices.put(ticker, stockPrices.get(ticker) + change);
        }
    }

    public Map<String, Double> getStockPrices() {
        return stockPrices;
    }


}
