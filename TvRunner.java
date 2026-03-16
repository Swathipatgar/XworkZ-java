class TvRunner{

	public static void main(String[] args){

		Tv tv = new Tv();

		tv.samsung = 1;
		tv.lg = 2;
		tv.sony = 3;
		tv.mi = 4;
		tv.onePlus = 5;
		tv.panasonic = 6;
		tv.philips = 7;
		tv.tcl = 8;
		tv.vu = 9;
		tv.nokia = 10;
		tv.led = 11;
		tv.lcd = 12;
		tv.oled = 13;
		tv.smartTv = 14;
		tv.androidTv = 15;
		tv.hdTv = 16;
		tv.fullHd = 17;
		tv.ultraHd = 18;
		tv.fourK = 19;
		tv.curvedTv = 20;

		Channel channel = new Channel();

		channel.starPlus = 1;
		channel.zeeTv = 2;
		channel.sonyTv = 3;
		channel.colors = 4;
		channel.sunTv = 5;
		channel.udayaTv = 6;
		channel.asianet = 7;
		channel.etv = 8;
		channel.discovery = 9;
		channel.nationalGeographic = 10;
		channel.cartoonNetwork = 11;
		channel.pogo = 12;
		channel.nickelodeon = 13;
		channel.hbo = 14;
		channel.starMovies = 15;
		channel.sonyMax = 16;
		channel.zeeCinema = 17;
		channel.sports18 = 18;
		channel.starSports = 19;
		channel.ddNational = 20;

		tv.channel = channel;

		tv.displayTvDetails();
	}
}