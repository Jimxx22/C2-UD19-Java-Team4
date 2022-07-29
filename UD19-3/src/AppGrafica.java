import java.awt.*;
import java.awt.event.*;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.border.TitledBorder;
public class AppGrafica extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppGrafica frame = new AppGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public AppGrafica() {
		setSize(330, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		JPanel global = new JPanel();
		global.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setBorder(new TitledBorder(null, "Sistema Operativo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		p1.setLayout(new GridLayout(3, 1));
		ButtonGroup btGroup = new ButtonGroup();
		JRadioButton rbWindows = new JRadioButton ("Windows",true);
		rbWindows.setActionCommand("Windows");
		btGroup.add(rbWindows);
		p1.add(rbWindows);
		JRadioButton rbLinux = new JRadioButton ("Linux",false);
		rbLinux.setActionCommand("Linux");
		btGroup.add(rbLinux);
		p1.add(rbLinux);
		JRadioButton rbMac = new JRadioButton ("Mac",false);
		rbMac.setActionCommand("Mac");
		btGroup.add(rbMac);
		p1.add(rbMac);
		global.add(p1,BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		p2.setBorder(new TitledBorder(null, "Especialidad", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		p2.setLayout(new GridLayout(3, 1));
		JCheckBox cbProgramacion = new JCheckBox("Programacion");
		JCheckBox cbDisenoGrafico = new JCheckBox("Diseno grafico");
		JCheckBox cbAdministracion = new JCheckBox("Administracion");
		p2.add(cbProgramacion);
		p2.add(cbDisenoGrafico);
		p2.add(cbAdministracion);
		global.add(p2,BorderLayout.CENTER);
		
		JPanel p3 = new JPanel();
		p3.setBorder(new TitledBorder(null, "Horas PC", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JSlider slHorasPc = new JSlider();
		slHorasPc.setValue(5);
		slHorasPc.setMaximum(10);
		slHorasPc.setPaintTicks(true);
		slHorasPc.setPaintLabels(true);

		Hashtable posicions = new Hashtable();
		posicions.put(0, new JLabel("0"));
		posicions.put(1, new JLabel("1"));
		posicions.put(2, new JLabel("2"));
		posicions.put(3, new JLabel("3"));
		posicions.put(4, new JLabel("4"));
		posicions.put(5, new JLabel("5"));
		posicions.put(6, new JLabel("6"));
		posicions.put(7, new JLabel("7"));
		posicions.put(8, new JLabel("8"));
		posicions.put(9, new JLabel("9"));
		posicions.put(10, new JLabel("10"));
		slHorasPc.setLabelTable(posicions);
		
		JButton btnEnviar = new JButton("Enviar");
		p3.add(slHorasPc);
		global.add(p3,BorderLayout.SOUTH);
		cp.add(btnEnviar,BorderLayout.SOUTH);
		cp.add(global,BorderLayout.CENTER);
		
		ActionListener a1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String radioValue = btGroup.getSelection().getActionCommand();
				String checkValue = " ";
				if(cbProgramacion.isSelected()) {
					 checkValue += cbProgramacion.getName() + " ";
				}
				if(cbDisenoGrafico.isSelected()) {
					checkValue += cbDisenoGrafico.getName() + " ";
				}
				if(cbAdministracion.isSelected()) {
					checkValue += cbAdministracion.getName() + " ";
				}
				String msg = "Sistema Operativo:" + radioValue 
						+ "\nEspecialidad:" + checkValue 
						+ "\nHoras:" + slHorasPc.getValue() ;
				JOptionPane.showMessageDialog(null, msg);
			}
				
		};
		btnEnviar.addActionListener(a1);
	}
	

}
