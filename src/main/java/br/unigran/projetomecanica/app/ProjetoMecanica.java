/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.unigran.projetomecanica.app;

import javax.swing.JFrame;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author andre
 */
public class ProjetoMecanica {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
    
        javax.swing.UIManager.
                setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        
    
        // DAO dao = new DAO();
        Principal p =new Principal();
            p.setExtendedState(JFrame.MAXIMIZED_BOTH);
            p.setVisible(true);
        
        
        for (UIManager.LookAndFeelInfo l:UIManager.getInstalledLookAndFeels() ) {
            System.out.println(l.getClassName());
        }
        
          }
    
}
