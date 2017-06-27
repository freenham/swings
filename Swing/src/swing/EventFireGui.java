package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EventFireGui extends JFrame {
	private static final long serialVersionUID = -711163588504124217L;

	public EventFireGui() {
		super("Swings 테스트중");
		setBounds(0, 0, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		JPanel pane = new JPanel();
		JButton buttonStart = new JButton("Start");
		JTextField textPeroid = new JTextField(5);
		JLabel labelPeriod = new JLabel("Input period: ");
		JCheckBox checkboxIsRandom = new JCheckBox("swing 테스트중");
		
		checkboxIsRandom.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if(((JCheckBox)e.getSource()).isSelected()) {
					textPeroid.setText("Random");
					textPeroid.setEnabled(false);
		}
				else {
					textPeroid.setText("");
					textPeroid.setEnabled(true);
				}
			}
			
		});
		buttonStart.setMnemonic('S');
		
		pane.add(buttonStart);
		
		pane.add(labelPeriod);
		pane.add(textPeroid);
		pane.add(checkboxIsRandom);
		contentPane.add(pane);
		
		
		setVisible(true);
	}

}
