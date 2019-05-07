package structural.flyweight;

import java.awt.*;

public class MyOval implements MyShape {
    private String label;

    public MyOval(String label) {
        this.label = label;
    }

    @Override
    public void draw(Graphics oval, int x, int y, int width, int height, Color color, boolean fill, String font) {
        oval.setColor(color);
        oval.drawOval(x,y,width,height);
        oval.setFont(new Font(font,12,12));
        oval.drawString(label,x+(width/2),y);
        if(fill){
            oval.fillOval(x,y,width,height);
        }
    }
}
