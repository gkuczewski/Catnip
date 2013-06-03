package nb.test.gamepackagev1;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CatBit {
    int x;
    int y;
    
    public CatBit(int x, int y) {
        this.x = x;
        this.y = y;
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

    void show(Graphics graphic) {
        graphic.drawRect(x, y, 25, 25);
    }
}
