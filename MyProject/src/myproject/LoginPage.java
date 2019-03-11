/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Anushka
 */
import javax.swing.*;
/**
 *
 * @author Anushka
 * void logic()
 */

public class LoginPage {
    //public static void main(String args[]) {
    void logic(){
        new FirstPage().setVisible(false);
        JFrame jf1 = new JFrame();
        JPanel jp1 = new JPanel();
        JMenuBar jb2 = new JMenuBar();
        JMenu jm3 = new JMenu("BLOOD");
        JMenu jm2 = new JMenu("DONAR");
        JMenu jm1 = new JMenu("BUYER");
       // JMenu jm4 = new JMenu("HOME");
        JMenuBar jb1 = new JMenuBar();
        JMenuItem add = new JMenuItem("add");
        JMenuItem update = new JMenuItem("update");
        JMenuItem delete = new JMenuItem("delete");
        JMenuItem search = new JMenuItem("Search");
        JMenuItem qty = new JMenuItem("quantity");
        JMenuItem search1 = new JMenuItem("search");
        JMenuItem req = new JMenuItem("Requirements");
        jf1.add(jp1);
        jp1.add(jb1);
        jp1.add(jb2);
      //  jb1.add(jm4);
        jb2.add(jm2);
        jb2.add(jm1);
        jb2.add(jm3);
        jm2.add(add);
        jm2.add(update);
        jm2.add(delete);
        jm2.add(search);
        jm3.add(qty);
        jm3.add(search1);
        jm3.add(req);
        jf1.setJMenuBar(jb1);
        jf1.setVisible(true);
        jf1.setSize(400,400);
                /* Create and display the form */
        
    }
}
