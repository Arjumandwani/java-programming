import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class checkboxgroupeg  extends Frame implements ItemListener {
    Checkbox c1,c2,c3;
    Label label;
    public checkboxgroupeg()
    {
        this.setVisible(true);
        this.setSize(500,500);
        label=new Label();
        label.setAlignment(label.CENTER);
        label.setSize(400,500);
        CheckboxGroup cbg=new CheckboxGroup();
        c1=new Checkbox("Tea",cbg,false);
        c1.setBounds(100,100,50,50);
        c2=new Checkbox("milk",cbg,false);
        c2.setBounds(100,150,50,50);
        c3=new Checkbox("coffee",cbg,false);
        c3.setBounds(100,180,50,50);
        this.add(c1);
        this.add(c3);
        this.add(c2);
        this.add(label);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       Checkbox cb=(Checkbox) e.getItemSelectable();
       if(cb.getState()==true)

{
    label.setText(cb.getLabel()+"is checked");
} 
else{  label.setText(cb.getLabel()+"is unchecked");
    
}   }
public static void main(String[] args) {
    checkboxgroupeg bb=new checkboxgroupeg();
}
    
}
