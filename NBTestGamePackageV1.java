package nb.test.gamepackagev1;
import edu.sjcny.gpv1.*; // game environment
import java.awt.*;
import java.util.*;
import java.awt.Font;
import javax.swing.JOptionPane;

public class NBTestGamePackageV1 extends DrawableAdapter
{   static NBTestGamePackageV1 ge = new NBTestGamePackageV1(); 
    static GameBoard gb = new GameBoard(ge, "Snake",600,600);
    static Cat cat;
    static Treat treat;
    Font font = new Font("Arial",Font.BOLD,50);
    Font font2 = new Font("Arial",Font.BOLD,80);
    int score=0; 
    int counter=10;
    
    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog (null,"Welcome to Snake!");
        JOptionPane.showMessageDialog (null,"Collect as many treats as you can within 10 seconds");
        JOptionPane.showMessageDialog (null,"Use the arrow keys to move about the board");
        treat = new Treat();        
        cat = new Cat();
        gb.setBackground(Color.BLACK);
        showGameBoard(gb);// keep this as the last in the method main
    }
     public void draw(Graphics graphic)
     {    
        
         cat.show(graphic);
         
         
          if(treat.getVisible()==true)
         {
             treat.show(graphic);
         }
         if(cat.collidedWith(treat))
         {
             treat.setVisible(false); 
             score +=1;             
             cat.addCatBit();
         } 
         if(treat.getVisible()==false)
         {
             treat = new Treat();
             treat.show(graphic);
         }
         
         if (counter<=0)
        {
         graphic.setFont(font2);
         graphic.setColor(Color.RED);
         graphic.drawString("GAME OVER", 40,330);
        }
         
         graphic.setFont(font);
         graphic.setColor(Color.WHITE);
         graphic.drawString(+score+ "", 100,70);
         graphic.drawString(+counter+"",400,70);
         
         
     }
     public void timer1()
     {
         counter -=1;
        if (counter<=0)
        {
         gb.stopTimer(1);
        }
     }
     public void keyStruck(char key)
     {
         int x,y;
         switch(key)
         {
             case'U':
                y=cat.getY();
                y-=30;
                cat.setY(y);
                 break;
             case'R':
                x=cat.getX();
                x+=30;
                cat.setX(x);
                 break;
             case 'D':
                y=cat.getY();
                y+=30;
                cat.setY(y);
                 break;
             case'L':
                 x=cat.getX();
                 x-=30;
                 cat.setX(x);
                 break;
         }
     }
}