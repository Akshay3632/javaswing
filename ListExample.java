package javaAssignment;
import javax.swing.*;
import java.awt.event.*;
public class ListExample
{
	ListExample(){
	    JFrame f= new JFrame();
	    final JLabel label= new JLabel();
	    label.setSize(500,100);
	    JButton b = new JButton("show");
	    b.setBounds(200,150,80,30);
	    final DefaultListModel<String> l1=new DefaultListModel<>();
	    l1.addElement("c");
	     l1.addElement("c++");
	      l1.addElement("java");
	       l1.addElement("php");
	       final JList<String>list1=new JList<>(l1);
	       list1.setBounds(100,100,75,75);
	       DefaultListModel<String>l2=new DefaultListModel<>();
	       l2.addElement("turbo c++");
	     l2.addElement("struts");
	      l2.addElement("spring");
	       l2.addElement("yll");
	       final JList<String> list2= new JList<>(l2);
	       list2.setBounds(100,200,75,75);
	       f.add(list1);f.add(list2);f.add(b);f.add(label);
	       f.setSize(450,450);
	       f.setLayout(null);
	       f.setVisible(true);
	       b.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e){
	            String data ="";
	            if(list2.getSelectedIndex()!=-1){
	                data = "programming language selected:"+list1.getSelectedValues();
	                label.setText(data);
	        }
	            if(list2.getSelectedIndex()!=-1){
	                data +=",framework selected:";
	                for(Object frame:list2.getSelectedValues()){
	                    data += frame +" ";
	                }
	            }
	            label.setText(data);
	        }
	       });
	    }
	    public static void main(String[]args){
	        new ListExample();
	    }
	}
