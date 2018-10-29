/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dda;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author CHHANNZ
 */
public class garis extends JPanel {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
   
    
    public int getx1() {
        return x1;
    }
    
    public int getx2() {
        return x2;
    }
    
    public int gety1() {
        return y1;
    }
    
    public int gety2() {
        return y2;
    }
    
    public void setx1(int xa) {
        x1 = xa;
    }
    
    public void setx2(int xb) {
        x2 = xb;
    }
    
    public void sety1(int ya) {
        y1 = ya;
    }
    
    public void sety2(int yb) {
        y2 = yb;
    }
    
       
    public void paint(Graphics g) {
        int dx = x2-x1;
        int dy = y2-y1;
        int steps,k; 

        float x=x1;
        float y=y1;
        float x_inc,y_inc;
        

        super.paint(g);
        this.setBackground(Color.pink);
        g.setColor(Color.blue);

        if(Math.abs(dx)>Math.abs(dy)) steps = Math.abs(dx); 
        //jika dx(80) > dy(40) maka steps = perhitungan dari dx
        else steps = Math.abs(dy); //jika tidak, steps = perhitungan dari dy

        x_inc = dx/(float)steps;//dx = 80 / 80 = 1
        y_inc = dy/(float)steps;//dy = 40 / 80 = 0,5

        g.drawRect(Math.round(x), Math.round(y), 1, 1);
        // k = titik baru
        for(k=0;k<steps;k++) {
            x+=x_inc;//x = x+x_inc
            y+=y_inc;//y = y+y_inc
            g.drawRect(Math.round(x), Math.round(y), 1, 1);
            //perhitungan k=0, step 1
            //x = x + x_inc (1 + 1 = 2)
            //y = y + y_inc (1 + 0,5 = 1,5)
            //pembulatannya (1,2)
            
            //perhitungan k=1, step 2
            //x = x + x_inc (2 + 1 = 3)
            //y = y + y_inc (1,5 + 0,5 = 2)
            //pembulatannya (3,2)
            //seterusnya dan berhenti jika steps = dx
        }   
    }
}