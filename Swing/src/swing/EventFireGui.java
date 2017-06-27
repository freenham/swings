package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventFireGui extends JFrame {
	private static final long serialVersionUID = -711163588504124217L;

	public EventFireGui() {
		super("Swings 테스트중");
		setBounds(0, 0, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		JPanel pane = new JPanel();
		JButton buttonStart = new JButton("Start");
		buttonStart.setMnemonic('S');
		
		pane.add(buttonStart);
		contentPane.add(pane);
		
		
		setVisible(true);
	}

}
