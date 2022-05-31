package Practica5;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton_3 = new JButton("Ejercicio d)");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamared();
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(new Color(254, 95, 85));
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton_3.setBounds(515, 264, 151, 50);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Ejercicio b)");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamareb();
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(254, 95, 85));
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton_2.setBounds(515, 175, 151, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Ejercicio c)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarec();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(254, 95, 85));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton_1.setBounds(218, 269, 151, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Ejercicio a)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarea();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(254, 95, 85));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton.setBounds(218, 175, 151, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setFont(new Font("Brush Script MT", Font.PLAIN, 64));
		lblNewLabel.setForeground(new Color(255, 241, 193));
		
		lblNewLabel.setBounds(366, 52, 169, 61);
		
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 922, 435);
		ImageIcon ico=new ImageIcon(getClass().getResource("programacion.png"));
		ImageIcon img =new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel_1.getWidth(),lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_1.setIcon(img);
		contentPane.add(lblNewLabel_1);
		
	}
	void llamarea() {
		dispose();
		EjercicioA obj1=new EjercicioA();
		  obj1.setLocationRelativeTo(null);  
		  obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  obj1.setVisible(true);
	}
	void llamareb() {
		dispose();
		EjercicioB obj1=new EjercicioB();
		  obj1.setLocationRelativeTo(null);  
		  obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  obj1.setVisible(true);
	}
	void llamarec() {
		dispose();
		EjercicioC obj1=new EjercicioC();
		  obj1.setLocationRelativeTo(null);  
		  obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  obj1.setVisible(true);
	}
	void llamared() {
		dispose();
		EjercicioD obj1=new EjercicioD();
		  obj1.setLocationRelativeTo(null);  
		  obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  obj1.setVisible(true);
	}
}
