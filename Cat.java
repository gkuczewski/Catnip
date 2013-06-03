package nb.test.gamepackagev1;
import java.awt.*;
import java.util.ArrayList;

public class Cat {
     int x = 200;
     int y = 200;
     
     java.util.List<CatBit> catBits = new ArrayList<CatBit>();
     
     public Cat()
     {
         for (int i = 0; i < 3; i++) {
             CatBit bit = new CatBit(x - (30 * i), y);
             
             catBits.add(bit);
         }
     }
    public void addCatBit(){
        int x = catBits.get(catBits.size() - 1).getX() - 30, y = catBits.get(catBits.size() - 1).getY();
        CatBit bit = new CatBit(x, y);
        
        catBits.add(bit);
    }
    
     public void show(Graphics graphic)
    {
        graphic.setColor(Color.PINK);
        
        for (CatBit catBit : catBits) {
            catBit.show(graphic);
        }
        
    }
         public int getX()
    {
        return x;
    }
    public void setX(int newX)
    {
        int lastX = -1;
        int lastY = -1;
        for (CatBit catBit : catBits) {
            if (lastX == -1) {
                // First cat bit
                lastX = catBit.getX();
                lastY = catBit.getY();
                
                catBit.setX(newX);
            } else {
                int tmpx = lastX, tmpy = lastY;
                
                
                
                lastX = catBit.getX();
                lastY = catBit.getY();
                
                catBit.setX(tmpx);
                catBit.setY(tmpy);
            }
        }
        
        this.x = newX;
    }
    public int getY()
    {
       return y; 
    }
    public void setY(int y)
    {
        int lastX = -1;
        int lastY = -1;
        for (CatBit catBit : catBits) {
            if (lastX == -1) {
                // First cat bit
                lastX = catBit.getX();
                lastY = catBit.getY();
                
                catBit.setY(y);
            } else {
                int tmpx = lastX, tmpy = lastY;
                
                
                
                lastX = catBit.getX();
                lastY = catBit.getY();
                
                catBit.setX(tmpx);
                catBit.setY(tmpy);
            }
        }
        
        this.y = y;
    }
        public boolean collidedWith(Treat treat)
    {
        
      if(((this.x+25 >= treat.x) && (this.x-25 <= treat.x+25))&&((this.y+25 >= treat.y)&&(this.y-25<=treat.y+25)))
      {
          return true;
      }
      else 
      {
          return false;
      }
    }
    
}