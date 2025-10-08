
public class MySwingMVCApp {
	public MySwingMVCApp() {
	}

	public static void main(String[] args) {
		CashRegister register = new CashRegister("prodInfo.txt");
		Display display = new Display();
		ScannerForApp scanner = new ScannerForApp();
		Controller controller = new Controller(register, display, scanner);
		controller.init();
	}
}
