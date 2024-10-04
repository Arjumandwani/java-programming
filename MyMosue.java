import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMosue  extends Frame implements MouseListener{
    public MyMosue()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("hello");
        this.setBackground(Color.CYAN);
        this.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
       System.err.println("mouse clicked at"+e.getX()+" "+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.err.println("mouse Pressed at"+e.getX()+" "+e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.err.println("mouse Released at"+e.getX()+" "+e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.err.println("mouse Entered at"+e.getX()+" "+e.getY());
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.err.println("mouse exited at"+e.getX()+" "+e.getY());
       
    }
    public static void main(String[] args) {
        MyMosue aa=new MyMosue();
    }
    
}
