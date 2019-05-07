package structural.flyweight;

import java.awt.*;

public class MyRectangle implements MyShape {
    String label;

    public MyRectangle(String label) {
        this.label = label;
    }

    @Override
    public void draw(Graphics rectangle, int x, int y, int width, int height, Color color, boolean fill, String font) {
        rectangle.setColor(color);
        rectangle.drawRect(x,y,width,height);
        rectangle.setFont(new Font(font,12,12));
        rectangle.drawString(label,x+(width/2),y);
        if(fill){
            rectangle.fillRect(x,y,width,height);
        }
    }
}
