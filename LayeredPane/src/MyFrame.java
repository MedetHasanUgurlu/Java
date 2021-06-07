import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MyFrame {
	
	public MyFrame() {
		
		JFrame frame = new JFrame();
		
		JLabel label = new JLabel();
		label.setOpaque(true);
		label.setBounds(0, 0, 120, 120);
		label.setBackground(Color.red);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBounds(90, 90, 120, 120);
		label2.setBackground(Color.green);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBounds(180, 180, 120, 120);
		label3.setBackground(Color.blue);
		
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		layeredPane.add(label,JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(label2,JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(label3,JLayeredPane.DEFAULT_LAYER);
		
		

		
		frame.add(layeredPane);

		
		
		
		frame.setSize(new Dimension(900,900));
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
	}

}
