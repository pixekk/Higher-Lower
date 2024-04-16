package laendervergleichpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField richtigeAntwort_Textfield;
	private JTextField falscheAntwort_Textfield;
	private JTextField vergleicheimSpiel_Textfield;
	private JTextField textField_3;
	private JTextField vergleichnummer_Textfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 451, 300);
	    contentPane = new JPanel();
	    contentPane.setBackground(Color.DARK_GRAY);
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    contentPane.setLayout(null);

	    JLabel ueberschrift_label = new JLabel("Higher / Lower");
	    ueberschrift_label.setForeground(Color.BLACK);
	    ueberschrift_label.setFont(new Font("Arial", Font.PLAIN, 20));
	    ueberschrift_label.setBounds(147, 11, 129, 24);
	    contentPane.add(ueberschrift_label);

	    JComboBox<String> kategorien_combobox = new JComboBox<>();
	    kategorien_combobox.setForeground(Color.BLACK);
	    kategorien_combobox.setBackground(Color.LIGHT_GRAY);
	    kategorien_combobox.setFont(new Font("Arial", Font.PLAIN, 11));
	    kategorien_combobox.setBounds(100, 46, 286, 22);
	    kategorien_combobox.addItem("Bevölkerung");
	    kategorien_combobox.addItem("Fläche");
	    kategorien_combobox.addItem("Bevölkerung pro Quadratkilometer");
	    contentPane.add(kategorien_combobox);

	    JRadioButton Radiobutton1 = new JRadioButton("X ist größer");
	    Radiobutton1.setFont(new Font("Arial", Font.PLAIN, 11));
	    Radiobutton1.setBackground(Color.LIGHT_GRAY);
	    Radiobutton1.setForeground(Color.BLACK);
	    Radiobutton1.setBounds(38, 88, 348, 23);
	    contentPane.add(Radiobutton1);

	    JRadioButton Radiobutton2 = new JRadioButton("Y ist größer");
	    Radiobutton2.setFont(new Font("Arial", Font.PLAIN, 11));
	    Radiobutton2.setForeground(Color.BLACK);
	    Radiobutton2.setBackground(Color.LIGHT_GRAY);
	    Radiobutton2.setBounds(38, 114, 348, 23);
	    contentPane.add(Radiobutton2);

	    JRadioButton Radiobuttongleich = new JRadioButton("gleich groß");
	    Radiobuttongleich.setFont(new Font("Arial", Font.PLAIN, 11));
	    Radiobuttongleich.setBackground(Color.LIGHT_GRAY);
	    Radiobuttongleich.setForeground(Color.BLACK);
	    Radiobuttongleich.setBounds(38, 140, 348, 23);
	    contentPane.add(Radiobuttongleich);

	    // ButtonGroup erstellen und Radiobuttons hinzufügen
	    ButtonGroup buttonGroup = new ButtonGroup();
	    buttonGroup.add(Radiobutton1);
	    buttonGroup.add(Radiobutton2);
	    buttonGroup.add(Radiobuttongleich);

	    // Der Rest deines Codes zur Einrichtung anderer GUI-Komponenten bleibt unverändert
	    JLabel kategorie_label = new JLabel("Kategorie:");
		kategorie_label.setFont(new Font("Arial", Font.PLAIN, 11));
		kategorie_label.setBackground(Color.DARK_GRAY);
		kategorie_label.setForeground(Color.BLACK);
		kategorie_label.setBounds(38, 50, 69, 14);
		contentPane.add(kategorie_label);

		
		JButton check_button = new JButton("check");
		check_button.setForeground(Color.BLACK);
		check_button.setBackground(Color.LIGHT_GRAY);
		check_button.setBounds(38, 176, 100, 23);
		contentPane.add(check_button);
		
		JButton neuesspiel_button = new JButton("neues Spiel\r\n");
		neuesspiel_button.setForeground(Color.BLACK);
		neuesspiel_button.setBackground(Color.LIGHT_GRAY);
		neuesspiel_button.setBounds(286, 176, 100, 23);
		contentPane.add(neuesspiel_button);
		
		JButton weiter_button = new JButton("weiter");
		weiter_button.setForeground(Color.BLACK);
		weiter_button.setBackground(Color.LIGHT_GRAY);
		weiter_button.setBounds(164, 176, 100, 23);
		contentPane.add(weiter_button);
		
		JLabel richtigeantwort_label = new JLabel("richtige Antwort");
		richtigeantwort_label.setFont(new Font("Arial", Font.PLAIN, 11));
		richtigeantwort_label.setForeground(Color.BLACK);
		richtigeantwort_label.setBackground(Color.DARK_GRAY);
		richtigeantwort_label.setBounds(38, 210, 89, 14);
		contentPane.add(richtigeantwort_label);
		
		JLabel vergleicheimSpiel_Label = new JLabel("Vergleiche im Spiel");
		vergleicheimSpiel_Label.setForeground(Color.BLACK);
		vergleicheimSpiel_Label.setFont(new Font("Arial", Font.PLAIN, 11));
		vergleicheimSpiel_Label.setBackground(Color.DARK_GRAY);
		vergleicheimSpiel_Label.setBounds(224, 210, 101, 14);
		contentPane.add(vergleicheimSpiel_Label);
		
		JLabel falscheAntwort_Label = new JLabel("falsche Antwort ");
		falscheAntwort_Label.setForeground(Color.BLACK);
		falscheAntwort_Label.setFont(new Font("Arial", Font.PLAIN, 11));
		falscheAntwort_Label.setBackground(Color.DARK_GRAY);
		falscheAntwort_Label.setBounds(38, 235, 89, 14);
		contentPane.add(falscheAntwort_Label);
		
		JLabel vergleichNummer_label = new JLabel("Veregleich Nummer");
		vergleichNummer_label.setForeground(Color.BLACK);
		vergleichNummer_label.setFont(new Font("Arial", Font.PLAIN, 11));
		vergleichNummer_label.setBackground(Color.DARK_GRAY);
		vergleichNummer_label.setBounds(224, 235, 101, 14);
		contentPane.add(vergleichNummer_label);
		
		richtigeAntwort_Textfield = new JTextField();
		richtigeAntwort_Textfield.setBackground(Color.LIGHT_GRAY);
		richtigeAntwort_Textfield.setForeground(Color.BLACK);
		richtigeAntwort_Textfield.setBounds(127, 207, 20, 20);
		contentPane.add(richtigeAntwort_Textfield);
		richtigeAntwort_Textfield.setColumns(10);
		
		falscheAntwort_Textfield = new JTextField();
		falscheAntwort_Textfield.setForeground(Color.BLACK);
		falscheAntwort_Textfield.setColumns(10);
		falscheAntwort_Textfield.setBackground(Color.LIGHT_GRAY);
		falscheAntwort_Textfield.setBounds(127, 232, 20, 20);
		contentPane.add(falscheAntwort_Textfield);
		
		vergleicheimSpiel_Textfield = new JTextField();
		vergleicheimSpiel_Textfield.setForeground(Color.BLACK);
		vergleicheimSpiel_Textfield.setColumns(10);
		vergleicheimSpiel_Textfield.setBackground(Color.LIGHT_GRAY);
		vergleicheimSpiel_Textfield.setBounds(335, 207, 20, 20);
		contentPane.add(vergleicheimSpiel_Textfield);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLACK);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(355, 210, 0, 20);
		contentPane.add(textField_3);
		
		vergleichnummer_Textfield = new JTextField();
		vergleichnummer_Textfield.setForeground(Color.BLACK);
		vergleichnummer_Textfield.setColumns(10);
		vergleichnummer_Textfield.setBackground(Color.LIGHT_GRAY);
		vergleichnummer_Textfield.setBounds(335, 232, 20, 20);
		contentPane.add(vergleichnummer_Textfield);
	}
}
