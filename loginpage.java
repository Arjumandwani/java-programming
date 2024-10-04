import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginpage  extends Frame implements ActionListener{
    Label l;
    Button b;
    TextField t1,t2;
 public loginpage()
 {this.setVisible(true);
    this.setSize(500,500);
    FlowLayout f=new FlowLayout();
    this.setLayout(f);
    b=new Button("login");
    t1=new TextField(); 
    t2=new TextField(); 
    l=new Label();
    this.add(b);
    this.add(t1);
    this.add(t2);
    this.add(l);
    b.addActionListener(this);


    


 }
    @Override
    public void actionPerformed(ActionEvent e) {
      String len=t1.getText();
      String p=t2.getText();
      if(len.equals("abc")&&p.equals("xyz"))
      {
        l.setText("valid user");
      }
      else{
        l.setText("invalid user");
      }
    }
    public static void main(String[] args) {
        loginpage aa=new loginpage();
    }
}





































