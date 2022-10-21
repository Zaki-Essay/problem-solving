package javaInterview;

import javax.swing.*;
import java.awt.*;

public class Program1 {

    public static void main(String[] args){

        //create a new window
        JFrame jFrame = new JFrame("Title");

        //create graphique component
        JLabel jLabel = new JLabel("name : ");
        JTextField jTextField = new JTextField(12);
        JButton jButton = new JButton("OK");

        //define the technique to organize ur UI

        jFrame.setLayout(new FlowLayout());


        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jButton);


        jFrame.setBounds(10,10,400,400);
        jFrame.setVisible(true);

    }
}
