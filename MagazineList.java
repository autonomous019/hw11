//*******************************************************************
//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//*******************************************************************


public class MagazineList 
{
    private MagazineNode list;
    private int listCount;
    private MagazineNode head = null; 
    private MagazineNode next; 


   //----------------------------------------------------------------
   //  Sets up an initially empty list of magazines.
   //----------------------------------------------------------------
   public MagazineList()
   {
      list = null;
   }
   

   //----------------------------------------------------------------
   //  Creates a new MagazineNode object and adds it to the end of
   //  the linked list.
   //----------------------------------------------------------------
   public void add (Magazine mag)
   {

      MagazineNode node = new MagazineNode (mag);
      MagazineNode current;

      if (list == null)
         list = node;
      else
      {
         current = list;
         while (current.next != null)
            current = current.next;
            current.next = node;
      }
   }
   
   
   public void insert(Magazine mag) {
       
       MagazineNode node = new MagazineNode(mag);
       MagazineNode current;

      
       if (list == null) {
           list = node;
       }

       current = list;
       while (current.next != null) {
           current = current.next;
       }

       //set the new node to the Object x, next will be null.
       current.next = node;
       
   }
   
 
   public void deleteAll ()
   {
	   if(list == null){
		   //nothing to do
	   } else {
		   list = null;
	   }


   }
   
   
   //----------------------------------------------------------------
   //  Returns this list of magazines as a string.
   //----------------------------------------------------------------
   public String toString ()
   {
      String result = "";

      MagazineNode current = list;

      while (current != null)
      {
         result += current.magazine + "\n";
         current = current.next;
      }

      return result;
   }
   public void setNextLink( MagazineNode next )  
   {  
     this.next = next;  
   }  
   
   public MagazineNode getNextLink()  
   {  
     return next;  
   } 
 
   
   //*****************************************************************
   //  An inner class that represents a node in the magazine list.
   //  The public variables are accessed by the MagazineList class.
   //*****************************************************************
   private class MagazineNode
   {
      public Magazine magazine;
      public MagazineNode next;
      public MagazineNode prev;

      //--------------------------------------------------------------
      //  Sets up the node
      //--------------------------------------------------------------
      public MagazineNode (Magazine mag)
      {
         magazine = mag;
         next = null;
      }
      
     
      
   }
}



