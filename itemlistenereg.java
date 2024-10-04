
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class itemlistenereg extends Frame implements ItemListener {
    Checkbox c1,c2,c3;
    Label l;
    public itemlistenereg()
    {this.setVisible(true);
        this.setTitle("frames");
        this.setSize(500,500);
        FlowLayout f1=new FlowLayout();
        this.setLayout(f1);
        Font f=new Font("Consols",Font.BOLD,20);
        l=new Label();
        l.setAlignment(Label.CENTER);
  
        l.setFont(f);
        
        c1=new Checkbox("Tea");
        c2=new Checkbox("milk");
     
        c1.addItemListener(this);
        c2.addItemListener(this);
        this.add(c1);
        this.add(c2);
        this.add(l);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.getState()==true)
        {l.setText("1");

        }
        if(c2.getState()==true)
        {
            l.setText("2");
        }
    }
    public static void main(String[] args) {
        itemlistenereg aa=new itemlistenereg();
    }
}
