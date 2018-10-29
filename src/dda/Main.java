/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dda;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author CHHANNZ
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    
    public Main() {
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
                     
        JFrame frame = new JFrame("algoritma garis dda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        garis grs = new garis(); //menentukan titik awal dan titik akhir
        //titik awal 
        grs.setx1(20);
        grs.sety1(40);
        //titik akhir
        grs.setx2(100);
        grs.sety2(80);
        //selisih x dan y (dx, dy)
        //dx = x2 - x1 = 100 - 20 = 80
        //dy = y2 - y1 = 80 - 40 = 40
        //dx > dy
        grs.setBackground(Color.WHITE);
        frame.add(grs);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
