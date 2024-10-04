import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class menujavaeg extends Frame implements ActionListener{
    public menujavaeg(){
        this.setVisible(true);
        this.setSize(500,500);

    MenuBar menubar=new MenuBar();
    setMenuBar(menubar);
    Menu file=new Menu("File");
    MenuItem open=new MenuItem("open");
    MenuItem save=new MenuItem("Save");
MenuItem exit=new MenuItem("exit");
file.add("open");
file.add("save");
file.add("exit");
open.addActionListener(this);
save.addActionListener(this);
exit.addActionListener(this);
menubar.add(file);
Menu edit=new Menu("Edit");
MenuItem copy=new MenuItem("copy");
MenuItem paste=new MenuItem("paste");
edit.add("copy");
edit.add("paste");
copy.addActionListener(this);
paste.addActionListener(this);
menubar.add(edit);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       String label=e.getActionCommand();
       switch(label){
        case "open":
        System.out.println("open clicked");
        break;
        case "save":
        System.out.println("open clicked");
        break;
        case "Exit":
        this.dispose();
        break;

       }
    }
    public static void main(String[] args) {
        
    
    menujavaeg aa=new menujavaeg();
    }
    
}
