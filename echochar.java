import java.awt.*;
public class echochar extends Frame {
    public echochar(){
        Label l1=new Label("enter password");
        l1.setBounds(10,15,100,200);
        TextField tf=new TextField(10);
        tf.setText("your password");
        tf.setBounds(30,15,150,200);
        tf.setEchoChar('*');
        Button b1=new Button("Cancel");
        System.out.println(b1.getLabel());
        b1.setBounds(10,50,50,30);
        add(l1);
        add(tf);
        add(b1);
        this.setVisible(true);
        this.setSize(500,500);


    }
    public static void main(String[] args) {
        echochar aa=new echochar();
    }

    
}
