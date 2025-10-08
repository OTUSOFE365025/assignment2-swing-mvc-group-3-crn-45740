

import java.awt.BorderLayout;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScannerForApp {
	private JFrame frame = new JFrame("Scanner");
	private JPanel scannerPanel;
	private JButton scanButton;
	private ScanListener listener;

	public ScannerForApp() {
		this.frame.getContentPane().setLayout(new BorderLayout());
		this.frame.setDefaultCloseOperation(3);
		this.frame.setSize(200, 100);
		this.frame.setLocation(350, 100);
		this.scanButton = new JButton("Scan");
		this.scannerPanel = new JPanel();
		this.scannerPanel.add(this.scanButton);
		this.frame.getContentPane().add(this.scannerPanel, "Center");
		this.scanButton.addActionListener((e) -> {
			int upc = this.generateUPC();
			if (this.listener != null) {
				this.listener.onScan(upc);
			}

		}
		);
		this.frame.setVisible(true);
	}

	private int generateUPC() {
		int upcCode = 0;
		String fileName = "prodInfo.txt";

		try {
			List<String> lines = Files.readAllLines(Paths.get(fileName));
			if (!lines.isEmpty()) {
				Random rand = new Random();
				String randLine = lines.get(rand.nextInt(lines.size()));
				Scanner scan = new Scanner(randLine);
				upcCode = scan.nextInt();
				System.out.println("Scanned UPC: " + upcCode);
				scan.close();
			} else {
				System.out.println("Error: File is empty.");
			}
		} catch (IOException var7) {
			System.out.println("Error: Couldn't read file.");
		}

		return upcCode;
	}

	public void setScanListener(ScanListener listener) {
		this.listener = listener;
	}

	public JFrame getFrame() {
		return this.frame;
	}

	public JButton getScanButton() {
		return this.scanButton;
	}
}
