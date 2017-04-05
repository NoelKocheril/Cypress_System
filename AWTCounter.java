import java.awt.*;
import java.awt.event.*;
import java.io.IOException;


public class AWTCounter extends Frame implements ActionListener, WindowListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private Button btnReset;
	private int count = 0;

	public AWTCounter () {
		setLayout(new FlowLayout());

		lblCount = new Label("Counter");
		add(lblCount);

		tfCount = new TextField("0", 10);
		tfCount.setEditable(false);
		add(tfCount);

		btnCount = new Button("Count");
		add(btnCount);

		btnCount.addActionListener(this);

		setTitle("AWT Counter");
		setSize(250,100);
		setLocation(500,250);
		setResizable(false);
				
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AWTCounter app = new AWTCounter();
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		++count;
		tfCount.setText(count + "");
	}
	
	public void windowClosing(WindowEvent evt) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
