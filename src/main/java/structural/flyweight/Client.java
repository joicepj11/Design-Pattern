package structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final String shapes[] = {"O", "R"};
    private static final Color COLORS[] = {Color.red, Color.green, Color.blue};
    private static final boolean fill[] = {true, false};
    private static final String font[] = {"Arial", "Courier"};

    public Client() {
        Container container = getContentPane();
        JButton jButton = new JButton("Draw Shapes");
        final JPanel jPanel = new JPanel();
        container.add(jPanel, BorderLayout.CENTER);
        container.add(jButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics graphics = jPanel.getGraphics();
                try {
                    MyShape myShape = ShapeFactory.getShape(getRandomShape());
                    myShape.draw(graphics, getRandomX(), getRandomY(), getRandomWidth(),
                            getRandomHeight(), getRandomColor(), getRandomFill(),
                            getRandomFont());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    private boolean getRandomFill() {
        return fill[(int) (Math.random() * fill.length)];
    }

    private Color getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 7));
    }

    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 7));
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private String getRandomShape() {
        return shapes[(int) (Math.random()  * shapes.length)];
    }

    private String getRandomFont() {
        return font[(int) (Math.random() * font.length)];
    }

}