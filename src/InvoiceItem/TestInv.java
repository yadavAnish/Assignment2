package InvoiceItem;

public class TestInv {
    public static void main(String[] args) {

        InvoiceItem item1 = new InvoiceItem("001", "Pen", 5, 1.50);
        item1.displayInfo();

        item1.setQuantity(10); // Change quantity
        item1.setUnitPrice(2.0); // Change unit price
        item1.displayInfo();

    }
}
