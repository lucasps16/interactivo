/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Estudiante
 */
public class Prueba extends JPanel implements ActionListener {

    //private Rect rectangle;
    private Timer timer;
    private int a;
    private int x;
    private int y;
    private Image tanque;
    private int posicionTanque;
    private int secuencia;
    private int numero ; 
    public Prueba(){
        this.timer = new Timer(20,this);
        this.x = 0;
        this.y = 0;
        this.a = 1000;
        this.numero = 0;
        this.secuencia = 0;
        setFocusable(true);
        
        this.timer.start();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Image fondo = loadImage("fondo.png");
        g.drawImage(fondo, 0, 0, null);
        
        Image tanque = this.loadImage("1.png");
        g.drawImage(tanque,x,230,this);
        g.drawRect(x, 330, 182, 100);
        
        if(this.numero % 10 == 0){  
       if(this.secuencia == 5){
         this.secuencia = 0;
       }else{
         this.secuencia++;
       }
       }
        
        Image gato = this.loadImage("cats.gif");
        g.drawImage(gato, a, 330, 142+a, 410, 132*this.secuencia, 0, 132*(this.secuencia)+132, 80, this);
        g.drawRect(a, 330, 132, 80);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Repaint");
        this.x++;
        this.numero ++;
        this.a --;
        repaint();
    }
    
    public void checkCollision(){
        
    }
    
    public Image loadImage(String imageName){
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
    

   
}
