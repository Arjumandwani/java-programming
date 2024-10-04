import java.awt.Color;
import java.awt.Frame;
public class colors extends Frame{
    public colors(){
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("this is my frame");
        //Color c=Color.red;
        Color c= new Color(255,0,0);
        this.setBackground(c);

    }
    public static void main(String[] args) {
        colors b=new colors();
        
    }

    
}
