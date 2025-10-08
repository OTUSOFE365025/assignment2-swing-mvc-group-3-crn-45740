
//Acts as View for Cash Register

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Display {
    private JFrame frame = new JFrame("Cash Register Display");
    private JTextArea displayArea;
    private JLabel subtotalLabel;

    public Display() {
        this.frame.setSize(300, 400);
        this.frame.setDefaultCloseOperation(3);
        this.frame.setLayout(new BorderLayout());
        this.displayArea = new JTextArea();
        this.displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(this.displayArea);
        this.subtotalLabel = new JLabel("Subtotal: $0.00");
        this.frame.add(scrollPane, "Center");
        this.frame.add(this.subtotalLabel, "South");
        this.frame.setVisible(true);
    }

    public void updateDisplay(String items, double subtotal) {
        this.displayArea.setText(items);
        this.subtotalLabel.setText(String.format("Subtotal: $%.2f", subtotal));
    }
}

