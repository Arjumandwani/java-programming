import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
public class grphics extends Frame {
    public grphics(){
        this.setVisible(true);
        this.setSize(600,500);
        this.setTitle("Graphics demo");
        this.setBackground(Color.yellow);

    }
    @Override
    public void paint(Graphics g)
    {
        g.drawString("welcome to arju",50,50);
        g.drawRect(10, 20, 100, 200);
        g.fillRect(10, 20, 100, 200);
        g.drawOval(10,20,200,300);
    }
    public static void main(String[] args) {
        grphics gg=new grphics();
    }
    
}
