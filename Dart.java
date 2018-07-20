import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 20.07.2018
  * @author 
  */

public class Dart extends JFrame {
  // Anfang Attribute
  private JPanel jPanel1 = new JPanel(null, true);
    private JButton jButton63 = new JButton();
    private JRadioButton jRadioButton1 = new JRadioButton();
    private JRadioButton jRadioButton2 = new JRadioButton();
    private JRadioButton jRadioButton3 = new JRadioButton();
    private JButton jButton64 = new JButton();
  
  private JPanel jPanel2 = new JPanel(null, true);
    private JLabel jLabel1 = new JLabel();
    private JButton jButton1 = new JButton();
    private JNumberField AnzahlSpieler = new JNumberField();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();
    private JButton jButton4 = new JButton();
    private JButton jButton5 = new JButton();
    private JButton jButton6 = new JButton();
    private JButton jButton7 = new JButton();
    private JButton jButton8 = new JButton();
    private JButton jButton9 = new JButton();
    private JButton jButton10 = new JButton();
    private JButton jButton11 = new JButton();
    private JButton jButton12 = new JButton();
    private JButton jButton13 = new JButton();
    private JButton jButton14 = new JButton();
    private JButton jButton15 = new JButton();
    private JButton jButton16 = new JButton();
    private JButton jButton17 = new JButton();
    private JButton jButton18 = new JButton();
    private JButton jButton19 = new JButton();
    private JButton jButton20 = new JButton();
    private JButton jButton21 = new JButton();
    private JButton jButton22 = new JButton();
    private JButton jButton23 = new JButton();
    private JButton jButton24 = new JButton();
    private JButton jButton25 = new JButton();
    private JButton jButton26 = new JButton();
    private JButton jButton27 = new JButton();
    private JButton jButton28 = new JButton();
    private JButton jButton29 = new JButton();
    private JButton jButton30 = new JButton();
    private JButton jButton31 = new JButton();
    private JButton jButton32 = new JButton();
    private JButton jButton33 = new JButton();
    private JButton jButton34 = new JButton();
    private JButton jButton35 = new JButton();
    private JButton jButton36 = new JButton();
    private JButton jButton37 = new JButton();
    private JButton jButton38 = new JButton();
    private JButton jButton39 = new JButton();
    private JButton jButton40 = new JButton();
    private JButton jButton41 = new JButton();
    private JButton jButton42 = new JButton();
    private JButton jButton43 = new JButton();
    private JButton jButton44 = new JButton();
    private JButton jButton45 = new JButton();
    private JButton jButton46 = new JButton();
    private JButton jButton47 = new JButton();
    private JButton jButton48 = new JButton();
    private JButton jButton49 = new JButton();
    private JButton jButton50 = new JButton();
    private JButton jButton51 = new JButton();
    private JButton jButton52 = new JButton();
    private JButton jButton53 = new JButton();
    private JButton jButton54 = new JButton();
    private JButton jButton55 = new JButton();
    private JButton jButton56 = new JButton();
    private JButton jButton57 = new JButton();
    private JButton jButton58 = new JButton();
    private JButton jButton59 = new JButton();
    private JButton jButton60 = new JButton();
    private JButton jButton61 = new JButton();
    private JButton jButton62 = new JButton();
  private JPanel jPanel3 = new JPanel(null, true);
  
  // Anfang meine Attribute
  
  private JTextField[] Points = new JTextField[5];
  private int[] PlayerPoints  = new int[5];
  private JTextField[] Player = new JTextField[5];
  private int Playercheck = 0;
  private int wurf = 0;
  private int n = 1;
  private JTextArea[] History = new JTextArea[5];
  private JPanel jPanel4 = new JPanel(null, true);
  
  // Ende Attribute
  
  public Dart(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1920; 
    int frameHeight = 1080;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jPanel1.setBounds(8, 8, 692, 1000);
    jPanel1.setOpaque(false);
    cp.add(jPanel1);
    jPanel2.setBounds(712, 40, 340, 1000);
    jPanel2.setOpaque(false);
    jPanel2.setVisible(false);
    cp.add(jPanel2);
    jPanel3.setBounds(1064, 8, 812, 1000);
    jPanel3.setOpaque(false);
    cp.add(jPanel3);
    jLabel1.setBounds(8, 8, 318, 28);
    jLabel1.setText("Anzahl Spieler Eingeben (max 5.)");
    jPanel4.add(jLabel1);
    jButton1.setBounds(120, 64, 75, 25);
    jButton1.setText("Bestätigen");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jPanel4.add(jButton1);
    AnzahlSpieler.setBounds(8, 32, 315, 20);
    AnzahlSpieler.setText("");
    jPanel4.add(AnzahlSpieler);
    jButton2.setBounds(8, 96, 75, 25);
    jButton2.setText("1"); 
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton2);
    jButton3.setBounds(88, 96, 75, 25);
    jButton3.setText("2");  
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton3);
    jButton4.setBounds(168, 96, 75, 25);
    jButton4.setText("3"); 
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton4);
    jButton5.setBounds(248, 96, 75, 25);
    jButton5.setText("4");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton5);
    jButton6.setBounds(8, 128, 75, 25);
    jButton6.setText("5"); 
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton6);
    jButton7.setBounds(88,128, 75, 25);
    jButton7.setText("6");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton7);
    jButton8.setBounds(168, 128, 75, 25); 
    jButton8.setText("7");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton8);
    jButton9.setBounds(248, 128, 75, 25);
    jButton9.setText("8");    
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton9);
    jButton10.setBounds(8, 160, 75, 25);
    jButton10.setText("9"); 
    jButton10.setMargin(new Insets(2, 2, 2, 2));
    jButton10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton10_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton10);
    jButton11.setBounds(88, 160, 75, 25); 
    jButton11.setText("10");
    jButton11.setMargin(new Insets(2, 2, 2, 2));
    jButton11.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton11_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton11);
    jButton12.setBounds(168, 160, 75, 25);     
    jButton12.setText("11");
    jButton12.setMargin(new Insets(2, 2, 2, 2));
    jButton12.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton12_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton12);
    jButton13.setBounds(248, 160, 75, 25);
    jButton13.setText("12");
    jButton13.setMargin(new Insets(2, 2, 2, 2));
    jButton13.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton13_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton13);
    jButton14.setBounds(8, 192, 75, 25);
    jButton14.setText("13");
    jButton14.setMargin(new Insets(2, 2, 2, 2));
    jButton14.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton14_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton14);
    jButton15.setBounds(88, 192, 75, 25);
    jButton15.setText("14");
    jButton15.setMargin(new Insets(2, 2, 2, 2));
    jButton15.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton15_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton15);
    jButton16.setBounds(168, 192, 75, 25);
    jButton16.setText("15");
    jButton16.setMargin(new Insets(2, 2, 2, 2));
    jButton16.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton16_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton16);
    jButton17.setBounds(248, 192, 75, 25);
    jButton17.setText("16");
    jButton17.setMargin(new Insets(2, 2, 2, 2));
    jButton17.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton17_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton17);
    jButton18.setBounds(8, 224, 75, 25);
    jButton18.setText("17");
    jButton18.setMargin(new Insets(2, 2, 2, 2));
    jButton18.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton18_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton18);
    jButton19.setBounds(88, 224, 75, 25);
    jButton19.setText("18");
    jButton19.setMargin(new Insets(2, 2, 2, 2));
    jButton19.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton19_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton19);
    jButton20.setBounds(168, 224, 73, 25);
    jButton20.setText("19");
    jButton20.setMargin(new Insets(2, 2, 2, 2));
    jButton20.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton20_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton20);
    jButton21.setBounds(248, 224, 75, 25);
    jButton21.setText("20");
    jButton21.setMargin(new Insets(2, 2, 2, 2));
    jButton21.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton21_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton21);
    jButton22.setBounds(8, 256, 73, 25);
    jButton22.setText("21");
    jButton22.setMargin(new Insets(2, 2, 2, 2));
    jButton22.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton22_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton22);
    jButton23.setBounds(88, 256, 75, 25);
    jButton23.setText("22");
    jButton23.setMargin(new Insets(2, 2, 2, 2));
    jButton23.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton23_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton23);
    jButton24.setBounds(168, 256, 75, 25);
    jButton24.setText("23");
    jButton24.setMargin(new Insets(2, 2, 2, 2));
    jButton24.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton24_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton24);
    jButton25.setBounds(248, 256, 75, 25);
    jButton25.setText("24");
    jButton25.setMargin(new Insets(2, 2, 2, 2));
    jButton25.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton25_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton25);
    jButton26.setBounds(8, 288, 75, 25);
    jButton26.setText("25");
    jButton26.setMargin(new Insets(2, 2, 2, 2));
    jButton26.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton26_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton26);
    jButton27.setBounds(88, 288, 75, 25);
    jButton27.setText("26");
    jButton27.setMargin(new Insets(2, 2, 2, 2));
    jButton27.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton27_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton27);
    jButton28.setBounds(168, 288, 75, 25);
    jButton28.setText("27");
    jButton28.setMargin(new Insets(2, 2, 2, 2));
    jButton28.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton28_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton28);
    jButton29.setBounds(248, 288, 75, 25);
    jButton29.setText("28");
    jButton29.setMargin(new Insets(2, 2, 2, 2));
    jButton29.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton29_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton29);
    jButton30.setBounds(8, 320, 75, 25);
    jButton30.setText("29");
    jButton30.setMargin(new Insets(2, 2, 2, 2));
    jButton30.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton30_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton30);
    jButton31.setBounds(88, 320, 75, 25);
    jButton31.setText("30");
    jButton31.setMargin(new Insets(2, 2, 2, 2));
    jButton31.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton31_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton31);
    jButton32.setBounds(168, 320, 75, 25);
    jButton32.setText("31");
    jButton32.setMargin(new Insets(2, 2, 2, 2));
    jButton32.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton32_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton32);
    jButton33.setBounds(248, 320, 75, 25);
    jButton33.setText("32");
    jButton33.setMargin(new Insets(2, 2, 2, 2));
    jButton33.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton33_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton33);
    jButton34.setBounds(8, 352, 75, 25);
    jButton34.setText("33");
    jButton34.setMargin(new Insets(2, 2, 2, 2));
    jButton34.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton34_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton34);
    jButton35.setBounds(88, 352, 75, 25);
    jButton35.setText("34");
    jButton35.setMargin(new Insets(2, 2, 2, 2));
    jButton35.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton35_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton35);
    jButton36.setBounds(168, 352, 75, 25);
    jButton36.setText("35");
    jButton36.setMargin(new Insets(2, 2, 2, 2));
    jButton36.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton36_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton36);
    jButton37.setBounds(248, 352, 73, 25);
    jButton37.setText("36");
    jButton37.setMargin(new Insets(2, 2, 2, 2));
    jButton37.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton37_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton37);
    jButton38.setBounds(8, 384, 75, 25);
    jButton38.setText("37");
    jButton38.setMargin(new Insets(2, 2, 2, 2));
    jButton38.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton38_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton38);
    jButton39.setBounds(88, 384, 75, 25);
    jButton39.setText("38");
    jButton39.setMargin(new Insets(2, 2, 2, 2));
    jButton39.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton39_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton39);
    jButton40.setBounds(168, 384, 75, 25);
    jButton40.setText("39");
    jButton40.setMargin(new Insets(2, 2, 2, 2));
    jButton40.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton40_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton40);
    jButton41.setBounds(248, 384, 75, 25);
    jButton41.setText("40");
    jButton41.setMargin(new Insets(2, 2, 2, 2));
    jButton41.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton41_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton41);
    jButton42.setBounds(8, 416, 75, 25);
    jButton42.setText("41");
    jButton42.setMargin(new Insets(2, 2, 2, 2));
    jButton42.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton42_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton42);
    jButton43.setBounds(88, 416, 75, 25);
    jButton43.setText("42");
    jButton43.setMargin(new Insets(2, 2, 2, 2));
    jButton43.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton43_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton43);
    jButton44.setBounds(168, 416, 75, 25);
    jButton44.setText("43");
    jButton44.setMargin(new Insets(2, 2, 2, 2));
    jButton44.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton44_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton44);
    jButton45.setBounds(248, 416, 75, 25);
    jButton45.setText("44");
    jButton45.setMargin(new Insets(2, 2, 2, 2));
    jButton45.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton45_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton45);
    jButton46.setBounds(8, 448, 75, 25);
    jButton46.setText("45");
    jButton46.setMargin(new Insets(2, 2, 2, 2));
    jButton46.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton46_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton46);
    jButton47.setBounds(88, 448, 75, 25);
    jButton47.setText("46");
    jButton47.setMargin(new Insets(2, 2, 2, 2));
    jButton47.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton47_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton47);
    jButton48.setBounds(168, 448, 75, 25);
    jButton48.setText("47");
    jButton48.setMargin(new Insets(2, 2, 2, 2));
    jButton48.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton48_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton48);
    jButton49.setBounds(248, 448, 75, 25);
    jButton49.setText("48");
    jButton49.setMargin(new Insets(2, 2, 2, 2));
    jButton49.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton49_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton49);
    jButton50.setBounds(8, 480, 75, 25);
    jButton50.setText("49");
    jButton50.setMargin(new Insets(2, 2, 2, 2));
    jButton50.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton50_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton50);
    jButton51.setBounds(88, 480, 75, 25);
    jButton51.setText("50");
    jButton51.setMargin(new Insets(2, 2, 2, 2));
    jButton51.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton51_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton51);
    jButton52.setBounds(168, 480, 75, 25);
    jButton52.setText("51");
    jButton52.setMargin(new Insets(2, 2, 2, 2));
    jButton52.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton52_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton52);
    jButton53.setBounds(248, 480, 75, 25);
    jButton53.setText("52");
    jButton53.setMargin(new Insets(2, 2, 2, 2));
    jButton53.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton53_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton53);
    jButton54.setBounds(8, 512, 75, 25);
    jButton54.setText("53");
    jButton54.setMargin(new Insets(2, 2, 2, 2));
    jButton54.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton54_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton54);
    jButton55.setBounds(88, 512, 75, 25);
    jButton55.setText("54");
    jButton55.setMargin(new Insets(2, 2, 2, 2));
    jButton55.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton55_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton55);
    jButton56.setBounds(168, 512, 75, 25);
    jButton56.setText("55");
    jButton56.setMargin(new Insets(2, 2, 2, 2));
    jButton56.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton56_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton56);
    jButton57.setBounds(248, 512, 75, 25);
    jButton57.setText("56");
    jButton57.setMargin(new Insets(2, 2, 2, 2));
    jButton57.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton57_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton57);
    jButton58.setBounds(8, 544, 75, 25);
    jButton58.setText("57");
    jButton58.setMargin(new Insets(2, 2, 2, 2));
    jButton58.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton58_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton58);
    jButton59.setBounds(88, 544, 75, 25);
    jButton59.setText("58");
    jButton59.setMargin(new Insets(2, 2, 2, 2));
    jButton59.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton59_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton59);
    jButton60.setBounds(168, 544, 75, 25);
    jButton60.setText("59");
    jButton60.setMargin(new Insets(2, 2, 2, 2));
    jButton60.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton60_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton60);
    jButton61.setBounds(248, 544, 75, 25);
    jButton61.setText("60");
    jButton61.setMargin(new Insets(2, 2, 2, 2));
    jButton61.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton61_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton61);
    jButton62.setBounds(8, 576, 315, 25);
    jButton62.setText("MISS");
    jButton62.setMargin(new Insets(2, 2, 2, 2));
    jButton62.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton62_ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton62);
    jButton63.setBounds(16, 128, 659, 25);
    jButton63.setText("Bestätige Namen");
    jButton63.setMargin(new Insets(2, 2, 2, 2));
    jButton63.setVisible(false);
    jButton63.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton63_ActionPerformed(evt);
      }
    });
    jPanel1.add(jButton63);
    jPanel4.setBounds(712, 8, 340, 132);
    jPanel4.setOpaque(false);
    cp.add(jPanel4);
    jRadioButton1.setBounds(16, 168, 84, 20);
    jRadioButton1.setText("501");
    jRadioButton1.setOpaque(false);
    jRadioButton1.setVisible(false);
    jPanel1.add(jRadioButton1);
    jRadioButton2.setBounds(112, 168, 68, 20);
    jRadioButton2.setText("301");
    jRadioButton2.setOpaque(false);
    jRadioButton2.setVisible(false);
    jPanel1.add(jRadioButton2);
    jRadioButton3.setBounds(200, 168, 172, 20);
    jRadioButton3.setText("Lenas Kuddelmuddel");
    jRadioButton3.setOpaque(false);
    jRadioButton3.setVisible(false);
    jPanel1.add(jRadioButton3);
    jButton64.setBounds(16, 192, 347, 25);
    jButton64.setText("Bestätige Regeln");
    jButton64.setVisible(false);
    jButton64.setMargin(new Insets(2, 2, 2, 2));
    jButton64.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton64_ActionPerformed(evt);
      }
    });
    jPanel1.add(jButton64);
    // Ende Komponenten
    
    setVisible(true);
    
  } // end of public Dart
  
  // Anfang Methoden
  
  public void init(){
    int numberPlayer = AnzahlSpieler.getInt();
    for (int i = 0;i<numberPlayer ;i++ ) {
      Player[i] = new JTextField();
      Player[i].setBounds((jPanel1.getWidth()/5*i)+15,25, 125, 20);
      Player[i].setText("Name Eingeben");
      Player[i].setEditable(true);
      Player[i].setVisible(true);
      jPanel1.add(Player[i]);
      
      jRadioButton1.setVisible(false);
      jRadioButton2.setVisible(false);
      jRadioButton3.setVisible(false);
      AnzahlSpieler.setVisible(false);
      jButton1.setVisible(false);
      jLabel1.setVisible(false);
      jPanel2.setVisible(true);
      jPanel4.setVisible(false);
      jButton63.setVisible(true);
      
      Points[i] = new JTextField(); 
      Points[i].setBounds((jPanel1.getWidth()/5*i)+15,50,125,20);
      Points[i].setText("510");
      Points[i].setEditable(false);
      Points[i].setVisible(false);
      jPanel1.add(Points[i]);
      
      History[i] = new JTextArea();
      History[i].setBounds((jPanel1.getWidth()/5*i)+15,50,125,900);
      History[i].setVisible(false);
      jPanel3.add(History[i]);
      History[i].setText("History"+"\n");
      History[i].setEditable(false);
    } // end of for 
    int j = 0;
    
  }
  
  public void points(int p){
    if (Points[Playercheck].getText().contains("Platz")==true) {
      if (Playercheck < AnzahlSpieler.getInt()-1 ) {
        ++Playercheck;
      }else {
        Playercheck=0;
      }
      wurf = 0;
    }
    
    if (wurf >= 3) {
      wurf = 0;
      if (Playercheck < AnzahlSpieler.getInt()-1 ) {
        ++Playercheck;
      }else {
        Playercheck=0;
      }
    }
    
    if (Points[Playercheck].getText().contains("Platz")==false) {
      
      int tmp=Integer.parseInt(Points[Playercheck].getText());
      if (tmp-p == 0) {
        Points[Playercheck].setText(n + ". Platz");
        History[Playercheck].append(n + ". Platz"+"\n");
        n++;
      }else if (tmp-p>0) {
        Points[Playercheck].setText(""+(tmp-p));
        History[Playercheck].append(tmp-p+"\n");
      }else{
        History[Playercheck].append("0"+"\n");
        } 
      // end of if

          wurf++;
    }
  }
  
  public static void main(String[] args) {
    new Dart("Dart");
  } // end of main
  
  
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    init();
  } // end of jButton1_ActionPerformed
  
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 1;
    points(p);
    
  } // end of jButton2_ActionPerformed
  
  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 2;
    points(p);
  } // end of jButton3_ActionPerformed
  
  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 3;
    points(p);
    
  } // end of jButton4_ActionPerformed
  
  public void jButton5_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 4;
    points(p);
  } // end of jButton5_ActionPerformed
  
  public void jButton6_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 5;
    points(p);
  } // end of jButton6_ActionPerformed
  
  public void jButton7_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 6;
    points(p);
  } // end of jButton7_ActionPerformed
  
  public void jButton8_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 7;
    points(p);
  } // end of jButton8_ActionPerformed
  
  public void jButton9_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 8;
    points(p);
  } // end of jButton9_ActionPerformed
  
  public void jButton10_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 9;
    points(p);
  } // end of jButton10_ActionPerformed
  
  public void jButton11_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 10;
    points(p);
  } // end of jButton11_ActionPerformed
  
  public void jButton12_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 11;
    points(p);
  } // end of jButton12_ActionPerformed
  
  public void jButton13_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 12;
    points(p);
  } // end of jButton13_ActionPerformed
  
  public void jButton14_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 13;
    points(p);
  } // end of jButton14_ActionPerformed
  
  public void jButton15_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 14;
    points(p);
  } // end of jButton15_ActionPerformed
  
  public void jButton16_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 15;
    points(p);
  } // end of jButton16_ActionPerformed
  
  public void jButton17_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 16;
    points(p);
  } // end of jButton17_ActionPerformed
  
  public void jButton18_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 17;
    points(p);
  } // end of jButton18_ActionPerformed
  
  public void jButton19_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 18;
    points(p);
  } // end of jButton19_ActionPerformed
  
  public void jButton20_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 19;
    points(p);
  } // end of jButton20_ActionPerformed
  
  public void jButton21_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 20;
    points(p);
  } // end of jButton21_ActionPerformed
  
  public void jButton22_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 21;
    points(p);
  } // end of jButton22_ActionPerformed
  
  public void jButton23_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 22;
    points(p);
  } // end of jButton23_ActionPerformed
  
  public void jButton24_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 23;
    points(p);
  } // end of jButton24_ActionPerformed
  
  public void jButton25_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 24;
    points(p);
  } // end of jButton25_ActionPerformed
  
  public void jButton26_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 25;
    points(p);
  } // end of jButton26_ActionPerformed
  
  public void jButton27_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 26;
    points(p);
  } // end of jButton27_ActionPerformed
  
  public void jButton28_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 27;
    points(p);
  } // end of jButton28_ActionPerformed
  
  public void jButton29_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 28;
    points(p);
  } // end of jButton29_ActionPerformed
  
  public void jButton30_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 29;
    points(p);
  } // end of jButton30_ActionPerformed
  
  public void jButton31_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 30;
    points(p);
  } // end of jButton31_ActionPerformed
  
  public void jButton32_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 31;
    points(p);
  } // end of jButton32_ActionPerformed
  
  public void jButton33_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 32;
    points(p);
  } // end of jButton33_ActionPerformed
  
  public void jButton34_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 33;
    points(p);
  } // end of jButton34_ActionPerformed
  
  public void jButton35_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 34;
    points(p);
  } // end of jButton35_ActionPerformed
  
  public void jButton36_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 35;
    points(p);
  } // end of jButton36_ActionPerformed
  
  public void jButton37_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 36;
    points(p);
  } // end of jButton37_ActionPerformed
  
  public void jButton38_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 37;
    points(p);
  } // end of jButton38_ActionPerformed
  
  public void jButton39_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 38;
    points(p);
  } // end of jButton39_ActionPerformed
  
  public void jButton40_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 39;
    points(p);
  } // end of jButton40_ActionPerformed
  
  public void jButton41_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 40;
    points(p);
  } // end of jButton41_ActionPerformed
  
  public void jButton42_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 41;
    points(p);
  } // end of jButton42_ActionPerformed
  
  public void jButton43_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 42;
    points(p);
  } // end of jButton43_ActionPerformed
  
  public void jButton44_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 43;
    points(p);
  } // end of jButton44_ActionPerformed
  
  public void jButton45_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 44;
    points(p);
  } // end of jButton45_ActionPerformed
  
  public void jButton46_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 45;
    points(p);
  } // end of jButton46_ActionPerformed
  
  public void jButton47_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 46;
    points(p);
  } // end of jButton47_ActionPerformed
  
  public void jButton48_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 47;
    points(p);
  } // end of jButton48_ActionPerformed
  
  public void jButton49_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 48;
    points(p);
  } // end of jButton49_ActionPerformed
  
  public void jButton50_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 49;
    points(p);
  } // end of jButton50_ActionPerformed
  
  public void jButton51_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 50;
    points(p);
  } // end of jButton51_ActionPerformed
  
  public void jButton52_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 51;
    points(p);
  } // end of jButton52_ActionPerformed
  
  public void jButton53_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 52;
    points(p);
  } // end of jButton53_ActionPerformed
  
  public void jButton54_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 53;
    points(p);
  } // end of jButton54_ActionPerformed
  
  public void jButton55_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 54;
    points(p);
  } // end of jButton55_ActionPerformed
  
  public void jButton56_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 55;
    points(p);
  } // end of jButton56_ActionPerformed
  
  public void jButton57_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 56;
    points(p);
  } // end of jButton57_ActionPerformed
  
  public void jButton58_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 57;
    points(p);
  } // end of jButton58_ActionPerformed
  
  public void jButton59_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 58;
    points(p);
  } // end of jButton59_ActionPerformed
  
  public void jButton60_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 59;
    points(p);
  } // end of jButton60_ActionPerformed
  
  public void jButton61_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 60;
    points(p);
  } // end of jButton61_ActionPerformed
  
  public void jButton62_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int p = 0;
    points(p);
  } // end of jButton62_ActionPerformed
  
  public void jButton63_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    for (int i = 0;i<5 ;i++ ) {
      History[i].setVisible(true);
      History[i].append(Player[i].getText()+"\n");
    } // end of for
    jRadioButton1.setVisible(true);
    jRadioButton2.setVisible(true);
    jRadioButton3.setVisible(true);
    jButton64.setVisible(true);
    jButton63.setVisible(false);
  } // end of jButton63_ActionPerformed

  

  public void jButton64_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jButton64.setVisible(false);
    for (int i = 0;i<5 ;i++ ) {
      if (jRadioButton1.isSelected()) {
        Points[i].setText("501");
      } // end of if
      if (jRadioButton2.isSelected()) {
        Points[i].setText("301");
      } // end of if
       Points[i].setVisible(true);
    } // end of for
     jRadioButton1.setVisible(false);
    jRadioButton2.setVisible(false);
    jRadioButton3.setVisible(false);
  } // end of jButton64_ActionPerformed

  // Ende Methoden
} // end of class Dart
