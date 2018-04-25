package vista;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import controlador.ControladorApp;


import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Insets;
import javax.swing.JSeparator;

public class VistaPrincipal extends JFrame{
	private JScrollPane scrollPane;
	private JMenu mnMenuAlumnos;
	private JMenuItem mntConsultaAl;
	private JMenuBar menuBar;
	private JMenuItem mntmAadirAl;
	private JMenuItem mntmEliminar;
	private JMenu mnCiclos;
	private JSeparator separator;
	private JMenu mnProyectos;
	private JSeparator separator_1;
	private JMenuItem mntConsultaPro;
	private JMenuItem mntAadirPro;
	private JMenuItem mntEliminarPro;
	private JMenuItem mntConsultarCi;
	private JMenuItem mntAadirCi;
	private JMenuItem mntEliminarCi;
	private JSeparator separator_2;
	private JMenu mnMenuRegistrar;
	private JMenuItem mntRegistrarProfesor;
	
	public VistaPrincipal() {
		inicializar();
	}
	
	private void inicializar() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		getContentPane().setLayout(null);	
		setBounds(0,0,700,700);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 700, 700);
		getContentPane().add(scrollPane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		menuBar.setAutoscrolls(true);
		menuBar.setMargin(new Insets(0, 5, 0, 5));
		menuBar.setBorder(null);
		menuBar.setBackground(new Color(0, 153, 255));
		menuBar.setForeground(new Color(51, 102, 204));
		setJMenuBar(menuBar);
		
		mnMenuAlumnos = new JMenu("Alumnos");
		mnMenuAlumnos.setBackground(new Color(0, 0, 204));
		mnMenuAlumnos.setForeground(Color.WHITE);
		mnMenuAlumnos.setFont(new Font("Segoe UI", Font.BOLD, 22));
		menuBar.add(mnMenuAlumnos);
		
		mntConsultaAl = new JMenuItem("Consulta");
		mntConsultaAl.setBorder(null);
		mntConsultaAl.setForeground(Color.WHITE);
		mntConsultaAl.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntConsultaAl.setBackground(new Color(0, 153, 255));
		mnMenuAlumnos.add(mntConsultaAl);
		
		mntmAadirAl = new JMenuItem("A\u00F1adir");
		mntmAadirAl.setBorderPainted(true);
		mntmAadirAl.setBorder(null);
		mntmAadirAl.setForeground(Color.WHITE);
		mntmAadirAl.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mntmAadirAl.setBackground(new Color(0, 153, 255));
		mnMenuAlumnos.add(mntmAadirAl);
		
		mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.setForeground(Color.WHITE);
		mntmEliminar.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmEliminar.setBorder(null);
		mntmEliminar.setBackground(new Color(0, 153, 255));
		mnMenuAlumnos.add(mntmEliminar);
		
		separator = new JSeparator();
		separator.setBorder(null);
		menuBar.add(separator);
		
		mnProyectos = new JMenu("Proyectos");
		mnProyectos.setFont(new Font("Segoe UI", Font.BOLD, 22));
		mnProyectos.setForeground(Color.WHITE);
		mnProyectos.setBackground(new Color(0, 0, 204));
		menuBar.add(mnProyectos);
		
		mntConsultaPro = new JMenuItem("Consultar");
		mntConsultaPro.setForeground(Color.WHITE);
		mntConsultaPro.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mntConsultaPro.setBackground(new Color(0, 153, 255));
		mnProyectos.add(mntConsultaPro);
		
		mntAadirPro = new JMenuItem("A\u00F1adir");
		mntAadirPro.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mntAadirPro.setForeground(Color.WHITE);
		mntAadirPro.setBackground(new Color(0, 153, 255));
		mnProyectos.add(mntAadirPro);
		
		mntEliminarPro = new JMenuItem("Eliminar");
		mntEliminarPro.setForeground(Color.WHITE);
		mntEliminarPro.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mntEliminarPro.setBackground(new Color(0, 153, 255));
		mnProyectos.add(mntEliminarPro);
		
		separator_1 = new JSeparator();
		menuBar.add(separator_1);
		
		mnCiclos = new JMenu("Ciclos");
		mnCiclos.setBackground(new Color(0, 0, 204));
		mnCiclos.setForeground(Color.WHITE);
		mnCiclos.setFont(new Font("Segoe UI", Font.BOLD, 22));
		menuBar.add(mnCiclos);
		
		mntConsultarCi = new JMenuItem("Consultar");
		mntConsultarCi.setBackground(new Color(0, 153, 255));
		mntConsultarCi.setForeground(Color.WHITE);
		mntConsultarCi.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnCiclos.add(mntConsultarCi);
		
		mntAadirCi = new JMenuItem("A\u00F1adir");
		mntAadirCi.setBackground(new Color(0, 153, 255));
		mntAadirCi.setForeground(Color.WHITE);
		mntAadirCi.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnCiclos.add(mntAadirCi);
		
		mntEliminarCi = new JMenuItem("Eliminar");
		mntEliminarCi.setBackground(new Color(0, 153, 255));
		mntEliminarCi.setForeground(Color.WHITE);
		mntEliminarCi.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnCiclos.add(mntEliminarCi);
		
		separator_2 = new JSeparator();
		menuBar.add(separator_2);
		
		mnMenuRegistrar = new JMenu("Registrar");
		mnMenuRegistrar.setBackground(new Color(0, 0, 204));
		mnMenuRegistrar.setForeground(Color.WHITE);
		mnMenuRegistrar.setFont(new Font("Segoe UI", Font.BOLD, 22));
		menuBar.add(mnMenuRegistrar);
		
		mntRegistrarProfesor = new JMenuItem("Registrar Profesor");
		mntRegistrarProfesor.setBackground(new Color(0, 153, 255));
		mntRegistrarProfesor.setForeground(Color.WHITE);
		mntRegistrarProfesor.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnMenuRegistrar.add(mntRegistrarProfesor);
	}
	
	public void permisosProfesor(boolean permitir) {
		
		if(permitir) {
			mntmAadirAl.setEnabled(true);
			mntmEliminar.setEnabled(true);
			mntAadirPro.setEnabled(true);
			mntEliminarPro.setEnabled(true);
			mntAadirCi.setEnabled(true);
			mntEliminarCi.setEnabled(true);
			mntRegistrarProfesor.setEnabled(true);
		}
		else {
			mntmAadirAl.setEnabled(false);
			mntmEliminar.setEnabled(false);
			mntAadirPro.setEnabled(false);
			mntEliminarPro.setEnabled(false);
			mntAadirCi.setEnabled(false);
			mntEliminarCi.setEnabled(false);
			mntRegistrarProfesor.setEnabled(false);
		}
		
	}
	
	public void setControlador(ControladorApp c) {		//Deberemos presentarle todos los botones al controlador
		mntConsultaAl.addActionListener(c);
		mntmAadirAl.addActionListener(c);
		mntmEliminar.addActionListener(c);
		mntConsultaPro.addActionListener(c);
		mntAadirPro.addActionListener(c);
		mntEliminarPro.addActionListener(c);
		mntConsultarCi.addActionListener(c);
		mntAadirCi.addActionListener(c);
		mntEliminarCi.addActionListener(c);
		mntRegistrarProfesor.addActionListener(c);
	}
	
	
	
	public JMenuItem getMntRegistrarProfesor() {
		return mntRegistrarProfesor;
	}

	public JMenuItem getMntConsultarCi() {
		return mntConsultarCi;
	}

	public JMenuItem getMntAadirCi() {
		return mntAadirCi;
	}

	public JMenuItem getMntEliminarCi() {
		return mntEliminarCi;
	}

	public JMenuItem getMntConsultaPro() {
		return mntConsultaPro;
	}

	public JMenuItem getMntAadirPro() {
		return mntAadirPro;
	}

	public JMenuItem getMntEliminarPro() {
		return mntEliminarPro;
	}

	public JMenuItem getMntConsultaAl() {
		return mntConsultaAl;
	}

	public JMenuItem getMntmAadirAl() {
		return mntmAadirAl;
	}
	
	
	public JMenuItem getMntmEliminar() {
		return mntmEliminar;
	}

	public void setPanel(JPanel panel) {			
		scrollPane.setViewportView(panel);
	}
	
	public void hacerMenuVisible(boolean si) {
		menuBar.setVisible(si);
	}
	
	
	public void hacerVisible() {
		this.setVisible(true);
		setLocationRelativeTo(null);
		menuBar.setVisible(false);

	}
}
