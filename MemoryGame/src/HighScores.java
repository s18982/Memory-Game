import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class HighScores extends JFrame {
    JPanel jPanel;
    JScrollPane jScrollPane;
    JLabel jLabel;
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    List<JLabel> jLabelList;
    public HighScores(int n){
        setLayout(new BorderLayout());

        if(n == 2){

            try {
                archivo = new File ("2x2.txt");
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);

                ArrayList<String> lines = new ArrayList<>();
                jLabelList = new ArrayList<JLabel>();
                String line;
                int i = 0;
                while((line=br.readLine())!=null) {
                    //System.out.println(line);
                    lines.add(line);
                    jLabel = new JLabel(lines.get(i));
                    i++;
                    jLabelList.add(jLabel);
                }

            } catch(Exception e) {
                e.printStackTrace();
            } finally {
                try{
                    if( null != fr ) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

            jPanel = new JPanel();
            jPanel.setLayout(new FlowLayout());
            for( JLabel i :jLabelList){
                jPanel.add(i);
                jPanel.add(new JLabel("; "));
            }
            add(jPanel);

            setSize(100,350);
            setLocationByPlatform(true);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setVisible(true);

        }else
            if(n == 4){
                try {
                    archivo = new File ("4x4.txt");
                    fr = new FileReader (archivo);
                    br = new BufferedReader(fr);

                    ArrayList<String> lines = new ArrayList<>();
                    jLabelList = new ArrayList<JLabel>();
                    String line;
                    int i = 0;
                    while((line=br.readLine())!=null) {
                        //System.out.println(line);
                        lines.add(line);
                        jLabel = new JLabel(lines.get(i));
                        i++;
                        jLabelList.add(jLabel);
                    }

                } catch(Exception e) {
                    e.printStackTrace();
                } finally {
                    try{
                        if( null != fr ) {
                            fr.close();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }

                jPanel = new JPanel();
                jPanel.setLayout(new FlowLayout());
                for( JLabel i :jLabelList){
                    jPanel.add(i);
                    jPanel.add(new JLabel("; "));
                }
                add(jPanel);

                setSize(100,350);
                setLocationByPlatform(true);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                setVisible(true);
            }else
            if(n == 6){
                try {
                    archivo = new File ("6x6.txt");
                    fr = new FileReader (archivo);
                    br = new BufferedReader(fr);

                    ArrayList<String> lines = new ArrayList<>();
                    jLabelList = new ArrayList<JLabel>();
                    String line;
                    int i = 0;
                    while((line=br.readLine())!=null) {
                        //System.out.println(line);
                        lines.add(line);
                        jLabel = new JLabel(lines.get(i));
                        i++;
                        jLabelList.add(jLabel);
                    }

                } catch(Exception e) {
                    e.printStackTrace();
                } finally {
                    try{
                        if( null != fr ) {
                            fr.close();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }

                jPanel = new JPanel();
                jPanel.setLayout(new FlowLayout());
                for( JLabel i :jLabelList){
                    jPanel.add(i);
                    jPanel.add(new JLabel("; "));
                }
                add(jPanel);

                setSize(100,350);
                setLocationByPlatform(true);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                setVisible(true);
            }else
            if(n == 8){
                try {
                    archivo = new File ("8x8.txt");
                    fr = new FileReader (archivo);
                    br = new BufferedReader(fr);

                    ArrayList<String> lines = new ArrayList<>();
                    jLabelList = new ArrayList<JLabel>();
                    String line;
                    int i = 0;
                    while((line=br.readLine())!=null) {
                        //System.out.println(line);
                        lines.add(line);
                        jLabel = new JLabel(lines.get(i));
                        i++;
                        jLabelList.add(jLabel);
                    }

                } catch(Exception e) {
                    e.printStackTrace();
                } finally {
                    try{
                        if( null != fr ) {
                            fr.close();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }

                jPanel = new JPanel();
                jPanel.setLayout(new FlowLayout());
                for( JLabel i :jLabelList){
                    jPanel.add(i);
                    jPanel.add(new JLabel("; "));
                }
                add(jPanel);

                setSize(100,350);
                setLocationByPlatform(true);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                setVisible(true);
            }else
            if(n == 10){
                try {
                    archivo = new File ("10x10.txt");
                    fr = new FileReader (archivo);
                    br = new BufferedReader(fr);

                    ArrayList<String> lines = new ArrayList<>();
                    jLabelList = new ArrayList<JLabel>();
                    String line;
                    int i = 0;
                    while((line=br.readLine())!=null) {
                        //System.out.println(line);
                        lines.add(line);
                        jLabel = new JLabel(lines.get(i));
                        i++;
                        jLabelList.add(jLabel);
                    }

                } catch(Exception e) {
                    e.printStackTrace();
                } finally {
                    try{
                        if( null != fr ) {
                            fr.close();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }

                jPanel = new JPanel();
                jPanel.setLayout(new FlowLayout());
                for( JLabel i :jLabelList){
                    jPanel.add(i);
                    jPanel.add(new JLabel("; "));
                }
                add(jPanel);

                setSize(100,350);
                setLocationByPlatform(true);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                setVisible(true);
            }
    }
}
