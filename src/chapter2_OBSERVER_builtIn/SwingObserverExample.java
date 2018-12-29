/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2_OBSERVER_builtIn;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Cube
 */
public class SwingObserverExample {

	JFrame frame;

	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Should I do it ?");
		button.setSize(50, 50);
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		// Set frame properties here
		frame.setVisible(true);
		frame.setSize(300, 300);
	}

	class AngelListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			System.out.println("Don’t do it , you might regret it!");
		}
	}

	class DevilListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
}
