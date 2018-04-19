/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;
import javax.swing.JFrame;
/**
 *
 * @author Estudiante
 */
public class EjemploPrueba extends JFrame {
    
    public EjemploPrueba(){
        initUI();
    }
    
    private void initUI(){
        add(new Prueba());
        setSize(1000, 550);
        setTitle("Prueba");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        EjemploPrueba ex = new EjemploPrueba();
        ex.setVisible(true);
    }
    
}
