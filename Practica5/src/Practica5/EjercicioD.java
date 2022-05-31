package Practica5;

import java.awt.BorderLayout;
import java.util.Random;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class EjercicioD extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField textField_6;
	private JTextField textField_8;
	private int id,te,h;
	private double cb,cup,clli,cua,puv,da;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioD frame = new EjercicioD();
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
	public EjercicioD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 936, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setBounds(0, 0, 922, 435);
		ImageIcon ico=new ImageIcon(getClass().getResource("programacion.png"));
		ImageIcon img =new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(426, 120, 459, 282);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField_8 = new JTextField();
		textField_8.setBounds(313, 35, 103, 29);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(313, 338, 103, 32);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Horizonte");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(10, 330, 192, 34);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_8 = new JLabel("Intervalo dias revision");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_8.setBounds(10, 35, 247, 30);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_6 = new JLabel("Precio venta unitario");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 297, 284, 23);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_5 = new JLabel("Costo unitario adquisicion");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(10, 255, 294, 25);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_4 = new JLabel("Costo llevar inventario");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(10, 215, 294, 30);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_3 = new JLabel("Costo unitario pedido");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 165, 294, 35);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_2 = new JLabel("Tiempo entrega");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 120, 247, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Capacidad de bodega");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 75, 247, 35);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamarmenu();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(254, 95, 85));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton_1.setBounds(662, 51, 133, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Analizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id=Integer.parseInt(textField_8.getText());
				te=Integer.parseInt(textField_1.getText());
				h=Integer.parseInt(textField_6.getText());
				cb=Double.parseDouble(textField.getText());
				cup=Double.parseDouble(textField_2.getText());
				clli=Double.parseDouble(textField_3.getText());
				cua=Double.parseDouble(textField_4.getText());
				puv=Double.parseDouble(textField_5.getText());
				
				double pa=0,ca=cb,tca=ca*cua,tcp=cup,rda,tcm=0,ib=0,tc,gn,di=0;
				int rte=0;
				for(int ch=1;ch<=h;ch++) {
					
					if(ch%id==0) {
						pa=(cb-ca);
						tca=tca+(pa*cua);
						tcp=tcp+cup;
						rte=(int) Math.floor(Math.random()*(te-1+1)+1);
						
						
					}else {
						if(rte==0) {
							rda=Math.floor(Math.random()*(100-1+1)+1);
							if(ca>=rda) {
								ca=ca-rda;
								tcm=tcm+(ca*clli);
								ib=ib+(rda*puv);
								}else {
									di=di+(rda-ca);
									ib=ib+(rda*puv);
									ca=0;
								
							}
						}else {
							rte=rte-1;
							if(rte==0) {
								ca=ca+pa;
								rda=Math.floor(Math.random()*(100-1+1)+1);
								if(ca>=rda) {
									ca=ca-rda;
									tcm=tcm+(ca*clli);
									ib=ib+(rda*puv);
									}else {
										di=di+(rda-ca);
										ib=ib+(rda*puv);
										ca=0;
									
								}
								
							}
							else {
								rda=Math.floor(Math.random()*(100-1+1)+1);
								if(ca>=rda) {
									ca=ca-rda;
									tcm=tcm+(ca*clli);
									ib=ib+(rda*puv);
									}else {
										di=di+(rda-ca);
										ib=ib+(rda*puv);
										ca=0;
									
								}
								
							}
							
						}
					}
				}
				tc=tcm+tcp+tca;
				gn=ib-tc;
				String tabla= "Costo Total\t|\tGanancia Neta\t|\tDemanda Insatisfecha\n";
				tabla+=tc+"\t|\t"+gn+"\t|\t"+di;
				textArea.setText(tabla);
				
				
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(254, 95, 85));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton.setBounds(475, 51, 133, 34);
		contentPane.add(btnNewButton);
		
		textField_5 = new JTextField();
		textField_5.setBounds(313, 298, 103, 30);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(313, 257, 103, 30);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(314, 215, 103, 30);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(313, 165, 103, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(313, 120, 103, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(313, 75, 103, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_7 = new JLabel("Intervalo dias de revision");
		lblNewLabel_7.setBounds(10, 24, 45, 13);
		contentPane.add(lblNewLabel_7);
	}
	
	void llamarmenu() {
		dispose();
		Menu obj1=new Menu();
		  obj1.setLocationRelativeTo(null);  
		  obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  obj1.setVisible(true);
	}
}
