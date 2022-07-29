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
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(sumaButton)
												.addComponent(multButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
											.addGap(57)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(divideButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
												.addComponent(restaButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
											.addGap(156))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(exitButton)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(num2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
													.addComponent(result, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addComponent(lblerror2, Alignment.LEADING))
											.addGap(51))))))))
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
						.addComponent(restaButton)
						.addComponent(sumaButton))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(multButton)
						.addComponent(divideButton))
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(aboutButton)
						.addComponent(exitButton))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
