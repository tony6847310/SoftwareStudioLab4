
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;


public class MyJPanel extends JPanel implements MouseMotionListener{
	
	private Square square = new Square(120);
	private JPanel squarePanel1=new JPanel();
	
	public MyJPanel(){
		addMouseMotionListener(this);
		
		squarePanel1.setLocation(0, 0);
		squarePanel1.setBounds(0, 0, square.getShapeWidth(), square.getShapeHeight());

		GroupLayout squarePanel1Layout = new GroupLayout(squarePanel1);
        squarePanel1.setLayout(squarePanel1Layout);
        squarePanel1Layout.setHorizontalGroup(squarePanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, square.getShapeWidth(), Short.MAX_VALUE)
        );
        squarePanel1Layout.setVerticalGroup(squarePanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, square.getShapeHeight(), Short.MAX_VALUE)
        );
		
        this.add(squarePanel1);
		
		
	}
	
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		squarePanel1.setBackground(square.getRandomColor());
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Get mouse dragged position and change suqare's position
		squarePanel1.setLocation(e.getX()-square.getShapeWidth()/2, e.getY()-square.getShapeWidth()/2);
		//centerX = e.getX();
		//centerY = e.getY();
		squarePanel1.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// No need to implement
	}
}
