package other;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hangman implements KeyListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	Stack<String> stack = new Stack();
public static void main(String[] args)  {
	Hangman hangman = new Hangman();
	hangman.main2();
	

}

void main2(){
	frame = new JFrame();
	panel = new JPanel();
	label = new JLabel();
	panel.add(label);
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
		label.setText("awkward");
		}
	if (e.getKeyChar()=='e') {
		stack.push("zombie");	
		label.setText("zombie");
		}
	if (e.getKeyChar()=='r') {
		stack.push("rambunctious");	
		label.setText("rambunctious");
		}
	if (e.getKeyChar()=='t') {
		stack.push("razzmatazz");	
		label.setText("razzmatazz");
		}
	if (e.getKeyChar()=='y') {
		stack.push("gossip");	
		label.setText("gossip");
		}
	if (e.getKeyChar()=='u') {
		stack.push("vodka");	
		label.setText("vodka");
		}
	if (e.getKeyChar()=='u') {
		stack.push("vodka");	
		label.setText("vodka");
		}
	if (e.getKeyChar()=='i') {
		stack.push("pajama");	
		label.setText("pajama");
		}
	if (e.getKeyChar()=='o') {
		stack.push("chores");	
		label.setText("chores");
		}
	if (e.getKeyChar()=='p') {
		stack.push("succulent");	
		label.setText("succulent");
		}
	if (e.getKeyChar()=='a') {
		stack.push("scissors");	
		label.setText("scissors");
		}
	if (e.getKeyChar()=='s') {
		stack.push("hilarious");	
		label.setText("hilarious");
		}
	if (e.getKeyChar()=='d') {
		stack.push("supreme");	
		label.setText("supreme");
		}
	if (e.getKeyChar()=='f') {
		stack.push("enchanting");	
		label.setText("enchanting");
		}
	if (e.getKeyChar()=='g') {
		stack.push("whimsical");	
		label.setText("whimsical");
		}
	if (e.getKeyChar()=='h') {
		stack.push("wrench");	
		label.setText("wrench");
		}
	if (e.getKeyChar()=='j') {
		stack.push("wrench");	
		label.setText("wrench");
		}
	if (e.getKeyChar()=='k') {
		stack.push("living");	
		label.setText("living");
		}
	if (e.getKeyChar()=='l') {
		stack.push("vocabulary");	
		label.setText("vocabulary");
		}
	if (e.getKeyChar()=='z') {
		stack.push("snatched");	
		label.setText("snatched");
		}
	if (e.getKeyChar()=='x') {
		stack.push("queso");	
		label.setText("queso");
		}
	if (e.getKeyChar()=='c') {
		stack.push("rhythm");	
		label.setText("rhythm");
		}
	if (e.getKeyChar()=='v') {
		stack.push("daughter");	
		label.setText("daughter");
		}
	if (e.getKeyChar()=='b') {
		stack.push("monkey");	
		label.setText("monkey");
		}
	if (e.getKeyChar()=='n') {
		stack.push("exotic");	
		label.setText("exotic");
		}
	if (e.getKeyChar()=='m') {
		stack.push("concentrate");	
		label.setText("concentrate");
		}
	

}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}