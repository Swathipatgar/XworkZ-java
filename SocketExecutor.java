class SocketExecutor {

    public static void main(String[] args) {

        System.out.println("Before Execution");

        Socket socket1 = new Socket();

        socket1.socketId = 1;
        socket1.socketBrand = "Anchor";
        socket1.socketColor = "White";
        socket1.socketPrice = 199.99;
        socket1.socketType = "Electric";
        socket1.socketMaterial = "Plastic";
        socket1.isWorking = true;
        socket1.isNew = true;
        socket1.socketCountry = "India";
        socket1.socketCompany = "Anchor Pvt Ltd";
        socket1.socketStock = 60;
        socket1.socketCategory = "Electrical";
        socket1.socketModel = "AN100";
        socket1.socketWeight = "100g";
        socket1.socketWidth = "5cm";
        socket1.socketLength = "5cm";
        socket1.socketManufactureDate = "12-02-2026";
        socket1.socketExpiryDate = "12-02-2035";
        socket1.socketCode = "SK001";
        socket1.socketFinish = "Matte";
        socket1.socketRemark = "Durable";
        socket1.socketStyle = "Modern";
        socket1.socketUse = "Home";
        socket1.socketQuality = "Premium";
        socket1.socketShape = "Square";

        System.out.println("Socket Id: " + socket1.socketId);
        System.out.println("Socket Brand: " + socket1.socketBrand);
        System.out.println("Socket Price: " + socket1.socketPrice);
        System.out.println("Socket Color: " + socket1.socketColor);

        System.out.println("After Execution");
    }
}