package com;

import java.awt.event.*;
import javax.swing.*;

public class JSwing_WordsCounter implements ActionListener{
	JLabel l1, l2;
	JButton b1;
	JTextArea area;
			
		JSwing_WordsCounter(){
			JFrame frame = new JFrame();
				
			l1 = new JLabel();
			l1.setBounds(100, 25, 100, 30);
			l2 = new JLabel();
			l2.setBounds(300, 25, 100, 30);
				
			area = new JTextArea();
			area.setBounds(100, 100, 250, 200);
				
			b1 = new JButton("count word");
			b1.setBounds(180, 400, 100, 40);
				
			b1.addActionListener(this);
			frame.add(l1); frame.add(l2); frame.add(area); frame.add(b1);
				
			frame.setSize(500, 500);
			frame.setLayout(null);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		}
		public void actionPerformed(ActionEvent e) {
			String text = area.getText();
			String[] word = text.split("\\s");
			l1.setText("words: "+ word.length);
			l2.setText("characters: "+ text.length());
				
		}

		public static void main(String[] args) {
//			TODO Erstellung einer TextArea, die Anzahl der Wörter und
//			Anzahl der Karakters zurückgibt.
			new JSwing_WordsCounter();
		}
	}
