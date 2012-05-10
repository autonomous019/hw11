//********************************************************************
//  BorderPanel.java       Authors: Lewis/Loftus
//
//  Represents the panel in the LayoutDemo program that demonstrates
//  the border layout manager.
//********************************************************************

import java.awt.*;
import javax.swing.*;

public class BorderPanel extends JApplet
{
   //-----------------------------------------------------------------
   //  Sets up this panel with a button in each area of a border
   //  layout to show how it affects their position, shape, and size.
   //-----------------------------------------------------------------

   public void init() {
	    
	    Container content = getContentPane();
	    content.setBackground(Color.white);
	    content.setLayout(new FlowLayout()); 
	    content.add(new JButton("Button 1"));
	    content.add(new JButton("Button 2"));
	    content.add(new JButton("Button 3"));
	  }

}