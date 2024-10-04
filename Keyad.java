
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keyad extends KeyAdapter {
    @Override
    public void keyTyped(KeyEvent e)
    {
        System.out.println("Key  typed at]"+e.getKeyChar()+"]");
    }
    public static void main(String[] args) {
        Keyad bb=new Keyad();
    }
    
}
