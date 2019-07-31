package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
      String y= JOptionPane.showInputDialog("2+2=");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
        if(y.equals("5")) {
        	JOptionPane.showMessageDialog(null, "u're good at math " );
        }
		// 5. Otherwise, say "wrong" and tell them the answer
        else {
        	JOptionPane.showMessageDialog(null, "u're bad at math " );
        }
		// 6. Add some more riddles
        String y2= JOptionPane.showInputDialog("2+2=");
        
        if(y2.equals(4)) {
        	JOptionPane.showMessageDialog(null, "u're good at math " );
        }
        else {
        	JOptionPane.showMessageDialog(null, "u're bad at math " );

        }
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "score= " );
	}
}

