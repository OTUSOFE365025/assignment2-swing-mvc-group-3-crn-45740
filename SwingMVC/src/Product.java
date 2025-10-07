import java.text.DecimalFormat;

class Product {
    private int upc;
    private String name;
    private double price;

    public Product(int upc, String name, double price) {
        this.upc = upc;
        this.name = name;
        this.price = price;
    }

    public int getUpc() {
        return this.upc;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return Math.round(this.price);
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return this.name + " - $" + df.format(this.price);
    }
}
