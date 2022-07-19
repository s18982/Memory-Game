import javax.swing.*;
import java.awt.*;

public class Card extends JButton{
    private int val;
    private boolean matched = false;
    private ImageIcon im;


    public void setVal(int val){
        this.val = val;
    }

    public int getVal(){
        return this.val;
    }


    public void setMatched(boolean matched){
        this.matched = matched;
    }

    public boolean getMatched(){
        return this.matched;
    }
    public void setIm(ImageIcon image){
       this.im = image;
       im.getImage().getScaledInstance(20,20,20);
    }
    public ImageIcon getIm(){
        return this.im;
    }

}
