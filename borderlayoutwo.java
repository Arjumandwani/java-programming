import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
public class borderlayoutwo extends Frame{
public borderlayoutwo()
{
    this.setVisible(true);
    this.setSize(500,800);
    this.setBackground(Color.blue);
    
    Button b1=new Button("north");
    BorderLayout bl=new BorderLayout(20,15);
    this.setLayout(bl);
Button b2=new Button("South");
Button b3=new Button("East");
Button b4=new Button("Center");
Button b5=new Button("west");    
this.add(b1,BorderLayout.NORTH);
this.add(b2,BorderLayout.SOUTH);
this.add(b3,BorderLayout.EAST);
this.add(b4,BorderLayout.CENTER);
this.add(b5,BorderLayout.WEST);


}
public static void main(String[] args) {
    borderlayoutwo aa=new borderlayoutwo();
}   
}
