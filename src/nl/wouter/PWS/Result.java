package nl.wouter.PWS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Font;

public class Result extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Result(String name, float mean, float median, float variance, float standardderiv, String type) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 161);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		setTitle(name);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnDitZijnDe = new JTextPane();
		txtpnDitZijnDe.setFont(new Font("Verdana", Font.BOLD, 12));
		txtpnDitZijnDe.setEditable(false);
		txtpnDitZijnDe.setText("Dit zijn de resultaten:");
		txtpnDitZijnDe.setBounds(20, 11, 149, 20);
		contentPane.add(txtpnDitZijnDe);
		
		JTextPane txtpnMeangemiddelde = new JTextPane();
		txtpnMeangemiddelde.setEditable(false);
		txtpnMeangemiddelde.setText("Mean (gemiddelde): " + mean);
		txtpnMeangemiddelde.setBounds(20, 42, 186, 20);
		contentPane.add(txtpnMeangemiddelde);
		
		JTextPane txtpnMediaan = new JTextPane();
		txtpnMediaan.setEditable(false);
		txtpnMediaan.setText("Mediaan: " + median);
		txtpnMediaan.setBounds(20, 60, 263, 20);
		contentPane.add(txtpnMediaan);
		
		JTextPane txtpnVariantie = new JTextPane();
		txtpnVariantie.setEditable(false);
		txtpnVariantie.setText("Variantie: " + variance);
		txtpnVariantie.setBounds(20, 79, 134, 20);
		contentPane.add(txtpnVariantie);
		
		JTextPane txtpnStandaardafwijking = new JTextPane();
		txtpnStandaardafwijking.setEditable(false);
		txtpnStandaardafwijking.setText("Standaardafwijking: " + standardderiv);
		txtpnStandaardafwijking.setBounds(20, 99, 212, 20);
		contentPane.add(txtpnStandaardafwijking);
		
		JTextPane txtpnType = new JTextPane();
		txtpnType.setText("Type: " + type);
		txtpnType.setBounds(228, 42, 149, 20);
		contentPane.add(txtpnType);
	}
}
