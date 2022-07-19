import javax.swing.*;
import java.awt.*;

public class choiceOfSize extends JFrame {
    private JComboBox jcb;
    private JLabel label;
    private JPanel panel1;
    private JPanel panel2;
    private JButton button;
    public byte size;

    public choiceOfSize(){
        setLayout(new BorderLayout());
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new BorderLayout());

        label = new JLabel("Size: ");
        jcb = new JComboBox();
        jcb.addItem(2);
        jcb.addItem(4);
        jcb.addItem(6);
        jcb.addItem(8);
        jcb.addItem(10);



        button = new JButton("  PLAY    ");


        SwingUtilities.invokeLater(() ->{
            button.addActionListener(e -> {
                if(jcb.getSelectedIndex() == 0)
                    size = 2;
                if(jcb.getSelectedIndex() == 1)
                    size = 4;
                if(jcb.getSelectedIndex() == 2)
                    size = 6;
                if(jcb.getSelectedIndex() == 3)
                    size = 8;
                if(jcb.getSelectedIndex() == 4)
                    size = 10;

                Game game = new Game(size);


                this.dispose();
            });
        });

        panel2.add(button,BorderLayout.CENTER);

        panel1.add(label);
        panel1.add(jcb);
        add(panel1,BorderLayout.CENTER);
        add(panel2,BorderLayout.SOUTH);


       setSize(100,100);
        setLocationByPlatform(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public byte getChoice(){
        return size;
    }
}

