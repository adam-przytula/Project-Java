package SystemOfEquations;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

class MyPanel extends JPanel {
    private final double Ax1,Bx1,Cx1,Ax2,Bx2,Cx2,x,y;
    private int formatX,formatY;
    public MyPanel(double x,double y,double ax1,double bx1,double cx1,double ax2,double bx2,double cx2){
        setBorder(BorderFactory.createLineBorder(Color.black));
        this.Ax1 = ax1;
        this.Bx1 = bx1;
        this.Cx1 = cx1;
        this.Ax2 = ax2;
        this.Bx2 = bx2;
        this.Cx2 = cx2;
        this.x = x;
        this.y = y;
    }

    public Dimension getPreferredSize() {
        return new Dimension(600,400);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);       
        formatX = getWidth()/2;
        formatY = getHeight()/2;
        //axes XY
        g.drawLine(0, formatY, getWidth(), formatY);
        g.drawLine(formatX, 0, formatX, getHeight());
        g.setColor(Color.GRAY);
        //grid
        for(int i=50; i<Integer.max(formatX,formatY); i+=50){
            g.drawLine(0, (formatY+i), getWidth(), (formatY+i));
            g.drawLine(0, (formatY-i), getWidth(), (formatY-i));
            
            g.drawLine((formatX+i), 0, (formatX+i), getHeight());
            g.drawLine((formatX-i), 0, (formatX-i), getHeight());
        }
        //(X,Y) point of intersection of two straight lines
        g.setColor(Color.red);
        double assistantX = formatX+x*50-4;
        double assistantY = formatY-y*50-4;
        g.fillOval((int)(assistantX), (int)(assistantY), 8, 8);
        
        //cases when AX+0Y=C ->X=C/A
        if(Bx1 == 0){
            g.setColor(Color.MAGENTA);
            for(int j=3; j<getHeight();j+=50){
                g.fillOval((int)assistantX,j-3,6,6);
            }}
        if(Bx2 == 0){
            g.setColor(Color.BLUE);
            for(int j=3; j<getHeight();j+=50){
                g.fillOval((int)assistantX,j-3,6,6);
            }}
        
        //charts
        for(int i=-100; i<=100;i++){
            if(i == 0){i++;}
            assistantX = formatX+(x+0.5*i)*50-3;
            assistantY = (Cx1-Ax1*(x+0.5*i))/Bx1;
            assistantY = formatY-assistantY*50-3;
            g.setColor(Color.MAGENTA);
            g.fillOval((int)assistantX, (int)(assistantY), 6, 6);
            assistantY = formatY-((Cx2-Ax2*(x+0.5*i))/Bx2)*50-3;
            g.setColor(Color.BLUE);
            g.fillOval((int)assistantX, (int)(assistantY), 6, 6);
        }
        g.drawString("Point of intersection is: (" +x+ ", "+y+")", 20, 20);
        g.drawString("(Enlarge if necessary)",20,30);
    }
}

