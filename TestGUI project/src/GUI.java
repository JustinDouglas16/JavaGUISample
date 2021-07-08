import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener 
{
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI()
	{
		frame = new JFrame(); // use this to make a frame then import it 
		
		JButton button = new JButton("Click Me!"); // use this to add a button then import it 
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks: 0"); // use this to add a label then import it 
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button); // add the button to the panel
		panel.add(label);  // add the label to the panel 
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
	}

}
