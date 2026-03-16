class Groww{

	int dematAccount;
	int tradingAccount;
	int mutualFunds;
	int sip;
	int stocks;
	int etf;
	int ipo;
	int portfolio;
	int watchlist;
	int marketNews;
	int profitLoss;
	int investment;
	int dividends;
	int marketOrders;
	int limitOrders;
	int research;
	int analytics;
	int notifications;
	int accountBalance;
	int transactions;

	Stock stock;

	public void displayGrowwDetails(){

		this.stock.displayStockDetails();

		System.out.println("Demat Account: "+dematAccount);
		System.out.println("Trading Account: "+tradingAccount);
		System.out.println("Mutual Funds: "+mutualFunds);
		System.out.println("SIP: "+sip);
		System.out.println("Stocks: "+stocks);
		System.out.println("ETF: "+etf);
		System.out.println("IPO: "+ipo);
		System.out.println("Portfolio: "+portfolio);
		System.out.println("Watchlist: "+watchlist);
		System.out.println("Market News: "+marketNews);
		System.out.println("Profit Loss: "+profitLoss);
		System.out.println("Investment: "+investment);
		System.out.println("Dividends: "+dividends);
		System.out.println("Market Orders: "+marketOrders);
		System.out.println("Limit Orders: "+limitOrders);
		System.out.println("Research: "+research);
		System.out.println("Analytics: "+analytics);
		System.out.println("Notifications: "+notifications);
		System.out.println("Account Balance: "+accountBalance);
		System.out.println("Transactions: "+transactions);

	}
}