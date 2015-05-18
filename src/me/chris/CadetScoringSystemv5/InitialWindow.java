package me.chris.CadetScoringSystemv5;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import me.chris.CadetScoringSystemv5.JDialogs.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;

public class InitialWindow extends JFrame
{
	
	private static final long	serialVersionUID	= 5151799064804881534L;
	private JPanel				contentPane;
	private final JFrame j = this;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		new GlobalVariables();
		
		try
		{
			// Set System L&F
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (UnsupportedLookAndFeelException e)
		{
			// handle exception
		}
		catch (ClassNotFoundException e)
		{
			// handle exception
		}
		catch (InstantiationException e)
		{
			// handle exception
		}
		catch (IllegalAccessException e)
		{
			// handle exception
		}
		
		new InitialWindow();
	}
	
	public InitialWindow()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 400);
		setResizable(false);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		GlobalVariables.setCurrentFrame(this);
		
		JLabel UnitIcon = new JLabel("Coronado Icon");
		UnitIcon.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		UnitIcon.setIcon(new ImageIcon(InitialWindow.class.getResource("/me/chris/Resources/CoronadoJROTCLogo2x.png")));
		UnitIcon.setHorizontalAlignment(SwingConstants.CENTER);
		sl_contentPane.putConstraint(SpringLayout.NORTH, UnitIcon, 15, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, UnitIcon, 15, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, UnitIcon, 218, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, UnitIcon, -15, SpringLayout.EAST, contentPane);
		contentPane.add(UnitIcon);
		
		JLabel UserInstructions = new JLabel("What would you like to do?");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, UserInstructions, 40, SpringLayout.SOUTH, UnitIcon);
		sl_contentPane.putConstraint(SpringLayout.EAST, UserInstructions, -15, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, UserInstructions, 20, SpringLayout.SOUTH, UnitIcon);
		sl_contentPane.putConstraint(SpringLayout.WEST, UserInstructions, 15, SpringLayout.WEST, contentPane);
		UserInstructions.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(UserInstructions);
		
		JButton NewSpreadSheet = new JButton("Create a new SpreadSheet");
		sl_contentPane.putConstraint(SpringLayout.WEST, NewSpreadSheet, 60, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, NewSpreadSheet, -60, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, NewSpreadSheet, 20, SpringLayout.SOUTH, UserInstructions);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, NewSpreadSheet, 45, SpringLayout.SOUTH, UserInstructions);
		NewSpreadSheet.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(NewSpreadSheet);
		
		JButton ExistingSpreadSheet = new JButton("Open an Existing SpreadSheet");
		sl_contentPane.putConstraint(SpringLayout.NORTH, ExistingSpreadSheet, 15, SpringLayout.SOUTH, NewSpreadSheet);
		sl_contentPane.putConstraint(SpringLayout.WEST, ExistingSpreadSheet, 60, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, ExistingSpreadSheet, 40, SpringLayout.SOUTH, NewSpreadSheet);
		sl_contentPane.putConstraint(SpringLayout.EAST, ExistingSpreadSheet, -60, SpringLayout.EAST, contentPane);
		ExistingSpreadSheet.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(ExistingSpreadSheet);
		
		NewSpreadSheet.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				new EnterSpreadSheetName();
			}
		});
		
		ExistingSpreadSheet.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				final JFileChooser fc = new JFileChooser();
				
				FileNameExtensionFilter ymlfilter = new FileNameExtensionFilter("ScoreSheet Files (.yml .yaml)", "yml", "yaml");
				fc.setFileFilter(ymlfilter);
				fc.setDialogTitle("Open ScoreSheet File");
				
				int returnVal = fc.showOpenDialog(GlobalVariables.getCurrentFrame());
				
				if (returnVal == JFileChooser.APPROVE_OPTION)
				{
					fc.getSelectedFile();
					
					// new ScoreSheet(file.getName().replace(".yml", "").replace(".yaml", ""), Helper.parseYaml(file));
				}
			}
		});
		
		addWindowListener(new WindowAdapter()
		{
			public void windowActivated(WindowEvent e)
			{
				GlobalVariables.setCurrentFrame(j);
			}
		});
	}
}
