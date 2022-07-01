import java.applet.*;
import java.awt.*;
public class Fhand extends Applet
{
    private int lastx=0;
    private int lasty=0;
    public boolean mouseDown(Event e,int x,int y)
    {lastx=x;
        lasty=y;
        return true;
    }
    public boolean mouseDrag(Event e,int x,int y)
    {
        Graphics g=getGraphics();
        g.drawLine(lastx,lasty,x,y);
        lastx=x;
        lasty=y;
        return true;
    }
}