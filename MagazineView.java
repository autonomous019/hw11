import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MagazineView extends JApplet implements ActionListener
{
   //-----------------------------------------------------------------
   //  Sets up this panel with a button in each area of a border
   //  layout to show how it affects their position, shape, and size.
   //-----------------------------------------------------------------
	
    JTextArea textArea;
    JTextArea textArea2;
    JTextField txtdata;
    JTextField textField;
    JButton calbtn = new JButton("View All");
    JButton calbtn2 = new JButton("Add Mag");
    JButton calbtn3 = new JButton("Delete All");
    MagazineList rack = new MagazineList();

    private final static String newline = "\n";
    
    public void init() {
    	
   
	    JPanel myPanel = new JPanel();
        add(myPanel);
        myPanel.setLayout(new FlowLayout());
        
        textField = new JTextField(8);
        
        textArea = new JTextArea(5,8);
        textArea2 = new JTextArea(10,8);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JScrollPane scrollPane2 = new JScrollPane(textArea2);
        textArea.setEditable(false);
        textArea2.setEditable(false);
        
        myPanel.add(textField);
        myPanel.add(calbtn);
        myPanel.add(calbtn2);
        myPanel.add(calbtn3);
        //myPanel.add(textArea);
        myPanel.add(textArea2);
        
        calbtn.addActionListener(this);
        calbtn2.addActionListener(this);
        calbtn3.addActionListener(this);
        
        txtdata = new JTextField();
        
	  }

   public void actionPerformed(ActionEvent e)
   {
       if (e.getSource() == calbtn) {
    	   textArea2.setText(rack.toString()); 	   
       }
       
       if (e.getSource() == calbtn2) {
           String data = textField.getText(); //perform your operation
           //System.out.println(data);
           textArea.append(data + newline);
           rack.add(new Magazine(data));
       }
       
       if (e.getSource() == calbtn3) {
          rack.deleteAll();
          textArea2.setText(rack.toString());
          textArea.setText(rack.toString());
       }
       
   }

   
   
   
   
   
   
   
}