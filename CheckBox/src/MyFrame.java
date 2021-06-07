import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame implements ActionListener {
	
	JFrame frame;
	JCheckBox checkBox;
	JButton button;
	JTextField textField;
	JLabel label;
	

	public MyFrame() {
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("I'm not a robot");
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(40,320));
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("........");
		
	
		
		frame.add(textField);
		frame.add(checkBox);
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
