package testes.awt;

//Program to demonstrate action listeners and event handlers 
import java.awt.*;
import java.awt.event.*;

class GuiListener implements ActionListener, WindowListener {
	// define methods in WindowListener interface
	public void windowClosing(WindowEvent event) {
		System.exit(0);
	}

	public void windowClosed(WindowEvent event) {
	} // do nothing for now

	public void windowDeiconified(WindowEvent event) {
	}

	public void windowIconified(WindowEvent event) {
	}

	public void windowActivated(WindowEvent event) {
	}

	public void windowDeactivated(WindowEvent event) {
	}

	public void windowOpened(WindowEvent event) {
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getActionCommand().equals("press me")) {
			System.out.println("Button pressed!");
		}
	}

}

class Gui2 extends Frame {
	// constructor
	public Gui2(String s) {
		super(s);
		setBackground(Color.yellow);
		setLayout(new FlowLayout());

		GuiListener listener = new GuiListener();

		addWindowListener(listener);
		Button pushButton = new Button("press me");
		add(pushButton);
		pushButton.addActionListener(listener); // listen for Button press
	}

}

class Exemplo2 {
	public static void main(String[] args) {
		Gui2 screen = new Gui2("Example 3");
		screen.setSize(500, 100);
		screen.setVisible(true);
	}
}
