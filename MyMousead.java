
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMousead extends MouseAdapter {
    @Override
    public  void mouseClicked(MouseEvent e)
    {
System.out.println("Mouse clicked at"+e.getX()+" "+e.getY());
    }
           
    public static void main(String[] args) {
        MyMousead bb=new MyMousead();
    }
}
