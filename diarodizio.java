import javax.swing.*;

public class diarodizio
{
   public static void main (String args[])
   {
      int placacarro = 
      Integer.parseInt(JOptionPane.showInputDialog("Digite sua placa: "));
      
      int rodizio = placacarro % 10;
      
      if(rodizio == 1 || rodizio == 2)
      {
         JOptionPane.showMessageDialog(null,"Segunda-Feira");
      }
      
      if(rodizio == 3 || rodizio == 4)
      {
         JOptionPane.showMessageDialog(null,"Terca-Feira");
      }
      
      if(rodizio == 5 || rodizio == 6)
      {
         JOptionPane.showMessageDialog(null,"Quarta-Feira");
      }
     
      if(rodizio == 7 || rodizio == 8)
      {
         JOptionPane.showMessageDialog(null,"Quinta-Feira");
      }
      
      if(rodizio == 9 || rodizio == 0)
      {
         JOptionPane.showMessageDialog(null,"Sexta-Feira");
      }
      
      System.exit(0);
   }
}
