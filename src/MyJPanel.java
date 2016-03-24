
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MyJPanel extends JPanel implements MouseMotionListener{
	
	private Square square = new Square(100);
	private int centerX, centerY;
	
	public MyJPanel(){
		addMouseMotionListener(this);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		// TODO Draw square and fill it with random color decided by method getRandomColor()
		// You should use fillRect()
		g.setColor(this.square.getRandomColor());
		g.fillRect(this.square.getCenterX(centerX), this.square.getCenterY(centerY), this.square.getShapeWidth(), this.square.getShapeHeight());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Get mouse dragged position and change suqare's position
		centerX = e.getX();
		centerY = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// No need to implement
	}
}
