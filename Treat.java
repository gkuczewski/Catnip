package nb.test.gamepackagev1;
import java.awt.*;
import java.util.Random;

public class Treat {
    Random randomNumber = new Random();
    boolean visible = true;
     int x = randomNumber.nextInt(566)+9;
     int y = randomNumber.nextInt(561)+30;
    public void show(Graphics graphic)
    {
       
        graphic.setColor(Color.PINK);
        graphic.fillRect(x,y,25,25);
        
    }
     public int getX()
    {
        return x;
    }
    public void setX(int newX)
    {
        x=newX;
    }
    public int getY()
    {
       return y; 
    }
    public void setY(int y)
    {
    this.y=y;
    }
    public boolean getVisible()
    {
        return visible;
    }
    public void setVisible(boolean vis)
    {
        visible = vis;

    }
    
}
