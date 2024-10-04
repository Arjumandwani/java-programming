import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class windowad extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window closing");
        System.exit(0);
    }
    
}
