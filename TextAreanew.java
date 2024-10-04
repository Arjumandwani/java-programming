import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
public class TextAreanew extends Frame {
    public TextAreanew()
    {
        this.setVisible(true);
        this.setSize(500,500);
        FlowLayout f1=new FlowLayout();
        this.setLayout(f1);
        Label l1=new Label("enter address");

        TextArea aa=new TextArea("hello",10,10);
       this.add(l1);
        this.add(aa);
        
    }
    public static void main(String[] args) {
        TextAreanew aa=new TextAreanew();
    }
    
}
