import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
public class flowlayoutnew extends Frame {
    public flowlayoutnew()
    {
        this.setVisible(true);
        this.setSize(500,500);
        Button b1=new Button( "one");
        Button b2=new Button( "one");
        Button b3=new Button( "one");
        Button b4=new Button( "one");
        FlowLayout f1=new FlowLayout();
        this.setLayout(f1);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        
    }
    public static void main(String[] args) {
        
    
    flowlayoutnew bb=new flowlayoutnew();
    }
    
}
