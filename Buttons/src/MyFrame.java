import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame  {
	
	JButton button;
	
	public MyFrame() {
		
		button = new JButton();
		ImageIcon ıcon = new ImageIcon("0c69d985a2488965a170b4fbc546ef14.jpg");
		
		
		button.setBounds(0	, 00, 300, 300); // determine size of button
		button.addActionListener(e -> System.out.println("Button Clicked."));
		button.setText("Button");
		button.setFocusable(false);
		button.setIcon(ıcon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.CENTER);
		button.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(45), new Color(123231)));
		
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		this.add(button);
		
		
		
	
	}
/*
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			System.out.println("Button clicked");
			
		}*/
		
		
		
		
	}


