package com.smarcotte.diamond;

import javax.swing.JOptionPane;

public class Diamond {

	public static void main(String[] args) {
		/***********************************************************************
		Program Name: Diamond.java
		Programmer's Name: Shane Marcotte
		Program Description: This program will ask the user for a number and if 
			the row number is odd, it will display a diamond.
		***********************************************************************/
		
		// get number of stars in the middle of the diamond
		short rowNumber = 0;
		do
		{
			// get input
			rowNumber = Short.parseShort(JOptionPane.showInputDialog("Enter the number of rows: "));
			
			// tell them if there is a problem
			if( rowNumber %2 != 1)
				JOptionPane.showMessageDialog(null, "Error. Number of rows must be odd.");
		}
		while(rowNumber % 2 != 1);
		
		// draw the top
		for(short row = 0; row < rowNumber / 2 + 1; row++)
		{
			
			// draw the spaces
			for(short spaces = 0; spaces < (int)(rowNumber / 2) - row; spaces++)
			{
				System.out.print(" ");
			}
			
			// draw the stars
			for(short stars = 0; stars < row * 2 + 1; stars++)
			{
				System.out.print("*");
			}
			
			// drop to next row
			System.out.println();
		}
		
		// draw the bottom
		for(short row = 0; row < rowNumber / 2; row++)
		{
			
			// draw the spaces
			for(short spaces = 0; spaces < 1 + row; spaces++)
			{
				System.out.print(" ");	
			}
			
			// draw the stars 
			for(short stars = 0; stars < Math.abs(row * 2 - rowNumber + 2); stars++)
			{
				System.out.print("*");
			}
			
			// drop to next row
			System.out.println();
		}
		
		// exit gracefully
		System.exit(0);

	}

}
