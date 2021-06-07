import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;




public class MyFrame implements ActionListener  {
	
	JFrame frame;
	JTextField textField;
	JButton button;
	
	
	
	
	public MyFrame() {
		
	
		
		frame = new JFrame();
		
		
		button = new JButton("Sumbit");
		button.addActionListener(this);
		
	
		
		
		textField = new JTextField();
		textField.setEditable(true);
		textField.setSelectedTextColor(Color.green);
		textField.setBackground(Color.BLACK);
		textField.setPreferredSize(new Dimension(240,50));
		textField.setFont(new Font("Consolas", Font.PLAIN, 30));
		textField.setForeground(Color.green);
		
		frame.add(button);
		frame.add(textField);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.pack();
		
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == button) {
			
			System.out.println("Welcome "+ textField.getText());
			
		}
		
	}

	
	

}
