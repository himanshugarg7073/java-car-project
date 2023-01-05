import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Car extends Applet implements KeyListener
{
 int x=600,y=360, z;
 public void paint(Graphics g)
 {

  addKeyListener(this);
  setBackground(Color.black);
  /*g.setColor(Color.black);
  g.drawOval(x-2,y+15,7,20);
  g.fillOval(x-2,y+15,7,20);
  g.drawOval(x-2,y+75,7,20);
  g.fillOval(x-2,y+75,7,20);*/
  /*g.setColor(Color.red);
  g.drawRoundRect(x,y,76,105,10,20);
  g.fillRoundRect(x,y,76,105,10,20);
  g.setColor(Color.yellow);
  g.drawRect(x+7,y+75,62,18);
  g.setColor(Color.red);
  g.drawOval(x+4,y+95,6,9); 
  g.drawOval(x+66,y+95,6,9);
  g.fillOval( x+4,y+95,6,9);
  g.fillOval( x+66,y+95,6,9);
  g.setColor(Color.black);
  g.drawRoundRect(x+7,y+35,63,35,10,20);

  g.setColor(Color.yellow);
  g.drawOval(x+4,y+1,9,15);
  g.drawOval(x+3,y+1,9,15);
  g.fillOval(x+63,y+1,9,15);
  g.fillOval(x+4,y+1,9,15);*/
  setBackground(Color.black);
  z=getWidth();
  Color c1=new Color(20,160,200);
  Color c2=new Color(200,60,200);
  g.setColor(c1);
  g.drawLine(0,y+75,z,y+75);
  g.setColor(Color.red);
  g.fillRoundRect(x,y+20,100,40,5,5);
  g.fillArc(x+90,y+20,20,40,270,180);
  g.setColor(Color.BLUE);
  g.fillRoundRect(x+10,y,70,25,10,10);
  g.setColor(Color.white);
  g.fillRect(x+20,y+5,20,25);
  g.fillRect(x+50,y+5,20,25);
  g.setColor(Color.black);
  g.fillRoundRect(x+55,y+10,10,20,10,10);
  g.fillOval(x+10,y+50,25,25);
  g.fillOval(x+60,y+50,25,25);
  g.setColor(Color.white);
  g.fillOval(x+15,y+55,10,10);
  g.fillOval(x+65,y+55,10,10);
    x=x+10; 

 }
 public void keyPressed(KeyEvent ke){
    int KeyCode = ke.getKeyCode();

    switch(KeyCode)
    {
        case KeyEvent.VK_UP:
        if(y>0)
        y=y-1;
        break;
        case KeyEvent.VK_DOWN:
        if(y<getHeight()-105)
        y=y+1;
        break;
        case KeyEvent.VK_LEFT:
        if(x>0)
        x=x-1;
        break;
        case KeyEvent.VK_RIGHT:
        if(x<getWidth()-76)
        x++;
        break;
    }
    repaint();
 }

 public void keyTyped(KeyEvent ke) {
    
 } 

 public void keyReleased(KeyEvent ke){
 }


 

}