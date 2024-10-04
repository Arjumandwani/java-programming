import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class lists extends Frame implements  ItemListener {
    Label l;
    List  b;
    public lists()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("hello");
        FlowLayout f=new FlowLayout();
        this.setLayout(f);
        l =new Label();
        l.setBounds(400,400,400,400);
        b=new List();
        b.add("java");
        b.add("c programming");
        b.add("C++");
        this.add(l);
        this.add(b);
        b.addItemListener(this);
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
      String selectedItem=  b.getSelectedItem();
      l.setText(""+selectedItem);
    
    }
    public static void main(String[] args) {
        lists aa=new lists();
        
    }

    
}
