import javax.swing.*;  
public class Notepad {  
JFrame f;  
JMenuBar menuBar;
JMenu m1,m2,m3,m4,m5;
JMenuItem m1t1,m1t2,m1t3,m1t4,m2t1,m2t2,m2t3,m2t4,m3t1,m3t2,m4t1,m4t2,m5t1,m5t2,m5t3;
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
m3t1 = new JMenuItem("Word Wrap On/Off");
m3t2 = new JMenuItem("Font Size");
m4t1 = new JMenuItem("Status Bar");
m4t2 = new JMenuItem("Toolbars");
m5t1 = new JMenuItem("About Us");
m5t2 = new JMenuItem("Feedback");
m5t3 = new JMenuItem("Visit Our Website");

m1.add(m1t1);m1.add(m1t2);m1.add(m1t3);m1.add(m1t4);
m2.add(m2t1);m2.add(m2t2);m2.add(m2t3);m2.add(m2t4);
m3.add(m3t1);m3.add(m3t2);
m4.add(m4t1);m4.add(m4t2);
m5.add(m5t1);m5.add(m5t2);m5.add(m5t3);

menuBar.add(m1);menuBar.add(m2);menuBar.add(m3);menuBar.add(m4);menuBar.add(m5);

f.add(menuBar);

          
f.setSize(400,500);  
f.setLayout(null); 
f.setVisible(true);  
}  
  
public static void main(String[] args) {  
new Notepad();  
}  
}  