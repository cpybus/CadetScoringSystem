package me.chris.CadetScoringSystemv5.JDialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class EnterSpreadSheetName extends JDialog
{
	private static final long	serialVersionUID	= -7553251556754444358L;
	private final JPanel	contentPanel	= new JPanel();
	private JTextField SpreadSheetName;
	
	public EnterSpreadSheetName()
	{
		setBounds(100, 100, 343, 180);
		setResizable(false);
		getContentPane().add(contentPanel);
		SpringLayout sl_contentPanel = new SpringLayout();
		contentPanel.setLayout(sl_contentPanel);
		
		JLabel UserInstructions = new JLabel("Please name the new spreadsheet");
		sl_contentPanel.putConstraint(SpringLayout.NORTH, UserInstructions, 21, SpringLayout.NORTH, contentPanel);
		sl_contentPanel.putConstraint(SpringLayout.WEST, UserInstructions, 10, SpringLayout.WEST, contentPanel);
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, UserInstructions, 42, SpringLayout.NORTH, contentPanel);
		sl_contentPanel.putConstraint(SpringLayout.EAST, UserInstructions, 228, SpringLayout.WEST, contentPanel);
		UserInstructions.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPanel.add(UserInstructions);
		
		SpreadSheetName = new JTextField();
		sl_contentPanel.putConstraint(SpringLayout.NORTH, SpreadSheetName, 10, SpringLayout.SOUTH, UserInstructions);
		sl_contentPanel.putConstraint(SpringLayout.WEST, SpreadSheetName, 10, SpringLayout.WEST, contentPanel);
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, SpreadSheetName, 30, SpringLayout.SOUTH, UserInstructions);
		sl_contentPanel.putConstraint(SpringLayout.EAST, SpreadSheetName, -130, SpringLayout.EAST, contentPanel);
		contentPanel.add(SpreadSheetName);
		
		SpreadSheetName.setColumns(10);
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
