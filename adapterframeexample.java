import java.awt.Frame;


public class adapterframeexample extends Frame{
    public adapterframeexample()
    {
        this.setVisible(true);
        this.setSize(100,100);
        this.addWindowListener(new AdapterExample());
    }
    public static void main(String[] args) {
        adapterframeexample bb=new adapterframeexample();
    }
    
}
