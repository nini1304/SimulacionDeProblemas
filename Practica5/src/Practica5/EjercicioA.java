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
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class EjercicioA extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_8;
	private double Cjue,Gjug;
	private int Nmax;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioA frame = new EjercicioA();
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
	public EjercicioA() {
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
		scrollPane.setBounds(440, 114, 458, 279);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField_8 = new JTextField();
		textField_8.setBounds(313, 153, 103, 29);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Costo del juego");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_8.setBounds(10, 148, 247, 30);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_2 = new JLabel("Numero de Juegos");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 309, 277, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Ganancia del jugador");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 233, 247, 35);
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
				String tabla="  CNmax\t|\tRdado1\t|\tRdado2\t|\tDado1\t|\tDado2\t|\tSdado\t|\tGNeta\t|\tNJueC\t|\tPJueC\n";
				tabla+="======================================================================================================="
						+ "==================================================================================================="
						+ "=============\n";
				Nmax=Integer.parseInt(textField_1.getText());
				Cjue=Double.parseDouble(textField_8.getText());
				Gjug=Double.parseDouble(textField.getText());
				int CNmax=0,NJueC=0, Dado1=0, Dado2=0,Sdado=0,c=0;
				double GNeta=0;
				float Rdado1=0,Rdado2=0,PJueC=0;
				int ls=0,li=0;
				for(c=1;c<=Nmax;c++) {
					CNmax=CNmax+1;
					if(CNmax!=Nmax) {
						Rdado1=(float)(Math.random()*(ls-li+1)+li);
						Rdado2=(float)(Math.random()*(ls-li+1)+li);
						Dado1=Math.round(1+(6-1)*Rdado1);
						Dado2=Math.round(1+(6-1)*Rdado2);
						Sdado=Dado1+Dado2;
						if(Sdado==7) {
							GNeta=GNeta+Cjue-Gjug;
						}
						else {
							GNeta=GNeta+Cjue;
							NJueC=NJueC+1;
						}
					}
					else {
						PJueC=(NJueC*100)/Nmax;
					}
					tabla+="  "+CNmax+"\t|\t"+formato1.format(Rdado1)+"\t|\t"+formato1.format(Rdado2)+"\t|\t"+Dado1+"\t|\t"+Dado2+"\t|\t"+
							Sdado+"\t|\t"+GNeta+"\t|\t"+NJueC+"\t|\t"+PJueC+"%\n";
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
		textField_1.setBounds(313, 316, 103, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(313, 240, 103, 30);
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
