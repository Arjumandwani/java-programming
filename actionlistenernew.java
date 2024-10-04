import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class actionlistenernew extends Frame implements ActionListener {
Label l1;
Button b;
    public actionlistenernew()
    {
        this.setVisible(true);
        this.setSize(500,500);
        l1=new Label();
        l1.setBounds(100,100,300,20);
        b=new Button("click here");
      b.setBounds(200,200,60,30);
      this.add(l1);
      this.add(b);
      b.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Font f=new Font("consolas",Font.BOLD,25);
        l1.setFont(f);
        l1.setText("elcome to arjus house");
        
    }
    public static void main(String[] args) {
        actionlistenernew aa=new actionlistenernew();
        
    }
    
}
