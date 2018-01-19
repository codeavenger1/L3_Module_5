package other;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hangman implements MouseListener{
	JFrame frame;
	JPanel panel;
public static void main(String[] args)  {
	Hangman hangman = new Hangman();
	hangman.main2();
}

void main2(){
	frame = new JFrame();
	panel = new JPanel();
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.add(panel);
	frame.setTitle("HaNgMaN");
	frame.addMouseListener(this);
	
	
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}