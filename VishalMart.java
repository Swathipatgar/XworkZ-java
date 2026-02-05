class VishalMart{
    public static void main(String[] mart) {

    String groceries[] = {
        "Rice","Wheat","Sugar","Salt","Oil","Atta","Rava","Maida","Dal","Chana","Rajma","Poha","Cornflakes","Oats","Vermicelli",
        "Jaggery","Honey","Tea","Coffee","Spices","Masala","Pickle","Sauce","Vinegar","Baking Powder"};

    String fruits[]= {
        "Apple","Banana","Mango","Orange","Grapes","Pineapple","Papaya","Watermelon","Muskmelon","Guava","Pear","Cherry","Strawberry",
        "Blueberry","Kiwi","Pomegranate","Plum","Peach","Apricot","Litchi","Fig","Dragon Fruit","Custard Apple","Jackfruit","Avocado" };

    String vegetables[] = {
        "Potato","Tomato","Onion","Carrot","Cabbage","Cauliflower","Beans","Brinjal","Spinach","Radish","Beetroot","Pumpkin","Cucumber",
        "Bottle Gourd","Bitter Gourd","Ridge Gourd","Drumstick",
        "Green Chilli","Capsicum","Peas","Sweet Corn","Broccoli","Mushroom","Okra","Spring Onion"};

    String dairyItems[]= {
        "Milk","Curd","Butter","Cheese","Paneer","Ghee","Cream","Buttermilk","Flavored Milk","Milk Powder","Ice Cream",
        "Yogurt","Lassi","Whipping Cream","Condensed Milk","Mozzarella","Cheddar","Parmesan","Cottage Cheese",
        "Sour Cream","Chocolate Milk","Vanilla Milk","Strawberry Milk","Kulfi","Frozen Yogurt"};

    String bakeryItems[]= {
        "Bread","Brown Bread","Buns","Croissant","Donut","Muffin", "Cupcake","Cake","Pastry","Puff","Cookies","Biscuits",
        "Toast","Garlic Bread","Pizza Base","Burger Bun","Rolls", "Brownies","Rusks","Fruit Cake","Sponge Cake","Cheese Cake",
        "Waffles","Pancake Mix","Tart"};

    String beverages[] = {
        "Water","Mineral Water","Soda","Cola","Orange Juice","Apple Juice","Mango Juice","Lemon Juice","Energy Drink","Sports Drink",
        "Iced Tea","Green Tea","Black Tea","Coffee","Cold Coffee",
        "Milk Shake","Smoothie","Mocktail","Coconut Water","Buttermilk","Herbal Tea","Flavored Water","Tonic Water","Ginger Ale","Root Beer" };

    String snacks[] = {
        "Chips","Nachos","Popcorn","Peanuts","Cashews","Almonds",
        "Pistachios","Trail Mix","Murukku","Chakli","Mixture","Sev",
        "Biscuits","Cookies","Energy Bar","Protein Bar","Granola Bar",
        "Puffs","Cheese Balls","Samosa","Kachori","Spring Roll",
        "French Fries","Veg Nuggets","Corn Chips"};

    String frozenFoods[] = {
        "Frozen Peas","Frozen Corn","Frozen Veg Mix","Frozen Paratha",
        "Frozen Roti","Frozen Pizza","Frozen Burger Patty",
        "Frozen Fries","Frozen Nuggets","Frozen Momos",
        "Frozen Idli","Frozen Dosa","Frozen Vada","Frozen Pav Bhaji",
        "Frozen Biryani","Frozen Pulav","Frozen Samosa",
        "Frozen Spring Roll","Frozen Cutlet","Frozen Fish",
        "Frozen Chicken","Frozen Prawns","Frozen Ice Cream",
        "Frozen Kulfi","Frozen Dessert"};

    String meatSeafoods[] = {
        "Chicken","Mutton","Beef","Pork","Fish","Prawns","Crab","Lobster","Salmon","Tuna","Sardine","Anchovy","Chicken Breast",
        "Chicken Wings","Chicken Legs","Minced Meat","Sausages","Bacon","Ham","Turkey","Duck","Quail","Octopus","Squid","Clams" };

    String personalCares[] = {
        "Soap","Shampoo","Conditioner","Hair Oil","Face Wash","Face Cream", "Body Lotion","Toothpaste","Toothbrush","Mouthwash",
        "Hand Wash","Sanitizer","Deodorant","Perfume","Hair Gel",
        "Hair Spray","Face Mask","Scrub","Moisturizer","Sunscreen", "Lip Balm","Shaving Cream","Razor","After Shave","Body Spray"};

    String householdItems[] = {
        "Detergent","Washing Powder","Dish Wash","Floor Cleaner",
        "Phenyl","Toilet Cleaner","Room Freshener","Mosquito Repellent",  "Garbage Bags","Tissues","Paper Towels","Aluminium Foil",
        "Cling Wrap","Napkins","Sponges","Scrub Pads","Brooms","Mops",
        "Buckets","Dustbin","Matchbox","Candles","Incense Sticks","Air Freshener","Cleaning Gloves"};

    String babyProducts[]= {
        "Baby Soap","Baby Shampoo","Baby Oil","Baby Lotion","Baby Cream",
        "Baby Powder","Baby Diapers","Baby Wipes","Baby Food",
        "Baby Cereal","Baby Bottle","Bottle Cleaner","Pacifier",
        "Teething Toy","Baby Towel","Baby Clothes","Baby Blanket",
        "Baby Soap Case","Baby Comb","Baby Nail Cutter",
        "Baby Feeding Spoon","Baby Bowl","Baby Bib","Baby Mattress","Baby Pillow"};

    String stationeries[]= {
        "Pen","Pencil","Eraser","Sharpener","Notebook","Diary","Sketch Book",
        "Marker","Highlighter","Stapler","Staples","Paper Clips",
        "Glue","Scissors","Scale","Calculator","File","Folder","Sticky Notes",
        "Chart Paper","White Board Marker","Correction Pen",
        "Drawing Book","Color Pencils","Crayons"};

    String electronics[] = {
        "Mobile","Laptop","Tablet","Headphones","Earphones","Speaker",
        "Charger","Power Bank","USB Cable","Extension Cord","Adapter",
        "Keyboard","Mouse","Monitor","Printer","Scanner","Webcam",
        "Smart Watch","Bluetooth Device","Router","Modem","Camera",
        "Tripod","Memory Card","Pendrive" };

    String clothingItems[]= {
        "Shirt","T-Shirt","Jeans","Trousers","Shorts","Skirt","Dress",
        "Saree","Kurta","Leggings","Jacket","Sweater","Hoodie",
        "Blazer","Suit","Night Wear","Sports Wear","Inner Wear",
        "Socks","Scarf","Cap","Hat","Raincoat","Belt","Gloves"};

    String footwears[] = {
        "Shoes","Sandals","Slippers","Flip Flops","Sneakers","Boots",
        "Heels","Flats","Loafers","Formal Shoes","Sports Shoes",
        "Casual Shoes","Ethnic Footwear","Clogs","Wedges",
        "Running Shoes","Walking Shoes","School Shoes",
        "Office Shoes","Sliders","Crocs","Ballet Flats","Moccasins","Ankle Boots","Flip Sandals"};
	
    String healthSupplieItems[] = {
        "Vitamin C","Multivitamins","Protein Powder","Calcium Tablets",
        "Iron Tablets","Fish Oil","Omega 3","First Aid Kit",
        "Bandages","Cotton","Antiseptic Cream","Pain Relief Spray",
        "Thermometer","BP Monitor","Glucometer","Face Mask",
        "Hand Gloves","Sanitary Pads","Tampons","Hand Sanitizer",
        "Oral Rehydration Salt","Ayurvedic Oil","Herbal Syrup",
        "Cough Drops","Health Drink"};

    String petSupplieItems[] = {
        "Dog Food","Cat Food","Bird Food","Fish Food","Pet Shampoo",
        "Pet Soap","Pet Collar","Pet Leash","Pet Toy","Pet Bed",
        "Pet Bowl","Pet Treats","Pet Grooming Kit","Pet Brush",
        "Pet Nail Cutter","Pet Blanket","Pet Carrier","Pet Cage",
        "Pet Litter","Pet Training Pads","Pet Vitamins",
        "Pet Water Bottle","Pet Harness","Pet Clothes","Pet Chew Bone"};

    String kitchenItems[] = {
        "Plates","Bowls","Spoons","Forks","Knives","Pressure Cooker",
        "Pan","Tawa","Kadai","Mixer","Grinder","Blender","Toaster",
        "Microwave","Gas Stove","Induction Stove","Cutting Board",
        "Lunch Box","Water Bottle","Flask","Measuring Cups",
        "Storage Containers","Colander","Peeler","Grater"};

    String cleaningTools[] = {
        "Broom","Mop","Dustpan","Vacuum Cleaner","Scrub Brush",
        "Toilet Brush","Cleaning Cloth","Duster","Spray Bottle",
        "Bucket","Wiper","Floor Brush","Hand Brush","Microfiber Cloth",
        "Gloves","Cleaning Sponge","Scrubber","Soap Dispenser",
        "Trash Can","Garbage Bin","Cleaning Caddy","Lint Roller",
        "Feather Duster","Steam Cleaner","Carpet Cleaner"};
		
		for(String grocery:groceries)
		{ System.out.println(grocery);
		}
		for(String fruit: fruits) System.out.println(fruit);
		for(String vegetable: vegetables) System.out.println(vegetable);
		for(String dairyItem: dairyItems) System.out.println(dairyItem);
		for(String bakeryItem: bakeryItems) System.out.println(bakeryItem);
		for(String beverage: beverages) System.out.println(beverage);
		for(String snack: snacks) System.out.println(snack);
		for(String frozenFood:frozenFoods) System.out.println(frozenFood);
		for(String meatSeafood: meatSeafoods) System.out.println(meatSeafood);
		for(String personalCare: personalCares) System.out.println(personalCares);
		for(String householdItem: householdItems) System.out.println(householdItem);
		for(String babyProduct: babyProducts) System.out.println(babyProduct);
		for(String stationery: stationeries) System.out.println(stationery);
		for(String electronic: electronics) System.out.println(electronic);
		for(String clothingItem: clothingItems) System.out.println(clothingItem);
		for(String footwear: footwears) System.out.println(footwear);
		for(String healthSupplieItem: healthSupplieItems) System.out.println(healthSupplieItem);
		for(String petSupplieItem: petSupplieItems) System.out.println(petSupplieItem);
		for(String kitchenItem: kitchenItems) System.out.println(kitchenItem);
		for(String cleaningTool: cleaningTools) System.out.println(cleaningTool);
}
}
