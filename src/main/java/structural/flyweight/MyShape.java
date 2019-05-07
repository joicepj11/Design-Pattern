package structural.flyweight;

import java.awt.*;

public interface MyShape {
    void draw(Graphics graphics,int x,int y,int width,int height,Color color,boolean fill,String font);
}
