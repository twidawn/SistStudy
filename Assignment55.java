import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import javax.swing.*;

class MyPanel extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponents(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setStroke(new BasicStroke(3));
		g2.setPaint(Color.ORANGE);
		g2.fill(new CubicCurve2D.Double(370, 450, 550, 550 , 500, 550, 470, 350));
		g2.fill(new CubicCurve2D.Double(130, 350, 100, 550, 50, 550,  270, 450));
		g2.fill(new CubicCurve2D.Double(110, 300, 10, 150, 10, 150,  200, 150));
		g2.fill(new CubicCurve2D.Double(400, 150, 590, 150, 590, 150,  490, 300));
		g2.fill(new CubicCurve2D.Double(200, 150, 300, 0, 300, 0,  400, 150));
		//g2.draw(new CubicCurve2D.Double(400, 400, 550, 350, 550, 400, 450, 300));
		g2.setColor(Color.YELLOW);
		g2.fillOval(100, 100, 400, 400);
		g2.setColor(Color.ORANGE);
		g2.fillOval(120, 300, 50, 50);
		g2.fillOval(420, 300, 50, 50);
		g2.setColor(Color.BLACK);
		
		g2.drawArc(150, 200, 100, 100, 180, -180);
		g2.drawArc(350, 200, 100, 100, 180, -180);
		g2.drawArc(200, 350, 200, 100, 180, 180);
	}
}
public class Assignment55 extends JFrame {
	public Assignment55(){
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sun");
		setVisible(true);
		add(new MyPanel());
		
	}
	public static void main(String[] args) {
		Assignment55 a = new Assignment55();
	}
}

