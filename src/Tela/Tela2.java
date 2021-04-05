package Tela;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Font;
import java.awt.Color;
import com.toedter.calendar.JCalendar;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Checkbox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Tela2 {

	private JFrame frame;
	private JTextField cadastro;
	private JTextField ponto;
	private JTextField acesso;
	private JTextField cartao;
	private JTextField controleRemoto;
	private JPanel panel;
	private JPanel Cadastro;
	private JTextField textField_Telefone;
	private JLabel txtNome;
	private JLabel txtDataDeNascimento;
	private JLabel txtCPF;
	private JLabel txtRG;
	private JLabel txtTelefone;
	private JLabel txtCelular;
	private JLabel txtRamal;
	private JLabel txtEmail;
	private JLabel txtCNH;
	private JLabel txtValidaCnh;
	private JTextField textField_Nome;
	private JTextField textField_Ramal;
	private JTextField textField_Celular;
	private JTextField textField_Email;
	private JTextField textField_Cnh;
	private JTextField textField_Cpf;
	private JTextField textField_RG;
	private JTextField textField_CategoriaCnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 window = new Tela2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1600, 856);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 99, 958, 697);
		frame.getContentPane().add(tabbedPane);

		Cadastro = new JPanel();
		tabbedPane.addTab("New tab", null, Cadastro, null);
		Cadastro.setLayout(null);

		textField_Telefone = new JTextField();
		textField_Telefone.setBounds(258, 278, 377, 31);
		Cadastro.add(textField_Telefone);
		textField_Telefone.setColumns(10);

		txtNome = new JLabel("Nome:");
		txtNome.setBounds(188, 51, 58, 30);
		Cadastro.add(txtNome);

		txtDataDeNascimento = new JLabel("Data de Nascimento:");
		txtDataDeNascimento.setBounds(121, 94, 125, 30);
		Cadastro.add(txtDataDeNascimento);

		txtCPF = new JLabel("CPF: ");
		txtCPF.setBounds(207, 137, 39, 30);
		Cadastro.add(txtCPF);

		txtRG = new JLabel("RG:");
		txtRG.setBounds(214, 180, 32, 30);
		Cadastro.add(txtRG);

		txtTelefone = new JLabel("Telefone:");
		txtTelefone.setBounds(181, 278, 65, 30);
		Cadastro.add(txtTelefone);

		txtCelular = new JLabel("Celular:");
		txtCelular.setBounds(195, 321, 51, 30);
		Cadastro.add(txtCelular);

		txtRamal = new JLabel("Ramal:");
		txtRamal.setBounds(205, 364, 41, 30);
		Cadastro.add(txtRamal);

		txtEmail = new JLabel("Email:");
		txtEmail.setBounds(205, 407, 41, 30);
		Cadastro.add(txtEmail);

		txtCNH = new JLabel("CNH:");
		txtCNH.setBounds(207, 450, 39, 30);
		Cadastro.add(txtCNH);

		txtValidaCnh = new JLabel("Validade da CNH:");
		txtValidaCnh.setBounds(141, 493, 105, 30);
		Cadastro.add(txtValidaCnh);

		textField_Nome = new JTextField();
		textField_Nome.setBounds(258, 51, 377, 31);
		textField_Nome.setColumns(10);
		Cadastro.add(textField_Nome);

		textField_Ramal = new JTextField();
		textField_Ramal.setBounds(258, 364, 377, 31);
		textField_Ramal.setColumns(10);
		Cadastro.add(textField_Ramal);

		textField_Celular = new JTextField();
		textField_Celular.setBounds(258, 322, 377, 31);
		textField_Celular.setColumns(10);
		Cadastro.add(textField_Celular);

		textField_Email = new JTextField();
		textField_Email.setBounds(258, 411, 377, 31);
		textField_Email.setColumns(10);
		Cadastro.add(textField_Email);

		textField_Cnh = new JTextField();
		textField_Cnh.setBounds(258, 454, 377, 31);
		textField_Cnh.setColumns(10);
		Cadastro.add(textField_Cnh);

		textField_Cpf = new JTextField();
		textField_Cpf.setBounds(258, 136, 377, 31);
		textField_Cpf.setColumns(10);
		Cadastro.add(textField_Cpf);

		textField_RG = new JTextField();
		textField_RG.setBounds(258, 179, 377, 31);
		textField_RG.setColumns(10);
		Cadastro.add(textField_RG);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(258, 227, 91, 22);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Selecione", "CPNJ", "CPF" }));
		Cadastro.add(comboBox);

		JLabel txtCadastro = new JLabel("Tipo de Cadastro:");
		txtCadastro.setBounds(136, 223, 110, 30);
		Cadastro.add(txtCadastro);

		textField_CategoriaCnh = new JTextField();
		textField_CategoriaCnh.setBounds(775, 454, 98, 31);
		textField_CategoriaCnh.setColumns(10);
		Cadastro.add(textField_CategoriaCnh);

		JLabel txtCategoriaCnh = new JLabel("Categoria CNH:");
		txtCategoriaCnh.setBounds(657, 457, 105, 30);
		Cadastro.add(txtCategoriaCnh);

		Checkbox checkbox = new Checkbox("Integrar e-mail");
		checkbox.setBounds(681, 413, 192, 24);
		checkbox.setFont(new Font("Arial", Font.ITALIC, 18));
		Cadastro.add(checkbox);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(258, 501, 95, 22);
		Cadastro.add(dateChooser);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 586, 953, 68);
		panel_2.setBackground(SystemColor.controlHighlight);
		Cadastro.add(panel_2);
		panel_2.setLayout(null);

		JButton btnNewButton = new JButton("Demitir");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(49, 21, 97, 25);
		panel_2.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Gravar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(414, 21, 97, 25);
		panel_2.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Cancelar");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(779, 21, 115, 25);
		panel_2.add(btnNewButton_1_1);

		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(258, 101, 95, 22);
		Cadastro.add(dateChooser_1);

		
		Icon imgl = new ImageIcon(getClass().getResource("foto.png"));
		JLabel img = new JLabel("", imgl, SwingConstants.CENTER);
		img.setBounds(681, 58, 247, 209);
		Cadastro.add(img);

		JButton btnCarregar = new JButton("Carregar Foto");
		btnCarregar.setBounds(681, 304, 247, 38);
		btnCarregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Selecione");
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				FileNameExtensionFilter filter = new FileNameExtensionFilter("imagem", "jpg", "png");
				fileChooser.setFileFilter(filter);
				int retorno = fileChooser.showOpenDialog(img);
				if (retorno == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					img.setIcon(new ImageIcon(file.getPath()));

				}
			}
		});
		Cadastro.add(btnCarregar);

		cadastro = new JTextField();
		tabbedPane.addTab("Cadastro", null, cadastro, null);
		cadastro.setColumns(10);

		ponto = new JTextField();
		tabbedPane.addTab("Ponto", null, ponto, null);
		ponto.setColumns(10);

		acesso = new JTextField();
		tabbedPane.addTab("Acesso", null, acesso, null);
		acesso.setColumns(10);

		cartao = new JTextField();
		tabbedPane.addTab("Cart\u00F5es", null, cartao, null);
		cartao.setColumns(10);

		controleRemoto = new JTextField();
		tabbedPane.addTab("Controle Remoto", null, controleRemoto, null);
		controleRemoto.setColumns(10);

		panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(12, 45, 958, 55);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_9 = new JLabel("Tela de Cadastro Social ");
		lblNewLabel_9.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel_9.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNewLabel_9.setBounds(302, 13, 454, 29);
		panel.add(lblNewLabel_9);
	}
}
