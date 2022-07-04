package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.SqlreservarHora;
import modelo.reservarHora;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registroPet extends JFrame {

	private JPanel contentPane;
	private JTextField txtrutDueño;
	private JTextField txtnombreMascota;
	private JTextField txthora;
	private JTextField txtfecha;
	private JTextField txtRegistraTuMascota;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registroPet frame = new registroPet();
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
	public registroPet() {
		setFont(new Font("Dialog", Font.BOLD, 16));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtrutDueño = new JTextField();
		txtrutDueño.setBounds(193, 57, 156, 24);
		contentPane.add(txtrutDueño);
		txtrutDueño.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("rut dueño:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 54, 125, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("nombre Mascota:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 88, 139, 33);
		contentPane.add(lblNewLabel_1);
		
		txtnombreMascota = new JTextField();
		txtnombreMascota.setBounds(193, 95, 156, 24);
		contentPane.add(txtnombreMascota);
		txtnombreMascota.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hora:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 131, 139, 24);
		contentPane.add(lblNewLabel_2);
		
		txthora = new JTextField();
		txthora.setBounds(193, 135, 156, 21);
		contentPane.add(txthora);
		txthora.setColumns(10);
		
		JButton btnRegistrar = new JButton("registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SqlreservarHora modSql = new SqlreservarHora();
				reservarHora mod = new reservarHora();
				
				mod.setRutDueño(txtrutDueño.getText());
				mod.setNombreMascota(txtnombreMascota.getText());
				mod.setFecha(txtfecha.getText());
				mod.setHora(txthora.getText());
				
				if(modSql.registrar(mod)) {
					
					JOptionPane.showMessageDialog(null, "registro guardado");
					
				}else {
						
					
					JOptionPane.showMessageDialog(null, "error al guardar");
				}
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRegistrar.setBounds(153, 211, 125, 42);
		contentPane.add(btnRegistrar);
		
		JLabel lblNewLabel_3 = new JLabel("fecha:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 165, 139, 33);
		contentPane.add(lblNewLabel_3);
		
		txtfecha = new JTextField();
		txtfecha.setBounds(193, 174, 156, 27);
		contentPane.add(txtfecha);
		txtfecha.setColumns(10);
		
		txtRegistraTuMascota = new JTextField();
		txtRegistraTuMascota.setHorizontalAlignment(SwingConstants.CENTER);
		txtRegistraTuMascota.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtRegistraTuMascota.setText("Registra tu mascota");
		txtRegistraTuMascota.setBounds(115, 10, 190, 34);
		contentPane.add(txtRegistraTuMascota);
		txtRegistraTuMascota.setColumns(10);
	}
}
