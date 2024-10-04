import java.awt.Button;
import  java.awt.Frame;
import java.awt.GridLayout;
public class gridlayoutnew  extends Frame{
    public gridlayoutnew()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("My grid layout");
    
    Button b1=new Button("1");
    Button b2=new Button("2");
    Button b3=new Button("3");
    Button b4=new Button("4");
    Button b5=new Button("5");
    Button b6=new Button("6");
    Button b7=new Button("7");
    Button b8=new Button("8");
    Button b9=new Button("9");
    GridLayout bl=new GridLayout(3,3,40,50);
    this.setLayout(bl);
    this.add(b1);this.add(b2);this.add(b3);
    this.add(b4);this.add(b5);this.add(b6);
    this.add(b7);this.add(b8);this.add(b9);
    this.setLayout(bl);
    
    }

    public static void main(String[] args) {
        gridlayoutnew bb=new gridlayoutnew();
    }
     
    
}
