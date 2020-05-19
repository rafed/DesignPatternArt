package main;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.*;
import scenery.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	public static final int WIDTH = 700;
	public static final int HEIGHT = 347;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setBounds(150, 150, 700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmAsia = new JMenuItem("Asia");
		mntmAsia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JPanel panel = new JPanel(){
					public void paintComponent(Graphics g){
						super.paintComponent(g);
						
						new AsiaScenery().draw(g);
					}
				};
				
				getContentPane().removeAll();
				getContentPane().setLayout(new CardLayout());
				getContentPane().add(panel);
				getContentPane().revalidate();
			}
		});
		mnMenu.add(mntmAsia);
		
		JMenuItem mntmAfrica = new JMenuItem("Africa");
		mntmAfrica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new JPanel(){
					public void paintComponent(Graphics g){
						super.paintComponent(g);
						
						new AfricaScenery().draw(g);
					}
				};
				
				getContentPane().removeAll();
				getContentPane().setLayout(new CardLayout());
				getContentPane().add(panel);
				getContentPane().revalidate();
			}
		});
		mnMenu.add(mntmAfrica);
		
		JMenuItem mntmAmerica = new JMenuItem("America");
		mntmAmerica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new JPanel(){
					public void paintComponent(Graphics g){
						super.paintComponent(g);
						
						new AmericaScenery().draw(g);
					}
				};
				
				getContentPane().removeAll();
				getContentPane().setLayout(new CardLayout());
				getContentPane().add(panel);
				getContentPane().revalidate();
			}
		});
		mnMenu.add(mntmAmerica);
		getContentPane().setLayout(null);
		
	}
}
