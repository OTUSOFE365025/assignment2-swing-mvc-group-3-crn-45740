

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;

public class View {
	private JFrame frame;
	private JLabel firstnameLabel;
	private JLabel lastnameLabel;
	private JTextField firstnameTextfield;
	private JTextField lastnameTextfield;
	private JButton firstnameSaveButton;
	private JButton lastnameSaveButton;
	private JButton hello;
	private JButton bye;

	public View(String title) {
		this.frame = new JFrame(title);
		this.frame.getContentPane().setLayout(new BorderLayout());
		this.frame.setDefaultCloseOperation(3);
		this.frame.setSize(500, 120);
		this.frame.setLocationRelativeTo((Component)null);
		this.frame.setVisible(true);
		this.firstnameLabel = new JLabel("Firstname :");
		this.lastnameLabel = new JLabel("Lastname :");
		this.firstnameTextfield = new JTextField();
		this.lastnameTextfield = new JTextField();
		this.firstnameSaveButton = new JButton("Save firstname");
		this.lastnameSaveButton = new JButton("Save lastname");
		this.hello = new JButton("Hello!");
		this.bye = new JButton("Bye!");
		GroupLayout layout = new GroupLayout(this.frame.getContentPane());
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.firstnameLabel).addComponent(this.lastnameLabel)).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.firstnameTextfield).addComponent(this.lastnameTextfield)).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.firstnameSaveButton).addComponent(this.lastnameSaveButton)).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.hello).addComponent(this.bye)));
		layout.setVerticalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.firstnameLabel).addComponent(this.firstnameTextfield).addComponent(this.firstnameSaveButton).addComponent(this.hello)).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.lastnameLabel).addComponent(this.lastnameTextfield).addComponent(this.lastnameSaveButton).addComponent(this.bye)));
		layout.linkSize(0, new Component[]{this.firstnameSaveButton, this.lastnameSaveButton});
		layout.linkSize(0, new Component[]{this.hello, this.bye});
		this.frame.getContentPane().setLayout(layout);
	}

	public JFrame getFrame() {
		return this.frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getFirstnameLabel() {
		return this.firstnameLabel;
	}

	public void setFirstnameLabel(JLabel firstnameLabel) {
		this.firstnameLabel = firstnameLabel;
	}

	public JLabel getLastnameLabel() {
		return this.lastnameLabel;
	}

	public void setLastnameLabel(JLabel lastnameLabel) {
		this.lastnameLabel = lastnameLabel;
	}

	public JTextField getFirstnameTextfield() {
		return this.firstnameTextfield;
	}

	public void setFirstnameTextfield(JTextField firstnameTextfield) {
		this.firstnameTextfield = firstnameTextfield;
	}

	public JTextField getLastnameTextfield() {
		return this.lastnameTextfield;
	}

	public void setLastnameTextfield(JTextField lastnameTextfield) {
		this.lastnameTextfield = lastnameTextfield;
	}

	public JButton getFirstnameSaveButton() {
		return this.firstnameSaveButton;
	}

	public void setFirstnameSaveButton(JButton firstnameSaveButton) {
		this.firstnameSaveButton = firstnameSaveButton;
	}

	public JButton getLastnameSaveButton() {
		return this.lastnameSaveButton;
	}

	public void setLastnameSaveButton(JButton lastnameSaveButton) {
		this.lastnameSaveButton = lastnameSaveButton;
	}

	public JButton getHello() {
		return this.hello;
	}

	public void setHello(JButton hello) {
		this.hello = hello;
	}

	public JButton getBye() {
		return this.bye;
	}

	public void setBye(JButton bye) {
		this.bye = bye;
	}
}
