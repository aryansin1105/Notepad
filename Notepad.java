import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

import javax.swing.*;
public class Notepad implements ActionListener{  
JFrame f;  
JMenuBar menuBar;
JMenu m1,m2,m3,m4,m5;
JMenuItem m1t1,m1t2,m1t3,m1t4,m2t1,m2t2,m2t3,m2t4,m3t1,m3t2,m4t1,m4t2,m5t1,m5t2,m5t3;
JTextArea area;
Notepad(){  
f=new JFrame("Notepad");
          
menuBar = new JMenuBar();

m1 = new JMenu("File");
m2 = new JMenu("Edit");
m3 = new JMenu("Format");
m4 = new JMenu("View");
m5 = new JMenu("Help");

m1t1 = new JMenuItem("New");
m1t2 = new JMenuItem("Open");
m1t3 = new JMenuItem("Save");
m1t4 = new JMenuItem("Exit");
m2t1 = new JMenuItem("Undo");
m2t2 = new JMenuItem("Redo");
m2t3 = new JMenuItem("Cut");
m2t4 = new JMenuItem("Copy");
m3t1 = new JMenuItem("Font Style");
m3t2 = new JMenuItem("Font Size");
m4t1 = new JMenuItem("Status Bar");
m4t2 = new JMenuItem("Toolbars");
m5t1 = new JMenuItem("About Us");
m5t2 = new JMenuItem("Feedback");
m5t3 = new JMenuItem("Visit Our Website");

area = new JTextArea();

m1.add(m1t1);m1.add(m1t2);m1.add(m1t3);m1.add(m1t4);
m2.add(m2t1);m2.add(m2t2);m2.add(m2t3);m2.add(m2t4);
m3.add(m3t1);m3.add(m3t2);
m4.add(m4t1);m4.add(m4t2);
m5.add(m5t1);m5.add(m5t2);m5.add(m5t3);

menuBar.add(m1);menuBar.add(m2);menuBar.add(m3);menuBar.add(m4);menuBar.add(m5);

f.setJMenuBar(menuBar);
f.add(area,BorderLayout.CENTER);
          
m1t1.addActionListener(this);
m1t2.addActionListener(this);
m1t3.addActionListener(this);
m1t4.addActionListener(this);
m2t1.addActionListener(this);
m2t2.addActionListener(this);
m2t3.addActionListener(this);
m2t4.addActionListener(this);
m3t1.addActionListener(this);
m3t2.addActionListener(this);
m4t1.addActionListener(this);
m4t2.addActionListener(this);
m5t1.addActionListener(this);
m5t2.addActionListener(this);
m5t3.addActionListener(this);


f.setSize(400,500);  
f.setVisible(true);  
}  
  
public static void main(String[] args) {  
new Notepad();  
}

@Override
public void actionPerformed(ActionEvent e) {
    if(e.getSource() == m1t1){
        new Notepad();
    }else if(e.getSource() == m1t2){
        String name = JOptionPane.showInputDialog("file directory");
        try {
            area.read(new InputStreamReader(Objects.requireNonNull(
                    getClass().getResourceAsStream(name))), null);
        }
        catch (IOException ef) {
            ef.printStackTrace();
        }
    }else if(e.getSource() == m1t3){
        String name = JOptionPane.showInputDialog("filename");
        try {
            FileWriter Writer = new FileWriter(name);
            Writer.write(area.getText());
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }else if(e.getSource() == m1t4){
        System.exit(0);
    }else if(e.getSource() == m2t1){

    }else if(e.getSource() == m2t2){

    }else if(e.getSource() == m2t3){

    }else if(e.getSource() == m2t4){

    }else if(e.getSource() == m3t1){

    }else if(e.getSource() == m3t2){

    }else if(e.getSource() == m4t1){

    }else if(e.getSource() == m4t2){

    }else if(e.getSource() == m5t1){
        area.setText("This is editing gui program developed by java");
    }else if(e.getSource() == m5t2){
        String feed = JOptionPane.showInputDialog("Feedback");
        BufferedWriter out;
        try {
            out = new BufferedWriter(new FileWriter("Feedback", true));
            out.write(feed+"\n");
            out.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }else{
        if (Desktop.isDesktopSupported()) {
      
         Desktop desktop = Desktop.getDesktop();
         try {
            URI uri = new URI("https://en.wikipedia.org/wiki/Windows_Notepad");
            desktop.browse(uri);
         } catch (IOException excp) {
            excp.printStackTrace();
         } catch (URISyntaxException excp) {
            excp.printStackTrace();
         }
      }
    }
}  
}  