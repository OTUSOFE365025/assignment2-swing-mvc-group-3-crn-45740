

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CashRegister {
    private Map<Integer, Product> products = new HashMap();
    private List<Product> scannedItems = new ArrayList();

    public CashRegister(String fileName) {
        this.loadProducts(fileName);
    }

    private void loadProducts(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            Iterator var3 = lines.iterator();

            while(var3.hasNext()) {
                String line = (String)var3.next();
                String[] parts = line.split("\\s+");
                if (parts.length >= 3) {
                    int upc = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2].replace("$", ""));
                    this.products.put(upc, new Product(upc, name, price));
                }
            }
        } catch (IOException var10) {
            System.out.println("Error reading product file.");
        }

    }

    public void addItem(int upc) {
        if (this.products.containsKey(upc)) {
            this.scannedItems.add((Product)this.products.get(upc));
        } else {
            System.out.println("UPC not found.");
        }

    }

    public List<Product> getScannedItems() {
        return this.scannedItems;
    }

    public double getSubtotal() {
        return this.scannedItems.stream().mapToDouble(Product::getPrice).sum();
    }
}

