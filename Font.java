
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.*;

public class Font {
    JFrame frame;
    JPanel p1,p2,p3;
    Font(){
        frame = new JFrame("Font");

        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        final DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("C");  
          l1.addElement("C++");  
          l1.addElement("Java");  
          l1.addElement("PHP");  
          final JList<String> list1 = new JList<>(l1);  
          list1.setBounds(100,100, 75,75);  
          DefaultListModel<String> l2 = new DefaultListModel<>();  
          l2.addElement("Turbo C++");  
          l2.addElement("Struts");  
          l2.addElement("Spring");  
          l2.addElement("YII");  
          final JList<String> list2 = new JList<>(l2);  
          list2.setBounds(100,200, 75,75);  
          DefaultListModel<Integer> l3 = new DefaultListModel<>();  
          for(int i=1;i<100;i++){
            l3.addElement(i++);
          } 
          final JList<Integer> list3 = new JList<>(l3);  
          list3.setBounds(100,200, 75,75);
          

          p1.add(list1);
          p2.add(list2);
          p3.add(list3);
          frame.add(p1);
          frame.add(p2);
          frame.add(p3);
          p1.setAlignmentX(Component.RIGHT_ALIGNMENT);
                    p2.setAlignmentX(Component.CENTER_ALIGNMENT);
                              p3.setAlignmentX(Component.LEFT_ALIGNMENT);
                              p1.setPreferredSize(new Dimension(100, 500));
                              p1.setMaximumSize(new Dimension(100, 500));
                              p1.setBorder(BorderFactory.createTitledBorder("Font"));
                              p2.setPreferredSize(new Dimension(100, 500));
      p2.setMaximumSize(new Dimension(100, 500));
      p2.setBorder(BorderFactory.createTitledBorder("Style"));
      p3.setPreferredSize(new Dimension(100, 500));
      p3.setMaximumSize(new Dimension(100, 500));
      p3.setBorder(BorderFactory.createTitledBorder("Size"));
        frame.getContentPane().add(p1);
        frame.getContentPane().add(p2);
        frame.getContentPane().add(p3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);  
        frame.setVisible(true);  
    }
}
