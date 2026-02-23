class Country {

    public static String[] findStatesByCountry(String countryName) {

        if (countryName.equals("India")) {
            String[] states = {
                "Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh",
                "Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand",
                "Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur",
                "Meghalaya","Mizoram","Nagaland","Odisha","Punjab",
                "Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura",
                "Uttar Pradesh","Uttarakhand","West Bengal"
            };
            return states;
        }

        if (countryName.equals("United States")) {
            String[] states = {
                "Alabama","Alaska","Arizona","Arkansas","California",
                "Colorado","Connecticut","Delaware","Florida","Georgia",
                "Hawaii","Idaho","Illinois","Indiana","Iowa",
                "Kansas","Kentucky","Louisiana","Maine","Maryland",
                "Massachusetts","Michigan","Minnesota","Mississippi","Missouri",
                "Montana","Nebraska","Nevada","New Hampshire","New Jersey",
                "New Mexico","New York","North Carolina","North Dakota","Ohio",
                "Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina",
                "South Dakota","Tennessee","Texas","Utah","Vermont",
                "Virginia","Washington","West Virginia","Wisconsin","Wyoming"
            };
            return states;
        }

        if (countryName.equals("Canada")) {
            String[] states = {
                "Alberta","British Columbia","Manitoba","New Brunswick",
                "Newfoundland and Labrador","Nova Scotia","Ontario",
                "Prince Edward Island","Quebec","Saskatchewan"
            };
            return states;
        }

        if (countryName.equals("Australia")) {
            String[] states = {
                "New South Wales","Queensland","South Australia",
                "Tasmania","Victoria","Western Australia"
            };
            return states;
        }

        if (countryName.equals("Germany")) {
            String[] states = {
                "Bavaria","Berlin","Brandenburg","Bremen","Hamburg",
                "Hesse","Lower Saxony","Saxony","Thuringia","Saarland"
            };
            return states;
        }

        if (countryName.equals("France")) {
            String[] states = {
                "Auvergne","Brittany","Corsica","Normandy","Occitanie",
                "Provence","Grand Est","Hauts-de-France"
            };
            return states;
        }

        if (countryName.equals("Italy")) {
            String[] states = {
                "Lombardy","Sicily","Sardinia","Tuscany","Veneto",
                "Lazio","Piedmont","Campania"
            };
            return states;
        }

        if (countryName.equals("United Kingdom")) {
            String[] states = {
                "England","Scotland","Wales","Northern Ireland"
            };
            return states;
        }

        if (countryName.equals("China")) {
            String[] states = {
                "Guangdong","Beijing","Shanghai","Sichuan",
                "Zhejiang","Hunan","Hubei","Jiangsu"
            };
            return states;
        }

        if (countryName.equals("Japan")) {
            String[] states = {
                "Hokkaido","Tokyo","Osaka","Kyoto",
                "Aichi","Fukuoka","Hiroshima"
            };
            return states;
        }

        if (countryName.equals("Brazil")) {
            String[] states = {
                "Sao Paulo","Rio de Janeiro","Bahia",
                "Minas Gerais","Parana","Amazonas"
            };
            return states;
        }

        if (countryName.equals("Russia")) {
            String[] states = {
                "Moscow","Saint Petersburg","Tatarstan",
                "Siberia","Chechnya"
            };
            return states;
        }

        if (countryName.equals("South Africa")) {
            String[] states = {
                "Gauteng","Western Cape","Eastern Cape",
                "KwaZulu-Natal","Free State"
            };
            return states;
        }

        if (countryName.equals("Mexico")) {
            String[] states = {
                "Jalisco","Puebla","Yucatan","Chiapas","Oaxaca"
            };
            return states;
        }

        if (countryName.equals("Indonesia")) {
            String[] states = {
                "Java","Sumatra","Bali","Kalimantan","Sulawesi"
            };
            return states;
        }

        if (countryName.equals("Pakistan")) {
            String[] states = {
                "Punjab","Sindh","Khyber Pakhtunkhwa","Balochistan"
            };
            return states;
        }

        if (countryName.equals("Bangladesh")) {
            String[] states = {
                "Dhaka","Chittagong","Khulna","Rajshahi"
            };
            return states;
        }

        if (countryName.equals("Nepal")) {
            String[] states = {
                "Bagmati","Gandaki","Karnali","Lumbini"
            };
            return states;
        }

        if (countryName.equals("Sri Lanka")) {
            String[] states = {
                "Western","Central","Southern","Northern"
            };
            return states;
        }

        if (countryName.equals("Malaysia")) {
            String[] states = {
                "Johor","Kedah","Kelantan","Malacca",
                "Pahang","Perak","Sabah","Sarawak"
            };
            return states;
        }
		        if (countryName.equals("Singapore")) {
            String[] states = {"Central Region","North Region","North-East Region","East Region","West Region"};
            return states;
        }

        if (countryName.equals("Thailand")) {
            String[] states = {"Bangkok","Chiang Mai","Phuket","Pattaya","Krabi"};
            return states;
        }

        if (countryName.equals("Vietnam")) {
            String[] states = {"Hanoi","Ho Chi Minh City","Da Nang","Hai Phong","Can Tho"};
            return states;
        }

        if (countryName.equals("Philippines")) {
            String[] states = {"Luzon","Visayas","Mindanao","Cebu","Palawan"};
            return states;
        }

        if (countryName.equals("South Korea")) {
            String[] states = {"Seoul","Busan","Incheon","Daegu","Daejeon"};
            return states;
        }

        if (countryName.equals("North Korea")) {
            String[] states = {"Pyongyang","Ryanggang","South Pyongan","North Hamgyong"};
            return states;
        }

        if (countryName.equals("Saudi Arabia")) {
            String[] states = {"Riyadh","Makkah","Madinah","Eastern Province","Asir"};
            return states;
        }

        if (countryName.equals("United Arab Emirates")) {
            String[] states = {"Abu Dhabi","Dubai","Sharjah","Ajman","Fujairah","Ras Al Khaimah","Umm Al Quwain"};
            return states;
        }

        if (countryName.equals("Qatar")) {
            String[] states = {"Doha","Al Rayyan","Al Wakrah","Al Khor"};
            return states;
        }

        if (countryName.equals("Kuwait")) {
            String[] states = {"Al Ahmadi","Al Farwaniyah","Hawalli","Capital","Jahra"};
            return states;
        }

        if (countryName.equals("Oman")) {
            String[] states = {"Muscat","Dhofar","Al Batinah","Al Dakhiliyah"};
            return states;
        }

        if (countryName.equals("Turkey")) {
            String[] states = {"Istanbul","Ankara","Izmir","Antalya","Bursa"};
            return states;
        }

        if (countryName.equals("Iran")) {
            String[] states = {"Tehran","Isfahan","Shiraz","Tabriz","Mashhad"};
            return states;
        }

        if (countryName.equals("Iraq")) {
            String[] states = {"Baghdad","Basra","Mosul","Erbil","Karbala"};
            return states;
        }

        if (countryName.equals("Afghanistan")) {
            String[] states = {"Kabul","Kandahar","Herat","Mazar-i-Sharif","Kunduz"};
            return states;
        }

        if (countryName.equals("Argentina")) {
            String[] states = {"Buenos Aires","Cordoba","Santa Fe","Mendoza","Salta"};
            return states;
        }

        if (countryName.equals("Chile")) {
            String[] states = {"Santiago","Valparaiso","Concepcion","Antofagasta","Atacama"};
            return states;
        }

        if (countryName.equals("Colombia")) {
            String[] states = {"Bogota","Medellin","Cali","Cartagena","Barranquilla"};
            return states;
        }

        if (countryName.equals("Peru")) {
            String[] states = {"Lima","Cusco","Arequipa","Piura","Trujillo"};
            return states;
        }

        if (countryName.equals("Egypt")) {
            String[] states = {"Cairo","Alexandria","Giza","Luxor","Aswan"};
            return states;
        }
		        if (countryName.equals("Nigeria")) {
            String[] states = {"Lagos","Kano","Kaduna","Rivers","Abuja"};
            return states;
        }

        if (countryName.equals("Kenya")) {
            String[] states = {"Nairobi","Mombasa","Kisumu","Nakuru","Eldoret"};
            return states;
        }

        if (countryName.equals("Ethiopia")) {
            String[] states = {"Addis Ababa","Oromia","Amhara","Tigray","Somali"};
            return states;
        }

        if (countryName.equals("Ghana")) {
            String[] states = {"Accra","Ashanti","Western","Eastern","Northern"};
            return states;
        }

        if (countryName.equals("Morocco")) {
            String[] states = {"Casablanca","Rabat","Marrakesh","Fes","Tangier"};
            return states;
        }

        if (countryName.equals("Spain")) {
            String[] states = {"Madrid","Catalonia","Andalusia","Valencia","Galicia"};
            return states;
        }

        if (countryName.equals("Portugal")) {
            String[] states = {"Lisbon","Porto","Algarve","Madeira","Azores"};
            return states;
        }

        if (countryName.equals("Netherlands")) {
            String[] states = {"North Holland","South Holland","Utrecht","Groningen","Limburg"};
            return states;
        }

        if (countryName.equals("Belgium")) {
            String[] states = {"Flanders","Wallonia","Brussels"};
            return states;
        }

        if (countryName.equals("Switzerland")) {
            String[] states = {"Zurich","Geneva","Bern","Lucerne","Basel"};
            return states;
        }

        if (countryName.equals("Sweden")) {
            String[] states = {"Stockholm","Skane","Vastra Gotaland","Uppsala","Orebro"};
            return states;
        }

        if (countryName.equals("Norway")) {
            String[] states = {"Oslo","Bergen","Trondheim","Stavanger","Tromso"};
            return states;
        }

        if (countryName.equals("Denmark")) {
            String[] states = {"Copenhagen","Aarhus","Odense","Aalborg","Zealand"};
            return states;
        }

        if (countryName.equals("Finland")) {
            String[] states = {"Helsinki","Espoo","Tampere","Turku","Oulu"};
            return states;
        }

        if (countryName.equals("Poland")) {
            String[] states = {"Warsaw","Krakow","Lodz","Wroclaw","Poznan"};
            return states;
        }

        if (countryName.equals("Ukraine")) {
            String[] states = {"Kyiv","Lviv","Odessa","Kharkiv","Dnipro"};
            return states;
        }

        if (countryName.equals("Greece")) {
            String[] states = {"Athens","Thessaloniki","Crete","Rhodes","Patras"};
            return states;
        }

        if (countryName.equals("Austria")) {
            String[] states = {"Vienna","Salzburg","Tyrol","Styria","Carinthia"};
            return states;
        }

        if (countryName.equals("New Zealand")) {
            String[] states = {"Auckland","Wellington","Christchurch","Canterbury","Otago"};
            return states;
        }

        if (countryName.equals("Israel")) {
            String[] states = {"Jerusalem","Tel Aviv","Haifa","Nazareth","Beersheba"};
            return states;
        }
		        if (countryName.equals("Myanmar")) {
            String[] states = {"Yangon","Mandalay","Naypyidaw","Shan","Kachin"};
            return states;
        }

        if (countryName.equals("Cambodia")) {
            String[] states = {"Phnom Penh","Siem Reap","Battambang","Kampot"};
            return states;
        }

        if (countryName.equals("Laos")) {
            String[] states = {"Vientiane","Luang Prabang","Savannakhet","Champasak"};
            return states;
        }

        if (countryName.equals("Mongolia")) {
            String[] states = {"Ulaanbaatar","Orkhon","Darkhan","Khentii"};
            return states;
        }

        if (countryName.equals("Kazakhstan")) {
            String[] states = {"Almaty","Astana","Shymkent","Karaganda"};
            return states;
        }

        if (countryName.equals("Uzbekistan")) {
            String[] states = {"Tashkent","Samarkand","Bukhara","Andijan"};
            return states;
        }

        if (countryName.equals("Turkmenistan")) {
            String[] states = {"Ashgabat","Balkan","Dashoguz","Mary"};
            return states;
        }

        if (countryName.equals("Kyrgyzstan")) {
            String[] states = {"Bishkek","Osh","Naryn","Talas"};
            return states;
        }

        if (countryName.equals("Tajikistan")) {
            String[] states = {"Dushanbe","Sughd","Khatlon","Gorno-Badakhshan"};
            return states;
        }

        if (countryName.equals("Maldives")) {
            String[] states = {"Male","Addu","Fuvahmulah","Kulhudhuffushi"};
            return states;
        }

        if (countryName.equals("Bhutan")) {
            String[] states = {"Thimphu","Paro","Punakha","Wangdue"};
            return states;
        }

        if (countryName.equals("Brunei")) {
            String[] states = {"Brunei-Muara","Belait","Tutong","Temburong"};
            return states;
        }

        if (countryName.equals("Timor-Leste")) {
            String[] states = {"Dili","Baucau","Ermera","Liquica"};
            return states;
        }

        if (countryName.equals("Papua New Guinea")) {
            String[] states = {"Port Moresby","Morobe","Madang","Highlands"};
            return states;
        }

        if (countryName.equals("Fiji")) {
            String[] states = {"Central","Western","Northern","Eastern"};
            return states;
        }

        if (countryName.equals("Zimbabwe")) {
            String[] states = {"Harare","Bulawayo","Manicaland","Mashonaland"};
            return states;
        }

        if (countryName.equals("Zambia")) {
            String[] states = {"Lusaka","Copperbelt","Southern","Eastern"};
            return states;
        }

        if (countryName.equals("Tanzania")) {
            String[] states = {"Dar es Salaam","Dodoma","Arusha","Mwanza"};
            return states;
        }

        if (countryName.equals("Uganda")) {
            String[] states = {"Kampala","Gulu","Mbarara","Jinja"};
            return states;
        }

        if (countryName.equals("Sudan")) {
            String[] states = {"Khartoum","Darfur","Kordofan","Blue Nile"};
            return states;
        }
		        if (countryName.equals("Algeria")) {
            String[] states = {"Algiers","Oran","Constantine","Annaba","Blida"};
            return states;
        }

        if (countryName.equals("Tunisia")) {
            String[] states = {"Tunis","Sfax","Sousse","Kairouan","Bizerte"};
            return states;
        }

        if (countryName.equals("Libya")) {
            String[] states = {"Tripoli","Benghazi","Misrata","Sabha","Zawiya"};
            return states;
        }

        if (countryName.equals("Cameroon")) {
            String[] states = {"Yaounde","Douala","Bamenda","Garoua","Maroua"};
            return states;
        }

        if (countryName.equals("Angola")) {
            String[] states = {"Luanda","Benguela","Huambo","Lobito","Malanje"};
            return states;
        }

        if (countryName.equals("Mozambique")) {
            String[] states = {"Maputo","Beira","Nampula","Tete","Quelimane"};
            return states;
        }

        if (countryName.equals("Botswana")) {
            String[] states = {"Gaborone","Francistown","Maun","Serowe","Kanye"};
            return states;
        }

        if (countryName.equals("Namibia")) {
            String[] states = {"Windhoek","Swakopmund","Walvis Bay","Oshakati","Rundu"};
            return states;
        }

        if (countryName.equals("Madagascar")) {
            String[] states = {"Antananarivo","Toamasina","Fianarantsoa","Mahajanga","Toliara"};
            return states;
        }

        if (countryName.equals("Senegal")) {
            String[] states = {"Dakar","Saint-Louis","Thies","Kaolack","Ziguinchor"};
            return states;
        }

        if (countryName.equals("Ivory Coast")) {
            String[] states = {"Abidjan","Yamoussoukro","Bouake","Daloa","San Pedro"};
            return states;
        }

        if (countryName.equals("Mali")) {
            String[] states = {"Bamako","Sikasso","Segou","Mopti","Gao"};
            return states;
        }

        if (countryName.equals("Niger")) {
            String[] states = {"Niamey","Zinder","Maradi","Tahoua","Agadez"};
            return states;
        }

        if (countryName.equals("Somalia")) {
            String[] states = {"Mogadishu","Hargeisa","Kismayo","Baidoa","Bosaso"};
            return states;
        }

        if (countryName.equals("Yemen")) {
            String[] states = {"Sanaa","Aden","Taiz","Hodeidah","Ibb"};
            return states;
        }

        if (countryName.equals("Syria")) {
            String[] states = {"Damascus","Aleppo","Homs","Hama","Latakia"};
            return states;
        }

        if (countryName.equals("Jordan")) {
            String[] states = {"Amman","Irbid","Zarqa","Aqaba","Madaba"};
            return states;
        }

        if (countryName.equals("Lebanon")) {
            String[] states = {"Beirut","Tripoli","Sidon","Tyre","Zahle"};
            return states;
        }

        if (countryName.equals("Armenia")) {
            String[] states = {"Yerevan","Shirak","Lori","Kotayk","Tavush"};
            return states;
        }

        if (countryName.equals("Azerbaijan")) {
            String[] states = {"Baku","Ganja","Sumqayit","Lankaran","Nakhchivan"};
            return states;
        }
		        if (countryName == "South Sudan") {
            String[] states = {"Juba","Malakal","Wau","Yei","Bor"};
            return states;
        }

        if (countryName == "Democratic Republic of Congo") {
            String[] states = {"Kinshasa","Lubumbashi","Mbuji-Mayi","Goma","Kisangani"};
            return states;
        }

        if (countryName == "Republic of Congo") {
            String[] states = {"Brazzaville","Pointe-Noire","Dolisie","Nkayi"};
            return states;
        }

        if (countryName == "Gabon") {
            String[] states = {"Libreville","Port-Gentil","Franceville","Oyem"};
            return states;
        }

        if (countryName == "Equatorial Guinea") {
            String[] states = {"Malabo","Bata","Mongomo","Evinayong"};
            return states;
        }

        if (countryName == "Burundi") {
            String[] states = {"Bujumbura","Gitega","Ngozi","Muyinga"};
            return states;
        }

        if (countryName == "Rwanda") {
            String[] states = {"Kigali","Butare","Gisenyi","Ruhengeri"};
            return states;
        }

        if (countryName == "Malawi") {
            String[] states = {"Lilongwe","Blantyre","Mzuzu","Zomba"};
            return states;
        }

        if (countryName == "Lesotho") {
            String[] states = {"Maseru","Mafeteng","Butha-Buthe","Quthing"};
            return states;
        }

        if (countryName == "Eswatini") { // Swaziland
            String[] states = {"Mbabane","Manzini","Lobamba","Siteki"};
            return states;
        }

        if (countryName == "Estonia") {
            String[] states = {"Tallinn","Tartu","Narva","Pärnu"};
            return states;
        }

        if (countryName == "Latvia") {
            String[] states = {"Riga","Daugavpils","Liepaja","Jelgava"};
            return states;
        }

        if (countryName == "Lithuania") {
            String[] states = {"Vilnius","Kaunas","Klaipeda","Šiauliai"};
            return states;
        }

        if (countryName == "Belarus") {
            String[] states = {"Minsk","Gomel","Mogilev","Vitebsk"};
            return states;
        }

        if (countryName == "Moldova") {
            String[] states = {"Chisinau","Tiraspol","Balti","Bender"};
            return states;
        }

        if (countryName == "Czech Republic") {
            String[] states = {"Prague","Brno","Ostrava","Plzen"};
            return states;
        }

        if (countryName == "Slovakia") {
            String[] states = {"Bratislava","Kosice","Presov","Nitra"};
            return states;
        }
		        if (countryName == "Hungary") {
            String[] states = {"Budapest","Debrecen","Szeged","Miskolc","Pecs"};
            return states;
        }

        if (countryName == "Romania") {
            String[] states = {"Bucharest","Cluj-Napoca","Timisoara","Iasi","Constanta"};
            return states;
        }

        if (countryName == "Bulgaria") {
            String[] states = {"Sofia","Plovdiv","Varna","Burgas","Ruse"};
            return states;
        }

        if (countryName == "Serbia") {
            String[] states = {"Belgrade","Novi Sad","Niš","Kragujevac","Subotica"};
            return states;
        }

        if (countryName == "Croatia") {
            String[] states = {"Zagreb","Split","Rijeka","Osijek","Dubrovnik"};
            return states;
        }

        if (countryName == "Slovenia") {
            String[] states = {"Ljubljana","Maribor","Celje","Kranj","Velenje"};
            return states;
        }

        if (countryName == "Bosnia and Herzegovina") {
            String[] states = {"Sarajevo","Banja Luka","Mostar","Tuzla","Zenica"};
            return states;
        }

        if (countryName == "Montenegro") {
            String[] states = {"Podgorica","Nikšić","Herceg Novi","Budva","Bar"};
            return states;
        }

        if (countryName == "North Macedonia") {
            String[] states = {"Skopje","Bitola","Tetovo","Kumanovo","Ohrid"};
            return states;
        }

        if (countryName == "Kosovo") {
            String[] states = {"Pristina","Prizren","Peja","Gjakova","Mitrovica"};
            return states;
        }

        if (countryName == "Albania") {
            String[] states = {"Tirana","Durres","Vlore","Shkoder","Elbasan"};
            return states;
        }

        if (countryName == "Vatican City") {
            String[] states = {"Vatican City"};
            return states;
        }

        if (countryName == "Andorra") {
            String[] states = {"Andorra la Vella","Escaldes-Engordany","Encamp","Sant Julià de Lòria"};
            return states;
        }
		        if (countryName == "Solomon Islands") {
            String[] states = {"Honiara","Guadalcanal","Malaita","Makira-Ulawa"};
            return states;
        }

        if (countryName == "Vanuatu") {
            String[] states = {"Port Vila","Luganville","Tanna","Espiritu Santo"};
            return states;
        }

        if (countryName == "Samoa") {
            String[] states = {"Apia","Upolu","Savaii"};
            return states;
        }

        if (countryName == "Tonga") {
            String[] states = {"Nuku'alofa","Vava'u","Ha'apai"};
            return states;
        }

        if (countryName == "Kiribati") {
            String[] states = {"South Tarawa","Kiritimati","Banaba"};
            return states;
        }

        if (countryName == "Tuvalu") {
            String[] states = {"Funafuti","Nanumea","Nui","Vaitupu"};
            return states;
        }

        if (countryName == "Nauru") {
            String[] states = {"Yaren","Denigomodu","Aiwo","Anetan"};
            return states;
        }

        if (countryName == "Marshall Islands") {
            String[] states = {"Majuro","Ebeye","Jaluit"};
            return states;
        }

        if (countryName == "Palau") {
            String[] states = {"Koror","Airai","Babeldaob"};
            return states;
        }

        if (countryName == "Micronesia") {
            String[] states = {"Chuuk","Pohnpei","Kosrae","Yap"};
            return states;
        }

        if (countryName == "New Caledonia") {
            String[] states = {"Noumea","Bourail","Koné","Lifou"};
            return states;
        }

        if (countryName == "French Polynesia") {
            String[] states = {"Papeete","Bora Bora","Moorea","Tahiti"};
            return states;
        }

        if (countryName == "Greenland") {
            String[] states = {"Nuuk","Godthab","Sisimiut","Ilulissat"};
            return states;
        }

        if (countryName == "Belize") {
            String[] states = {"Belmopan","Belize City","San Ignacio","Orange Walk"};
            return states;
        }

        if (countryName == "Costa Rica") {
            String[] states = {"San Jose","Alajuela","Cartago","Heredia","Guanacaste"};
            return states;
        }

        if (countryName == "Nicaragua") {
            String[] states = {"Managua","Leon","Granada","Masaya"};
            return states;
        }

        if (countryName == "Honduras") {
            String[] states = {"Tegucigalpa","San Pedro Sula","La Ceiba","Choluteca"};
            return states;
        }

        if (countryName == "El Salvador") {
            String[] states = {"San Salvador","Santa Ana","San Miguel","La Libertad"};
            return states;
        }
		        if (countryName == "Panama") {
            String[] states = {"Panama City","Colón","David","Santiago"};
            return states;
        }

        if (countryName == "Guatemala") {
            String[] states = {"Guatemala City","Quetzaltenango","Escuintla","Antigua"};
            return states;
        }

        if (countryName == "Jamaica") {
            String[] states = {"Kingston","Montego Bay","Spanish Town","Mandeville"};
            return states;
        }

        if (countryName == "Trinidad and Tobago") {
            String[] states = {"Port of Spain","San Fernando","Scarborough","Arima"};
            return states;
        }

        if (countryName == "Barbados") {
            String[] states = {"Bridgetown","Speightstown","Oistins","Holetown"};
            return states;
        }

        if (countryName == "Saint Lucia") {
            String[] states = {"Castries","Vieux Fort","Gros Islet","Soufrière"};
            return states;
        }

        if (countryName == "Saint Vincent and the Grenadines") {
            String[] states = {"Kingstown","Georgetown","Barrouallie","Calliaqua"};
            return states;
        }

        if (countryName == "Grenada") {
            String[] states = {"St. George's","Grenville","Carriacou","Sauteurs"};
            return states;
        }

        if (countryName == "Dominica") {
            String[] states = {"Roseau","Portsmouth","Marigot","Calibishie"};
            return states;
        }

        if (countryName == "Antigua and Barbuda") {
            String[] states = {"St. John's","All Saints","Liberta","Potters Village"};
            return states;
        }

        if (countryName == "Bahamas") {
            String[] states = {"Nassau","Freeport","West End","Marsh Harbour"};
            return states;
        }

        if (countryName == "Guyana") {
            String[] states = {"Georgetown","Linden","New Amsterdam","Bartica"};
            return states;
        }

        if (countryName == "Suriname") {
            String[] states = {"Paramaribo","Lelydorp","Nieuw Nickerie","Moengo"};
            return states;
        }

        if (countryName == "French Guiana") {
            String[] states = {"Cayenne","Saint-Laurent-du-Maroni","Kourou","Matoury"};
            return states;
        }
		

        return null;
    }

    public static void displayStates(String[] states) {
        if (states != null) {
            for (String state : states) {
                System.out.println(state);
            }
        } else {
            System.out.println("Country not found");
        }
    }
}

