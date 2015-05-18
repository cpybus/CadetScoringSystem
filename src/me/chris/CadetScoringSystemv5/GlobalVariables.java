package me.chris.CadetScoringSystemv5;

import javax.swing.JFrame;

public class GlobalVariables
{
	private static JFrame frame;
	
	public static JFrame getCurrentFrame()
	{
		return frame;
	}
	
	public static void setCurrentFrame(JFrame j)
	{
		frame = j;
	}
}
