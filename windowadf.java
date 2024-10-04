import java.awt.Color;
import java.awt.Frame;

public class windowadf extends Frame {
    public windowadf()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle(("window Event handling using adapter class"));
        this.setBackground(Color.red);
        this.addWindowListener(new windowad());
    }
    public static void main(String[] args) {
        windowadf aa=new windowadf();
    }
    
}
