class GrowwRunner{

	public static void main(String[] args){

		Groww groww = new Groww();

		groww.dematAccount = 1;
		groww.tradingAccount = 2;
		groww.mutualFunds = 3;
		groww.sip = 4;
		groww.stocks = 5;
		groww.etf = 6;
		groww.ipo = 7;
		groww.portfolio = 8;
		groww.watchlist = 9;
		groww.marketNews = 10;
		groww.profitLoss = 11;
		groww.investment = 12;
		groww.dividends = 13;
		groww.marketOrders = 14;
		groww.limitOrders = 15;
		groww.research = 16;
		groww.analytics = 17;
		groww.notifications = 18;
		groww.accountBalance = 19;
		groww.transactions = 20;


		Stock stock = new Stock();

		stock.reliance = 1;
		stock.tcs = 2;
		stock.infosys = 3;
		stock.hdfcBank = 4;
		stock.iciciBank = 5;
		stock.sbi = 6;
		stock.wipro = 7;
		stock.tataMotors = 8;
		stock.adaniEnterprises = 9;
		stock.adaniPorts = 10;
		stock.hclTech = 11;
		stock.kotakBank = 12;
		stock.axisBank = 13;
		stock.asianPaints = 14;
		stock.maruti = 15;
		stock.larsenToubro = 16;
		stock.bajajFinance = 17;
		stock.titan = 18;
		stock.ultraTechCement = 19;
		stock.nestleIndia = 20;

		groww.stock = stock;

		groww.displayGrowwDetails();
	}
}