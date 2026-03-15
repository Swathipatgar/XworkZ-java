class Cricket {

    String teamName;
    String captainName;
    int playersCount;
    String stadium;
    String country;
    int overs;
    int wickets;
    int runs;
    String coach;
    String sponsor;
    String format;
    int matchNumber;
    boolean isDayMatch;
    boolean isFinal;
    String umpire1;
    String umpire2;
    String commentator;
    String jerseyColor;
    int audienceCount;
    double ticketPrice;

    Cricket(String teamName, String captainName, int playersCount, String stadium, String country,
            int overs, int wickets, int runs, String coach, String sponsor,
            String format, int matchNumber, boolean isDayMatch, boolean isFinal,
            String umpire1, String umpire2, String commentator, String jerseyColor,
            int audienceCount, double ticketPrice) {

        this.teamName = teamName;
        this.captainName = captainName;
        this.playersCount = playersCount;
        this.stadium = stadium;
        this.country = country;
        this.overs = overs;
        this.wickets = wickets;
        this.runs = runs;
        this.coach = coach;
        this.sponsor = sponsor;
        this.format = format;
        this.matchNumber = matchNumber;
        this.isDayMatch = isDayMatch;
        this.isFinal = isFinal;
        this.umpire1 = umpire1;
        this.umpire2 = umpire2;
        this.commentator = commentator;
        this.jerseyColor = jerseyColor;
        this.audienceCount = audienceCount;
        this.ticketPrice = ticketPrice;

        System.out.println("Cricket Parameterized Constructor Invoked");
    }
}