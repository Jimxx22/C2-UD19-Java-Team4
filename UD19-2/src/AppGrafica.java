import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class AppGrafica {

	public JFrame frame;
	private JTextField txtPeliIn;
	private ArrayList<String> listaPelis;
	private JLabel lbl1;
	private JButton btnAddPeli ;
	private JLabel lbl2 ;
	private JComboBox<String> cBoxPelis;
	private JLabel lblError;
	
		/**
	 * Create the application.
	 */
	public AppGrafica() {
		initialize();
		rellenarPelis(cBoxPelis);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 649, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl1 = new JLabel("Escribe el titulo de una pelicula");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		txtPeliIn = new JTextField();
		txtPeliIn.setColumns(10);
		
		btnAddPeli = new JButton("Añadir");
		
		lbl2 = new JLabel("Peliculas");
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		cBoxPelis = new JComboBox<String>();
		listaPelis=new ArrayList<String>();
		
		listaPelis.add("Avatar");
		
		lblError = new JLabel("");
		lblError.setForeground(Color.RED);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(31)
							.addComponent(lbl1)
							.addGap(97)
							.addComponent(cBoxPelis, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(68)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblError)
								.addComponent(txtPeliIn, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(53, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(453, Short.MAX_VALUE)
					.addComponent(lbl2)
					.addGap(100))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(137)
					.addComponent(btnAddPeli)
					.addContainerGap(433, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(51)
					.addComponent(lbl2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lbl1)
							.addGap(18)
							.addComponent(txtPeliIn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblError)
							.addGap(16)
							.addComponent(btnAddPeli))
						.addComponent(cBoxPelis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		ActionListener a1= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(txtPeliIn.getText().equals("")) {
					lblError.setText("Error: El campo esta vacio.");
				}else {
					listaPelis.add(txtPeliIn.getText());
					rellenarPelis(cBoxPelis);
					txtPeliIn.setText("");
					lblError.setText("");
				}
			}};
		
		btnAddPeli.addActionListener(a1);
		
	}
	
	 public void rellenarPelis(JComboBox<String> cBoxPelis){
         String nombre;
         cBoxPelis.removeAllItems();
         try{
             for(int i = 0; i<listaPelis.size(); i++){
                 nombre = listaPelis.get(i);
                 cBoxPelis.addItem(nombre);
             }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,"Error al cargar ComboBox" + e);
         }
     }
}
