import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class windowlistenerimp extends Frame implements WindowListener{
    public windowlistenerimp(){
        this.setVisible(true);
        this.setSize(500,500);
        this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window Open");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("window iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("window deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window deactivated");
    }
}
 class mine{   
    public static void main(String[] args) {
        windowlistenerimp aa=new windowlistenerimp();
    }
    
}
