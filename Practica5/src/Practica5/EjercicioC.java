package Practica5;

import java.awt.BorderLayout;
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
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class EjercicioC extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_8;
	private int PVH,PVP, Nmax;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioC frame = new EjercicioC();
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
	public EjercicioC() {
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(456, 105, 432, 281);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField_8 = new JTextField();
		textField_8.setBounds(313, 137, 103, 29);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Precio de venta huevo");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_8.setBounds(10, 132, 280, 30);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_2 = new JLabel("Numero maximo dias");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 300, 247, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Precio de venta pollo");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 214, 247, 35);
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
				DecimalFormat formato1=new DecimalFormat("0.0000");
				DecimalFormat formato2=new DecimalFormat("0.00");
				String tabla="  CNmax\t|\tRnhg\t|\tNHG\t|\tCHUE\t|\tRaeh\t|\tNHUE\t|\tRaep\t|\tNPS\t|\tNHR\t|\tINGP\n";
				tabla+="======================================================================================================="
						+ "==================================================================================================="
						+ "=====================================\n";
				PVH=Integer.parseInt(textField_8.getText());
				PVP=Integer.parseInt(textField.getText());
				Nmax=Integer.parseInt(textField_1.getText());
				int CNmax=0,NHUE=0,NPS=0,NHR=0,NPM=0,CHUE=0,c=0,NHG=0,IB=0,INGP=0;
				float Rnhg=0,Raeh=0,Raep=0;
				int ls=0,li=0;
				for(c=1;c<=Nmax;c++) {
					Raep=(float)(Math.random()*(ls-li+1)+li);
					Raeh=(float)(Math.random()*(ls-li+1)+li);
					CNmax=CNmax+1;
					if(CNmax!=Nmax) {
						Rnhg=(float)(Math.random()*(ls-li+1)+li);
						if((Rnhg>=0)&&(Rnhg<=0.135)) {
							NHG=0;
						}
							if((Rnhg>0.135)&&(Rnhg<=0.406)) {
								NHG=1;
							}
								if((Rnhg>0.406)&&(0<=0.677)) {
									NHG=2;
								}
									if((Rnhg>0.677)&&(Rnhg<=0.857)) {
										NHG=3;
									}
										if((Rnhg>0.857)&&(Rnhg<=0.947)) {
											NHG=4;
										}
											if((Rnhg>0.947)&&(Rnhg<=0.983)) {
												NHG=5;
											}
												if((Rnhg>0.983)&&(Rnhg<=0.995)) {
													NHG=6;
												}
													if((Rnhg>0.995)&&(Rnhg<=0.998)) {
														NHG=7;
													}
														if((Rnhg>0.998)&&(Rnhg<=1)) {
															NHG=8;
														}
						CHUE=CHUE+1;
						if((Raeh>0)&&(Raeh<=0.2)) {
							NHR=NHR+1;
						}
						else {
							if((Raeh>0.2)&&(Raeh<=0.5)) {
								NHUE=NHUE+1;
							}
							NPS=NPS+1;
						}
						if(CHUE==NHG) {
							CHUE=0;
						}
					}
					else {
						IB=NHUE*PVH+NPS*PVP;
						INGP=IB/Nmax;
					}
					tabla+="  "+CNmax+"\t|\t"+formato1.format(Rnhg)+"\t|\t"+NHG+"\t|\t"+CHUE+"\t|\t"+formato1.format(Raeh)+"\t|\t"+
							NHUE+"\t|\t"+formato1.format(Raep)+"\t|\t"+NPS+"\t|\t"+NHR+"\t|\t"+INGP+"\n";
							tabla+="---------------------------------------------------------------------------------------------------"
							+"----------------------------------------------------------------------------------------------------"
							+ "---------------------------------------------------------------------------------------------------"
							+ "-------------------------------------------------------------------------------------------------------"
							+ "--------------\n";
					
					
				}
				
				textArea.setText(tabla);
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(254, 95, 85));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 24));
		btnNewButton.setBounds(475, 51, 133, 34);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(313, 305, 103, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(313, 221, 103, 30);
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