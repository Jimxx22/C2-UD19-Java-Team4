import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class AppGrafica {

	public JFrame frame;
	private JTextField num1;
	private JTextField num2;
	private JTextField result;

	/**
	 * Create the application.
	 */
	public AppGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		num1 = new JTextField();
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setColumns(10);
		
		result = new JTextField();
		result.setEditable(false);
		result.setColumns(10);
		JLabel lblerror1 = new JLabel("");
		lblerror1.setForeground(Color.RED);
		
		JLabel lblerror2 = new JLabel("");
		lblerror2.setForeground(Color.RED);
		
		JLabel lblHist1 = new JLabel("");
		
		JLabel lblHist2 = new JLabel("");
		
		JLabel lblHist3 = new JLabel("");
		
		JLabel lblHist4 = new JLabel("");
		
		JButton sumaButton = new JButton("+");
		sumaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(num1.getText().equals("")) {
					lblerror1.setText("*Campo vacio");
					lblerror2.setText("");
				}else if (num2.getText().equals("")) {
					lblerror2.setText("*Campo vacio");
					lblerror1.setText("");
				}else {
					int operation = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
					result.setText(Integer.toString(operation));
					lblerror1.setText("");
					lblerror2.setText("");
					lblHist4.setText(lblHist3.getText());
					lblHist3.setText(lblHist2.getText());
					lblHist2.setText(lblHist1.getText());
					lblHist1.setText(result.getText());
				}
				
			}
		});
		
		JButton restaButton = new JButton("-");
		restaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1.getText().equals("")) {
					lblerror1.setText("*Campo vacio");
					lblerror2.setText("");
				}else if (num2.getText().equals("")) {
					lblerror2.setText("*Campo vacio");
					lblerror1.setText("");
				}else {
					int operation = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
					result.setText(Integer.toString(operation));
					lblerror1.setText("");
					lblerror2.setText("");
					lblHist4.setText(lblHist3.getText());
					lblHist3.setText(lblHist2.getText());
					lblHist2.setText(lblHist1.getText());
					lblHist1.setText(result.getText());
				}
			}
		});
		
		JButton multButton = new JButton("x");
		multButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1.getText().equals("")) {
					lblerror1.setText("*Campo vacio");
					lblerror2.setText("");
				}else if (num2.getText().equals("")) {
					lblerror2.setText("*Campo vacio");
					lblerror1.setText("");
				}else {
					int operation = Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText());
					result.setText(Integer.toString(operation));
					lblerror1.setText("");
					lblerror2.setText("");
					lblHist4.setText(lblHist3.getText());
					lblHist3.setText(lblHist2.getText());
					lblHist2.setText(lblHist1.getText());
					lblHist1.setText(result.getText());
				}
			}
		});
		
		JButton divideButton = new JButton("/");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(num1.getText().equals("")) {
					lblerror1.setText("*Campo vacio");
					lblerror2.setText("");
				}else if (num2.getText().equals("")) {
					lblerror2.setText("*Campo vacio");
					lblerror1.setText("");
				}else if(num2.getText().equals("0")){
					lblerror2.setText("*No puede ser 0");
					lblerror1.setText("");
				}else {
					int operation = Integer.parseInt(num1.getText()) / Integer.parseInt(num2.getText());
					result.setText(Integer.toString(operation));
					lblerror1.setText("");
					lblerror2.setText("");
					lblHist4.setText(lblHist3.getText());
					lblHist3.setText(lblHist2.getText());
					lblHist2.setText(lblHist1.getText());
					lblHist1.setText(result.getText());
				}
			}
		});
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton aboutButton = new JButton("About");
		aboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sobre nosotros");

			}
		});
		
		JLabel lblNewLabel = new JLabel("Numero 1");
		
		JLabel lblNumero = new JLabel("Numero 2");
		
		JLabel lblResultado = new JLabel("Resultado");
		
		JLabel lblHistorial = new JLabel("Historial");
		lblHistorial.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHistorial.setForeground(new Color(0, 0, 0));		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblerror1)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(17)
								.addComponent(lblNewLabel)
								.addGap(54)
								.addComponent(lblNumero)
								.addGap(106)
								.addComponent(lblResultado)
								.addGap(76))
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(aboutButton, Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(num1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(exitButton)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(num2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
											.addComponent(result, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblerror2, Alignment.LEADING))
									.addGap(51))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(sumaButton)
											.addGap(18)
											.addComponent(restaButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(multButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(divideButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
									.addGap(79)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblHist2)
										.addComponent(lblHist1)
										.addComponent(lblHistorial)
										.addComponent(lblHist3)
										.addComponent(lblHist4))
									.addGap(168))))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumero)
						.addComponent(lblNewLabel)
						.addComponent(lblResultado))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(num1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(num2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(result, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblerror1)
						.addComponent(lblerror2))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(sumaButton)
						.addComponent(restaButton)
						.addComponent(lblHistorial))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblHist1)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(multButton)
								.addComponent(divideButton))
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(aboutButton)
								.addComponent(exitButton)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblHist2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblHist3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblHist4)))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
