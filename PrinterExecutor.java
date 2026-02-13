class PrinterExecutor {
    public static void main(String[] args) {

        double price = Printer.getPrice();
        String brand = Printer.getBrand();
        String type = Printer.getType();
        boolean color = Printer.isColorPrintingSupported();
        String connectivity = Printer.getConnectivity();
        int warranty = Printer.getWarrantyYears();
        String speed = Printer.getPrintSpeed();
        String paper = Printer.getPaperSize();
        double rating = Printer.getRating();
        boolean prime = Printer.isPrimeAvailable();

        System.out.println("Brand of the printer: " + brand);
        System.out.println("Price of the printer: " + price);
        System.out.println("Type: " + type);
        System.out.println("Color Printing: " + color);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Print Speed: " + speed);
        System.out.println("Paper Size: " + paper);
        System.out.println("Rating: " + rating);
        System.out.println("Prime Available: " + prime);
    }
}
