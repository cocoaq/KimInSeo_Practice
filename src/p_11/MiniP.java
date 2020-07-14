package p_11;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MiniP extends JFrame{
	JButton but = new JButton("누르기");
	JTextArea ta = new JTextArea(10, 5);
	JFrame mf = new JFrame();
	
	public void text() {
		mf.setBounds(200, 200, 500, 300);
		mf.setLayout(new BorderLayout()); 

		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append("버튼이 눌렸습니다.\n");
			}
		});
		
		ta.setEditable(false);

		mf.add(but, "North");
		mf.add(ta, "Center");
		
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setVisible(true);
		mf.setResizable(false);
	}

}
