package trading;

public class Main {
	public static void main(String[] args) {
		 StockTradingPlatform platform = new StockTradingPlatform(10000);

	        platform.printMarketPrices();
	        platform.buyStock("AAPL", 10);
	        platform.sellStock("AAPL", 5);

	        platform.updateMarket();
	        platform.printMarketPrices();

	        platform.printPortfolio();
	}

}
