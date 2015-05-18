package me.chris.CadetScoringSystemv5;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class ScoreSheet extends JFrame
{
	public ScoreSheet()
	{
		setBounds(100, 100, 1125, 780);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		SpringLayout sl_contentPane = new SpringLayout();
		getContentPane().setLayout(sl_contentPane);
		
		JLabel UnitLogo = new JLabel("");
		UnitLogo.setHorizontalAlignment(SwingConstants.CENTER);
		UnitLogo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sl_contentPane.putConstraint(SpringLayout.WEST, UnitLogo, 30, SpringLayout.WEST, this);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, UnitLogo, 145, SpringLayout.NORTH, this);
		sl_contentPane.putConstraint(SpringLayout.EAST, UnitLogo, 175, SpringLayout.WEST, this);
		UnitLogo.setIcon(new ImageIcon(ScoreSheet.class.getResource("/me/chris/Resources/CoronadoJROTCLogo.png")));
		sl_contentPane.putConstraint(SpringLayout.NORTH, UnitLogo, 10, SpringLayout.NORTH, this);
		getContentPane().add(UnitLogo);
		
		JLabel UnitName = new JLabel("Coronado NJROTC");
		sl_contentPane.putConstraint(SpringLayout.NORTH, UnitName, 30, SpringLayout.NORTH, this);
		sl_contentPane.putConstraint(SpringLayout.WEST, UnitName, 30, SpringLayout.EAST, UnitLogo);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, UnitName, 100, SpringLayout.NORTH, this);
		UnitName.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 53));
		getContentPane().add(UnitName);
		
		JLabel ProgramName = new JLabel("Competition PT Scoring System");
		sl_contentPane.putConstraint(SpringLayout.NORTH, ProgramName, -10, SpringLayout.SOUTH, UnitName);
		sl_contentPane.putConstraint(SpringLayout.WEST, ProgramName, 5, SpringLayout.WEST, UnitName);
		ProgramName.setFont(new Font("Dialog", Font.ITALIC, 25));
		getContentPane().add(ProgramName);
		
		JTextPane WorkingArea = new JTextPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, WorkingArea, 10, SpringLayout.SOUTH, UnitLogo);
		sl_contentPane.putConstraint(SpringLayout.WEST, WorkingArea, -10, SpringLayout.WEST, this);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, WorkingArea, -10, SpringLayout.SOUTH, this);
		sl_contentPane.putConstraint(SpringLayout.EAST, WorkingArea, 10, SpringLayout.EAST, this);
		getContentPane().add(WorkingArea);
		
		
		
	}
}
