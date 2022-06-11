import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class myApplet extends Applet implements ActionListener {
   TextField t1 = new TextField(10);
   TextField t2 = new TextField(10);
   TextField t3 = new TextField(10);
   Label l1 = new Label("First Number");
   Label l2 = new Label("Second Number");
   Label l3 = new Label("Sum");
   Button B = new Button("Add");

   public void init(){
      add(l1);
      add(l2);
      add(l2);
   }
   public void actionPerformed(ActionEvent e){

   }
}
