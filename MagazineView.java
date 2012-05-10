//*******************************************************************
//  MagazineRack.java       Author: Lewis/Loftus
//
//  Driver to exercise the MagazineList collection.
//*******************************************************************

import java.awt.*;
import javax.swing.*;

public class MagazineView extends JPanel
{
   //----------------------------------------------------------------
   //  Creates a MagazineList object, adds several magazines to the
   //  list, then prints it.
   //----------------------------------------------------------------
   public MagazineView ()
   {    
     // MagazineList rack = new MagazineList();
      JButton b1 = new JButton ("BUTTON 1");
      b1.add (b1, BorderLayout.CENTER);

      /*
      rack.add (new Magazine("Time"));
      rack.add (new Magazine("Woodworking Today"));
      rack.add (new Magazine("Communications of the ACM"));
      rack.add (new Magazine("House and Garden"));
      rack.add (new Magazine("GQ"));
      
      System.out.println (rack);
      */ 
   }
}
