import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class MyFrame {
	
	public MyFrame() {

		JFrame frame = new JFrame();
		
		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		
		
		panel.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.blue);
		panel4.setBackground(Color.green);
		panel5.setBackground(Color.pink);
		
		panel.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		panel5.setLayout(new BorderLayout(5,5));
		panel6.setBackground(Color.ORANGE.darker());
		panel7.setBackground(Color.MAGENTA.darker());
		panel8.setBackground(Color.lightGray.brighter());
		panel9.setBackground(Color.BLACK.brighter());
		panel10.setBackground(Color.ORANGE.brighter());
		
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
		
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.WEST);
		panel5.add(panel9,BorderLayout.EAST);
		panel5.add(panel10,BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 700);
		
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(10,10));
		
		
		
		
		frame.add(panel,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.SOUTH);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.WEST);
		frame.add(panel5,BorderLayout.CENTER);
	
		
		
		
	}
	

}
