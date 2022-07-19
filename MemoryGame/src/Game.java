import javafx.concurrent.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

public class Game extends JFrame{

    private List<Card> cards;
    private List<ImageIcon> images;
    private Card selectedCard;
    private Card c1;
    private Card c2;
    private Timer t;
    long ActualTime = System.currentTimeMillis();
    long executionTime;
    double points;
    int size;

    public Game(int n) {
        size = n;

        setLayout(new BorderLayout());

        int pairs = (n * n) / 2;

        List<Card> cardsList = new ArrayList<Card>();
        List<Integer> values = new ArrayList<Integer>();


        images = new ArrayList<>();
        ImageIcon uk = new ImageIcon("src\\flagi\\uk.png");
        Image image = uk.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        uk.setImage(image);
        images.add(uk);
        ImageIcon ni = new ImageIcon("src\\flagi\\ni.png");
        Image image1 = ni.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ni.setImage(image1);
        images.add(ni);
        ImageIcon sw = new ImageIcon("src\\flagi\\sw.png");
        Image image2 = sw.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        sw.setImage(image2);
        images.add(sw);
        ImageIcon br = new ImageIcon("src\\flagi\\br.png");
        Image image3 = br.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        br.setImage(image3);
        images.add(br);
        ImageIcon it = new ImageIcon("src\\flagi\\it.png");
        Image image4 = it.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        it.setImage(image4);
        images.add(it);
        ImageIcon mex = new ImageIcon("src\\flagi\\mex.png");
        Image image5 = mex.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        mex.setImage(image5);
        images.add(mex);
        ImageIcon pl = new ImageIcon("src\\flagi\\pl.png");
        Image image6 = pl.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        pl.setImage(image6);
        images.add(pl);
        ImageIcon arg = new ImageIcon("src\\flagi\\arg.png");
        Image image8 = arg.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        arg.setImage(image8);
        images.add(arg);



        HashMap<Integer, ImageIcon> hashMap = new HashMap<Integer, ImageIcon>();

        for (int i = 0; i < pairs; i++) {
            values.add(i);
            values.add(i);
            if (i < images.size())
                hashMap.put(i, images.get(i));
            if (i >= images.size())
                hashMap.put(i, images.get((int) (Math.random() * 8)));
        }
        Collections.shuffle(values);

        for (int val : values) {
            Card c = new Card();
            c.setVal(val);
            c.setIm(hashMap.get(val));
            c.addActionListener(e -> {
                selectedCard = c;
                doTurn();
            });
            cardsList.add(c);
        }
        this.cards = cardsList;

        t = new Timer(2000, e ->
        {
            checkCards();
        });

        t.setRepeats(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(n, n));

        for (Card c : cards) {
            c.setIcon(new ImageIcon());
            panel.add(c);

        }

        add(panel, BorderLayout.CENTER);
        setTitle("The Game");
        setPreferredSize(new Dimension(600, 600));
        setLocation(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void doTurn(){
        if (c1 == null && c2 == null){
            c1 = selectedCard;
            c1.setIcon(c1.getIm());

        }

        if (c1 != null && c1 != selectedCard && c2 == null){
            c2 = selectedCard;
            c2.setIcon(c2.getIm());
            t.start();
        }
    }

    public void checkCards(){
        if (c1.getIm() == c2.getIm()){
            c1.setEnabled(false);
            c2.setEnabled(false);
            c1.setMatched(true);
            c2.setMatched(true);
            if (this.isGameWon()){

                new FinalWindow(getPoints(),getSizeOfBoard());
                this.dispose();
            }
        }else{
            c1.setIcon(new ImageIcon());
            c2.setIcon(new ImageIcon());
        }
        c1 = null;
        c2 = null;
    }

    public boolean isGameWon(){
        for(Card c: this.cards){
            if (c.getMatched() == false){
                return false;
            }
        }
        executionTime = System.currentTimeMillis() - ActualTime;
        return true;
    }

    public double getPoints(){
        points = (size*10000000/executionTime);

        return points;
    }

    public int getSizeOfBoard(){
        return size;
    }

}
