import java.awt.Frame;

public class MyMousetwo extends Frame {

    public MyMousetwo()  {
        this.setVisible(true);
        this.setSize(500,500);
        this.addMouseListener(new MyMousead());
    }
    public static void main(String[] args) {
        MyMousetwo aa=new MyMousetwo();
    }
    
}
