import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class key extends Frame implements KeyListener {
    public key()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed---->["+e.getKeyChar()+"]");
    }

    @Override
    public void keyPressed(KeyEvent e) {
       System.out.println("Key pressed--->["+e.getKeyChar()+"]");
    }

    @Override
    public void keyReleased(KeyEvent e) {
       System.out.println("Key released--->]"+e.getKeyChar()+"]");
    }
    public static void main(String[] args) {
        key aa=new key();
    }
    
}
