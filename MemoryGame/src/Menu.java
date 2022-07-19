import javax.swing.*;
import java.awt.*;
import java.util.IllegalFormatWidthException;

public class Menu {
    private JFrame Window;
    private JButton NewGame;
    private JButton HighScores;
    private JButton Exit;
    private JLabel Title;
    private JLabel Eska;

    public Menu(){
        Window = new JFrame("MEMORY THE GAME");
        Window.setLayout(new BorderLayout());
        JPanel panelT = new JPanel();
        panelT.setLayout(new BorderLayout());

        JPanel panelB = new JPanel();
        panelB.setLayout(new FlowLayout());
        NewGame = new JButton("New Game");
        HighScores = new JButton("High Scores");
        Exit = new JButton("Exit");
        Title = new JLabel("Memory The Game");
        Eska = new JLabel("s18982");

        SwingUtilities.invokeLater(()->{
            NewGame.addActionListener(e->{
                new choiceOfSize();

            });
            HighScores.addActionListener(e->{
                new HSsize();
            });

            Exit.addActionListener(e->{
                Window.dispose();
            });
        });

        panelT.add(Title,BorderLayout.NORTH);
        panelT.add(Eska,BorderLayout.AFTER_LAST_LINE);
        panelB.add(NewGame);
        panelB.add(HighScores);
        panelB.add(Exit);

        Window.add(panelB,BorderLayout.CENTER);
        Window.add(panelT,BorderLayout.NORTH);
        Window.setSize(180,180);
        Window.setLocationByPlatform(true);
        Window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Window.setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}