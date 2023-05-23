package br.unigran.projetomecanica.app;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatPropertiesLaf;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author andre
 */
public class ProjetoMecanica {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
    
//        javax.swing.UIManager.
//                setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
//            
        //UIManager.setLookAndFeel( new FlatLightLaf() );
            UIManager.setLookAndFeel( new FlatLightLaf() );

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            Principal p =new Principal();
            p.setExtendedState(JFrame.MAXIMIZED_BOTH);
            p.setVisible(true);
            }
        });

        /*
        for (UIManager.LookAndFeelInfo l:UIManager.getInstalledLookAndFeels() ) {
            System.out.println(l.getClassName());
        }
        
          }*/
    }   
}
