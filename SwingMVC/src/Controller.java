

import java.util.Iterator;

public class Controller {
	private CashRegister model;
	private Display view;
	private ScannerForApp scanner;

	public Controller(CashRegister model, Display view, ScannerForApp scanner) {
		this.model = model;
		this.view = view;
		this.scanner = scanner;
	}

	public void init() {
		this.scanner.setScanListener((upc) -> {
			this.model.addItem(upc);
			StringBuilder itemsText = new StringBuilder();
			Iterator var3 = this.model.getScannedItems().iterator();

			while(var3.hasNext()) {
				Product p = (Product)var3.next();
				itemsText.append(p.toString()).append("\n");
			}

			this.view.updateDisplay(itemsText.toString(), this.model.getSubtotal());
		}
		);
	}
}
