class BigDaddyRunner{

	public static void main(String[] args){

		BigDaddy bd = new BigDaddy();

		bd.goaCasino = 1;
		bd.onlineCasino = 2;
		bd.vipCasino = 3;
		bd.luxuryCasino = 4;
		bd.internationalCasino = 5;
		bd.premiumCasino = 6;
		bd.gamingCasino = 7;
		bd.entertainmentCasino = 8;
		bd.resortCasino = 9;
		bd.beachCasino = 10;
		bd.clubCasino = 11;
		bd.grandCasino = 12;
		bd.royalCasino = 13;
		bd.digitalCasino = 14;
		bd.mobileCasino = 15;
		bd.liveDealerCasino = 16;
		bd.jackpotCasino = 17;
		bd.pokerCasino = 18;
		bd.bettingCasino = 19;
		bd.superCasino = 20;


		Casino casino = new Casino();

		casino.roulette = 1;
		casino.blackjack = 2;
		casino.poker = 3;
		casino.baccarat = 4;
		casino.craps = 5;
		casino.slotMachine = 6;
		casino.teenPatti = 7;
		casino.andarBahar = 8;
		casino.dragonTiger = 9;
		casino.sicBo = 10;
		casino.bingo = 11;
		casino.keno = 12;
		casino.wheelOfFortune = 13;
		casino.paiGow = 14;
		casino.casinoWar = 15;
		casino.threeCardPoker = 16;
		casino.videoPoker = 17;
		casino.texasHoldem = 18;
		casino.liveCasino = 19;
		casino.jackpotGame = 20;

		bd.casino = casino;

		bd.displayBigDaddyDetails();
	}
}