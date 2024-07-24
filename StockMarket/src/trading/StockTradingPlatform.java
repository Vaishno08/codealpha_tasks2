package trading;

import java.util.Map;

public class StockTradingPlatform {
	private StockMarket market;
    private Portfolio portfolio;

    public StockTradingPlatform(double initialCash) {
        market = new StockMarket();
        portfolio = new Portfolio(initialCash);
    }

    public void buyStock(String ticker, int quantity) {
        double price = market.getPrice(ticker);
        portfolio.buyStock(ticker, quantity, price);
    }

    public void sellStock(String ticker, int quantity) {
        double price = market.getPrice(ticker);
        portfolio.sellStock(ticker, quantity, price);
    }

    public void updateMarket() {
        market.updatePrices();
    }

    public void printPortfolio() {
        System.out.println("Cash: $" + portfolio.getCash());
        System.out.println("Stocks:");
        for (Map.Entry<String, Integer> entry : portfolio.getStocks().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " shares");
        }
    }

    public void printMarketPrices() {
        System.out.println("Market Prices:");
        for (Map.Entry<String, Double> entry : market.getStockPrices().entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

}
