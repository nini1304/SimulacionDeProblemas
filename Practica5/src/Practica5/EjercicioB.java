
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

public class EjercicioB extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_8;
	
	private JTextArea textArea;
	private JTextField textField_2;
	private double Nmax, pArtC, CFijo, pVenta; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioB frame = new EjercicioB();
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
	public EjercicioB() {
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
		scrollPane.setBounds(459, 109, 427, 276);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField_2 = new JTextField();
		textField_2.setBounds(313, 342, 103, 29);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Precio de Venta Articulo");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 337, 277, 29);
		contentPane.add(lblNewLabel_3);
		
		textField_8 = new JTextField();
		textField_8.setBounds(313, 109, 103, 29);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Numero Maximo Horas");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_8.setBounds(10, 104, 247, 30);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_2 = new JLabel("Costo Fijo");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 257, 247, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Precio de Compra Articulo");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 182, 288, 35);
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
				Nmax=Double.parseDouble(textField_8.getText());
				pArtC=Double.parseDouble(textField.getText());
				CFijo=Double.parseDouble(textField_1.getText());
				pVenta=Double.parseDouble(textField_2.getText());
				double CNmax=0,TArtC=0,CCli=0,c=0,LleCli=0, ArtC=0, GNeta=0;
				float Rllecli=0,Rartc=0;
				String tabla="  CNmax\t|\tRllecli\t|\tLleCli\t|\tCCli\t|\tRartc\t|\tArtC\t|\tTArtC\t|\tGNeta\n";
				tabla+="======================================================================================================="
						+ "==================================================================================================="
						+ "=============\n";
				int ls=0,li=0;
				
				for(c=1;c<=Nmax;c++) {
					CNmax=CNmax+1;
					if(CNmax!=Nmax) {
						Rllecli=(float)(Math.random()*(ls-li+1)+li);
						LleCli=Math.round(4*Rllecli);
						Rartc=(float)(Math.random()*(ls-li+1)+li);
						if(LleCli!=0) {
							CCli=CCli+1;
							if((Rartc>=0)&&(Rartc<=0.2)) {
								if(CCli==LleCli) {
									CCli=0;
								}
							}
							else {
								if((Rartc>0.2)&&(Rartc<=0.5)) {
									ArtC=1;
									TArtC=TArtC+ArtC;
								}
								else {
									if((Rartc>0.5)&&(Rartc<=0.9)) {
										ArtC=2;
										TArtC=TArtC+ArtC;
									}
									else {
										ArtC=3;
										TArtC=TArtC+ArtC;
									}
								}
							}
						}
					}
					else {
						GNeta=TArtC*(pVenta-pArtC)-CFijo;
					}
					tabla+="  "+CNmax+"\t|\t"+formato1.format(Rllecli)+"\t|\t"+LleCli+"\t|\t"+CCli+"\t|\t"+formato1.format(Rartc)+"\t|\t"+
							ArtC+"\t|\t"+TArtC+"\t|\t"+GNeta+"\n";
					tabla+="---------------------------------------------------------------------------------------------------"
					+"----------------------------------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------------------------------"
					+ "------------------------------------------------------------------------------\n";
					
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
		textField_1.setBounds(313, 264, 103, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(313, 189, 103, 30);
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