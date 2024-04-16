package laendervergleichpackage;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JPanel contentPane;
    private JRadioButton Radiobutton1, Radiobutton2, Radiobuttongleich;
    private SpielLogik spielLogik; // Deklaration der SpielLogik
    private JTextField richtigeAntwort_Textfield, falscheAntwort_Textfield, vergleicheimSpiel_Textfield, vergleichnummer_Textfield;
    private JComboBox<String> kategorien_combobox;

    public GUI() {
        spielLogik = new SpielLogik(); // Initialisierung der SpielLogik

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

        kategorien_combobox = new JComboBox<>();
        kategorien_combobox.addItem("Bevölkerung");
        kategorien_combobox.addItem("Fläche");
        kategorien_combobox.addItem("Bevölkerung pro Quadratkilometer");
        kategorien_combobox.setBounds(100, 46, 286, 22);
        contentPane.add(kategorien_combobox);

        JLabel kategorie_label = new JLabel("Kategorie:");
        kategorie_label.setForeground(Color.BLACK);
        kategorie_label.setBounds(38, 50, 69, 14);
        contentPane.add(kategorie_label);

        Radiobutton1 = new JRadioButton("X ist größer");
        Radiobutton1.setBounds(38, 88, 348, 23);
        contentPane.add(Radiobutton1);

        Radiobutton2 = new JRadioButton("Y ist größer");
        Radiobutton2.setBounds(38, 114, 348, 23);
        contentPane.add(Radiobutton2);

        Radiobuttongleich = new JRadioButton("Gleich groß");
        Radiobuttongleich.setBounds(38, 140, 348, 23);
        contentPane.add(Radiobuttongleich);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(Radiobutton1);
        buttonGroup.add(Radiobutton2);
        buttonGroup.add(Radiobuttongleich);

        JButton check_button = new JButton("Check");
        check_button.setForeground(Color.BLACK);
        check_button.setBackground(Color.LIGHT_GRAY);
        check_button.setBounds(38, 176, 100, 23);
        contentPane.add(check_button);
        check_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateRadioButtons();
            }
        });

        JButton neuesspiel_button = new JButton("Neues Spiel");
        neuesspiel_button.setForeground(Color.BLACK);
        neuesspiel_button.setBackground(Color.LIGHT_GRAY);
        neuesspiel_button.setBounds(286, 176, 100, 23);
        contentPane.add(neuesspiel_button);

        JButton weiter_button = new JButton("Weiter");
        weiter_button.setForeground(Color.BLACK);
        weiter_button.setBackground(Color.LIGHT_GRAY);
        weiter_button.setBounds(164, 176, 100, 23);
        contentPane.add(weiter_button);

        JLabel richtigeantwort_label = new JLabel("Richtige Antwort");
        richtigeantwort_label.setForeground(Color.BLACK);
        richtigeantwort_label.setFont(new Font("Arial", Font.PLAIN, 11));
        richtigeantwort_label.setBounds(38, 210, 89, 14);
        contentPane.add(richtigeantwort_label);

        JLabel vergleicheimSpiel_Label = new JLabel("Vergleiche im Spiel");
        vergleicheimSpiel_Label.setForeground(Color.BLACK);
        vergleicheimSpiel_Label.setFont(new Font("Arial", Font.PLAIN, 11));
        vergleicheimSpiel_Label.setBounds(224, 210, 101, 14);
        contentPane.add(vergleicheimSpiel_Label);

        JLabel falscheAntwort_Label = new JLabel("Falsche Antwort ");
        falscheAntwort_Label.setForeground(Color.BLACK);
        falscheAntwort_Label.setFont(new Font("Arial", Font.PLAIN, 11));
        falscheAntwort_Label.setBounds(38, 235, 89, 14);
        contentPane.add(falscheAntwort_Label);

        JLabel vergleichNummer_label = new JLabel("Vergleich Nummer");
        vergleichNummer_label.setForeground(Color.BLACK);
        vergleichNummer_label.setFont(new Font("Arial", Font.PLAIN, 11));
        vergleichNummer_label.setBounds(224, 235, 101, 14);
        contentPane.add(vergleichNummer_label);

        richtigeAntwort_Textfield = new JTextField();
        richtigeAntwort_Textfield.setBackground(Color.LIGHT_GRAY);
        richtigeAntwort_Textfield.setForeground(Color.BLACK);
        richtigeAntwort_Textfield.setBounds(127, 207, 86, 20);
        contentPane.add(richtigeAntwort_Textfield);

        falscheAntwort_Textfield = new JTextField();
        falscheAntwort_Textfield.setForeground(Color.BLACK);
        falscheAntwort_Textfield.setBackground(Color.LIGHT_GRAY);
        falscheAntwort_Textfield.setBounds(127, 232, 86, 20);
        contentPane.add(falscheAntwort_Textfield);

        vergleicheimSpiel_Textfield = new JTextField();
        vergleicheimSpiel_Textfield.setForeground(Color.BLACK);
        vergleicheimSpiel_Textfield.setBackground(Color.LIGHT_GRAY);
        vergleicheimSpiel_Textfield.setBounds(335, 207, 86, 20);
        contentPane.add(vergleicheimSpiel_Textfield);

        vergleichnummer_Textfield = new JTextField();
        vergleichnummer_Textfield.setForeground(Color.BLACK);
        vergleichnummer_Textfield.setBackground(Color.LIGHT_GRAY);
        vergleichnummer_Textfield.setBounds(335, 232, 86, 20);
        contentPane.add(vergleichnummer_Textfield);
    }

    private void updateRadioButtons() {
        spielLogik.starteSpiel(); // Startet das Spiel neu und wählt zufällige Länder
        Land[] aktuelleLaender = spielLogik.getAktuelleLaender();
        if (aktuelleLaender != null && aktuelleLaender.length >= 2) {
            Radiobutton1.setText(aktuelleLaender[0].getName());
            Radiobutton2.setText(aktuelleLaender[1].getName());
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                GUI frame = new GUI();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
