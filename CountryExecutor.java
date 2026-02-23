class CountryExecutor {
    public static void main(String[] args) {

        String[] countries = {
        "India","United States","Canada","Australia","Germany","France","Italy","United Kingdom","China","Japan",
        "Brazil","Russia","South Africa","Mexico","Indonesia","Pakistan","Bangladesh","Nepal","Sri Lanka","Malaysia",
		"Singapore","Thailand","Vietnam","Philippines","South Korea","North Korea","Saudi Arabia","United Arab Emirates",
        "Oman","Turkey","Iran","Iraq","Afghanistan","Qatar","Kuwait",
        "Argentina","Chile","Colombia","Peru","Egypt","Nigeria","Kenya","Ethiopia","Ghana","Morocco",
        "Spain","Portugal","Netherlands","Belgium","Switzerland","Sweden","Norway","Denmark","Finland","Poland",
        "Ukraine","Greece","Austria","New Zealand","Israel","Algeria","Tunisia","Libya","Cameroon","Ango",
        "Mozambique","Botswana","Namibia","Madagascar","Senegal","Ivory Coast","Mali","Niger","Somalia","Yemen",
        "Syria","Jordan","Lebanon","Armenia","Azerbaijan", "Georgia","Bahrain","Iceland","Ireland","Luxembourg",
        "Monaco","San Marino","Liechtenstein","Malta","Cyprus","Palestine", "Georgia","Bahrain","Iceland","Ireland","Luxembourg",
        "Monaco","San Marino","Liechtenstein","Malta","Cyprus","Palestine","Hungary","Romania","Bulgaria","Serbia","Croatia",
        "Slovenia","Bosnia and Herzegovina","Montenegro","North Macedonia","Kosovo",
        "Albania","Vatican City","Andorra","Solomon Islands","Vanuatu","Samoa","Tonga","Kiribati",
        "Tuvalu","Nauru","Marshall Islands","Palau","Micronesia",
        "New Caledonia","French Polynesia","Greenland","Belize","Costa Rica",
        "Nicaragua","Honduras","El Salvador","Panama","Guatemala","Jamaica","Trinidad and Tobago","Barbados",
        "Saint Lucia","Saint Vincent and the Grenadines","Grenada","Dominica","Antigua and Barbuda",
        "Bahamas","Guyana","Suriname","French Guiana"
        };

        for (String country : countries) {
            System.out.println(country);
            String[] states = Country.findStatesByCountry(country);
            Country.displayStates(states);
            System.out.println("Display the Country");
        }
    }
}
