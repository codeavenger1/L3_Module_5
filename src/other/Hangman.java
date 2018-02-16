package other;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman implements KeyListener, ActionListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	JLabel label2;
	
	int lives = 19;
	Stack<String> stack = new Stack<>();
public static void main(String[] args)  {
	Hangman hangman = new Hangman();
	hangman.main2();
	

}

void main2(){
	frame = new JFrame();
	panel = new JPanel();
	label = new JLabel();
	label2 = new JLabel();
	label.setLocation(100,100);
	panel.add(label);
	panel.add(label2);
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.add(panel);
	frame.setTitle("HaNgMaN");
	frame.addKeyListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	stack.push("");
	
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyChar()=='q') {
	stack.push("presumptuous");	
	label.setText("_ _ _ _ _ _ _ _ _ _ _ _");
	}
	if (e.getKeyChar()=='w') {
		stack.push("awkward");	
		label.setText("_ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='e') {
		stack.push("zombie");	
		label.setText("_ _ _ _ _ _");
		}
	if (e.getKeyChar()=='r') {
		stack.push("rambunctious");	
		label.setText("_ _ _ _ _ _ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='t') {
		stack.push("razzmatazz");	
		label.setText("_ _ _ _ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='y') {
		stack.push("gossip");	
		label.setText("_ _ _ _ _ _");
		}
	if (e.getKeyChar()=='u') {
		stack.push("vodka");	
		label.setText("_ _ _ _ _");
		}
	if (e.getKeyChar()=='i') {
		stack.push("pajama");	
		label.setText("_ _ _ _ _ _");
		}
	if (e.getKeyChar()=='o') {
		stack.push("chores");	
		label.setText("_ _ _ _ _ _");
		}
	if (e.getKeyChar()=='p') {
		stack.push("succulent");	
		label.setText("_ _ _ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='a') {
		stack.push("scissors");	
		label.setText("_ _ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='s') {
		stack.push("hilarious");	
		label.setText("_ _ _ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='d') {
		stack.push("supreme");	
		label.setText("_ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='f') {
		stack.push("enchanting");	
		label.setText("_ _ _ _ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='g') {
		stack.push("whimsical");	
		label.setText("_ _ _ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='h') {
		stack.push("wrench");	
		label.setText("_ _ _ _ _ _");
		}
	if (e.getKeyChar()=='j') {
		stack.push("exercise");	
		label.setText("_ _ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='k') {
		stack.push("living");	
		label.setText("_ _ _ _ _ _");
		}
	if (e.getKeyChar()=='l') {
		stack.push("vocabulary");	
		label.setText("_ _ _ _ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='z') {
		stack.push("snatched");	
		label.setText("_ _ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='x') {
		stack.push("queso");	
		label.setText("_ _ _ _ _");
		}
	if (e.getKeyChar()=='c') {
		stack.push("rhythm");	
		label.setText("_ _ _ _ _ _");
		}
	if (e.getKeyChar()=='v') {
		stack.push("daughter");	
		label.setText("_ _ _ _ _ _ _ _");
		}
	if (e.getKeyChar()=='b') {
		stack.push("monkey");	
		label.setText("_ _ _ _ _ _");
		}
	if (e.getKeyChar()=='n') {
		stack.push("exotic");	
		label.setText("_ _ _ _ _ _");
		}
	if (e.getKeyChar()=='m') {
		stack.push("concentrate");	
		label.setText("_ _ _ _ _ _ _ _ _ _ _");
		}
	
	String word = stack.peek();
	
	for (int j = 0; j < 20; j++) {
		
		
	
String letter = JOptionPane.showInputDialog("type a letter");
		if (stack.peek().contains(letter)) {
			
			
		for (int i = 0; i < word.length(); i++) {
			if (letter.contains(word.charAt(i)+"")) {
			StringBuilder build = new StringBuilder(label.getText());
			build.deleteCharAt(i*2);
			build.insert(i*2, letter);
			
			
			
			label.setText(build.toString());
				System.out.println("match");
			}
			
			String text = label.getText().replaceAll("\\s", "");
			System.out.println(text);
			
			
			if (text.equals(word)) {
				JOptionPane.showMessageDialog(null, "Good job!");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			
			
		}
		
		
			
		}
		
		else {
			label2.setText(" you have " + lives-- + " lives ");
			label2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		}
		}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
		
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}