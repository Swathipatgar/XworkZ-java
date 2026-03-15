class TableExecutor {

public static void main(String[] args){

System.out.println("Before Execution");

Table table1 = new Table();

table1.tableId = 1;
table1.tableBrand = "HomeStyle";
table1.tableColor = "Brown";
table1.tablePrice = 3500.99;
table1.tableType = "Dining";
table1.tableMaterial = "Wood";
table1.isStrong = true;
table1.isNew = true;
table1.tableCountry = "India";
table1.tableCompany = "Furniture Ltd";
table1.tableStock = 25;
table1.tableCategory = "Furniture";
table1.tableModel = "TB100";
table1.tableWeight = "10kg";
table1.tableWidth = "90cm";
table1.tableLength = "120cm";
table1.tableManufactureDate = "01-01-2026";
table1.tableExpiryDate = "01-01-2035";
table1.tableCode = "TB001";
table1.tableFinish = "Matte";
table1.tableRemark = "Strong Table";
table1.tableStyle = "Modern";
table1.tableUse = "Dining";
table1.tableQuality = "Premium";
table1.tableShape = "Rectangle";

System.out.println("Table Id: " + table1.tableId);
System.out.println("Table Brand: " + table1.tableBrand);

System.out.println("After Execution");

}
}