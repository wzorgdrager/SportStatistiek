package nl.wouter.PWS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;

import javax.swing.BoxLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JSpinner;

public class Homescreen {

	private JFrame frmPwsSportstatistiek;
	private JTextField nameField;
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	
	private JTextPane txtpnAlleFieldsZijn;
	private JSpinner spinnerType;
	
	private List<JTextField> inputFields = new ArrayList<JTextField>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homescreen window = new Homescreen();
					window.frmPwsSportstatistiek.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Homescreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPwsSportstatistiek = new JFrame();
		frmPwsSportstatistiek.setResizable(false);
		frmPwsSportstatistiek.setTitle("PWS Sportstatistiek");
		frmPwsSportstatistiek.getContentPane().setBackground(Color.WHITE);
		frmPwsSportstatistiek.setBounds(100, 100, 434, 443);
		frmPwsSportstatistiek.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPwsSportstatistiek.getContentPane().setLayout(null);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(271, 357, 96, 23);
		btnCalculate.setBackground(Color.WHITE);
		btnCalculate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		frmPwsSportstatistiek.getContentPane().add(btnCalculate);
		
		JTextPane txtpnWelkomVulAlle = new JTextPane();
		txtpnWelkomVulAlle.setBounds(31, 11, 361, 66);
		txtpnWelkomVulAlle.setEditable(false);
		txtpnWelkomVulAlle.setToolTipText("");
		txtpnWelkomVulAlle.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtpnWelkomVulAlle.setText("Welkom! Vul alle input vlakken in en klik vervolgens op calculate. Dit programma zal verschillende statistische gegevens berekenen. Dit is gemaakt voor de PWS van Rosanne van Houwelingen en Wouter Zorgdrager.");
		frmPwsSportstatistiek.getContentPane().add(txtpnWelkomVulAlle);
		
		JButton button = new JButton("Reset");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetFields();
				
			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(46, 357, 94, 23);
		frmPwsSportstatistiek.getContentPane().add(button);
		
		JLabel lblExperimentNaam = new JLabel("Experiment naam:");
		lblExperimentNaam.setBounds(31, 99, 108, 14);
		frmPwsSportstatistiek.getContentPane().add(lblExperimentNaam);
		
		nameField = new JTextField();
		nameField.setBounds(142, 96, 130, 20);
		frmPwsSportstatistiek.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Getallenreeks:");
		lblNewLabel.setBounds(31, 128, 89, 14);
		frmPwsSportstatistiek.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 124, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(142, 153, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(142, 187, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(142, 221, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(142, 255, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(177, 255, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(177, 124, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(177, 221, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(177, 187, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(177, 153, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(212, 255, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(212, 124, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(212, 221, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(212, 187, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(212, 153, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(247, 255, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(247, 124, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(247, 221, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(247, 187, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(247, 153, 25, 23);
		frmPwsSportstatistiek.getContentPane().add(textField_20);
		
		txtpnAlleFieldsZijn = new JTextPane();
		txtpnAlleFieldsZijn.setEditable(false);
		txtpnAlleFieldsZijn.setVisible(false);
		txtpnAlleFieldsZijn.setForeground(new Color(0, 128, 0));
		txtpnAlleFieldsZijn.setText("Alle fields zijn gereset!");
		txtpnAlleFieldsZijn.setBounds(290, 156, 128, 20);
		frmPwsSportstatistiek.getContentPane().add(txtpnAlleFieldsZijn);
		
		String[] possibilities = new String[]{"Populatie", "Steekproef"};
		SpinnerListModel spinnerModel = new SpinnerListModel(possibilities);
		spinnerType = new JSpinner(spinnerModel);
		spinnerType.setBounds(142, 306, 130, 20);
		JFormattedTextField spinField =((JSpinner.DefaultEditor) spinnerType.getEditor()).getTextField(); 
		spinField.setEditable(false); //hacky way to disable editing in spinner.
		frmPwsSportstatistiek.getContentPane().add(spinnerType);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(31, 309, 46, 14);
		frmPwsSportstatistiek.getContentPane().add(lblType);
		
		initFields();
	}
	
	private void initFields(){
		inputFields.add(textField_1);
		inputFields.add(textField_2);
		inputFields.add(textField_3);
		inputFields.add(textField_4);
		inputFields.add(textField_5);
		inputFields.add(textField_6);
		inputFields.add(textField_7);
		inputFields.add(textField_8);
		inputFields.add(textField_9);
		inputFields.add(textField_10);
		inputFields.add(textField_11);
		inputFields.add(textField_12);
		inputFields.add(textField_13);
		inputFields.add(textField_14);
		inputFields.add(textField_15);
		inputFields.add(textField_16);
		inputFields.add(textField_17);
		inputFields.add(textField_18);
		inputFields.add(textField_19);
		inputFields.add(textField_20);
	}
	
	private void resetFields(){
		for(JTextField field : inputFields){
			field.setText("");
		}
		
		txtpnAlleFieldsZijn.setVisible(true);
	}
	
	private void calculate(){
		if(nameField.getText().equals("")){
			//experiment name is empty
			throwError("Experiment naam is leeg.");
			return;
		}
		
		if(!containsEnoughItems()){
			//too few items
			throwError("Te weinig getallen, vul er minimaal 3 in.");
			return;
		}
		
		if(!checkInputs()){
			//invalid inputs
			throwError("Één of meer inputs zijn ongeldig.");
			return;
		}
		
		new Calculator(nameField.getText(), getFloats(), (String) spinnerType.getModel().getValue()).calculate(); //lets go
		
	}
	
	private boolean containsEnoughItems(){
		int minimalAmountOfInputs = 3;
		int counter = 0;
		
		for(JTextField field : inputFields){
			if(!field.getText().equals("")){
				counter++;
				
				if(counter >= minimalAmountOfInputs){
					return true;
				}
			}
		}
		
		return false;
	}
	
	private void throwError(String error){
		Error dialog = new Error(error);
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
	}
	
	private boolean checkInputs(){
		for(String input : getInputs()){
			try {
				Float.parseFloat(input);
			}catch(Exception e){
				return false;
			}
		}
		
		return true;
	}
	
	private List<String> getInputs(){
		List<String> inputs = new ArrayList<String>();
		
		for(JTextField field : inputFields){
			if(!field.getText().equals("")){
				inputs.add(field.getText());
			}
		}
		
		return inputs;
	}
	
	private Float[] getFloats(){
		List<Float> floats = new ArrayList<Float>();
		
		for(String input : getInputs()){
			try {
				floats.add(Float.parseFloat(input));
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		Float[] toReturn = new Float[floats.size()];
		floats.toArray(toReturn);
		
		return toReturn;
	}
}
