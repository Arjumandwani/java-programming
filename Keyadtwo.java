
import java.awt.Frame;

public class Keyadtwo extends Frame {
    
    public Keyadtwo()
    {
        this.setVisible(true);
        this.setSize(100,100);
        this.addKeyListener(new Keyad());
    }
    public static void main(String[] args) {
        Keyadtwo dd=new Keyadtwo();
    }
}
