import java.awt.*;

public class Word extends Shape{
    private String word;

    public void draw(Graphics g){
        g.setColor(g.getColor());
        g.drawString("ni hao fei zai", getMinX(), getMinY());
    }
}
