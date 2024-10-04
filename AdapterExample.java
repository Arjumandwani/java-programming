
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterExample extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e)
    {System.out.println("window closing");
        System.exit(0);
    }
    public static void main(String[] args) {
        AdapterExample aa=new AdapterExample();
    }
    
}
