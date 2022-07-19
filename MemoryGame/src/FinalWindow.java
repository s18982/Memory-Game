import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.List;

public class FinalWindow extends JFrame {
    private JTextPane name;
    private JLabel points;
    private JLabel text;
    private JButton button;
    private JList<Double> two;
    private JList<Double> four;
    private JList<Double> six;
    private JList<Double> eight;
    private JList<Double> ten;

    public FinalWindow(double points, int sizeOfBoard){
        setLayout(new BorderLayout());
        JPanel PointsPanel = new JPanel();
        PointsPanel.setLayout(new BorderLayout());
        this.points = new JLabel("points: "+points);
        text = new JLabel("Your name: ");
        PointsPanel.add(this.points,BorderLayout.CENTER);
        PointsPanel.add(text,BorderLayout.SOUTH);

        JPanel enterName = new JPanel();
        enterName.setLayout(new BorderLayout());
        name = new JTextPane();
        enterName.add(name,BorderLayout.CENTER);

        JPanel but = new JPanel();
        but.setLayout(new BorderLayout());
        button = new JButton("OK");
        button.addActionListener(e->{


            if(sizeOfBoard == 2){
                try {
                    FileWriter zapisz = new FileWriter("2x2.txt",true);
                    zapisz.write(points+"    "+name.getText());
                    zapisz.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if(sizeOfBoard == 4){
                try {
                    FileWriter zapisz = new FileWriter("4x4.txt",true);
                    zapisz.write(points+"    "+name.getText());
                    zapisz.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if(sizeOfBoard == 6){
                try {
                    FileWriter zapisz = new FileWriter("6x6.txt",true);
                    zapisz.write(points+"    "+name.getText());
                    zapisz.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if(sizeOfBoard == 8){
                try {
                   FileWriter zapisz = new FileWriter("8x8.txt",true);
                    zapisz.write(points+"    "+name.getText());
                    zapisz.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if(sizeOfBoard == 10){
                try {
                    FileWriter zapisz = new FileWriter("10x10.txt",true);
                    zapisz.write(points+"    "+name.getText());
                    zapisz.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

            dispose();
        });
        but.add(button,BorderLayout.CENTER);

        add(PointsPanel,BorderLayout.NORTH);
        add(enterName,BorderLayout.CENTER);
        add(but,BorderLayout.SOUTH);

        setSize(100,130);
        setLocationByPlatform(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
