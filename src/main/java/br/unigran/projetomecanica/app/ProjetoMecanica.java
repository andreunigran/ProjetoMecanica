package br.unigran.projetomecanica.app;

import javax.swing.JFrame;
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
        Principal p =new Principal();
            p.setExtendedState(JFrame.MAXIMIZED_BOTH);
            p.setVisible(true);
        /*
        for (UIManager.LookAndFeelInfo l:UIManager.getInstalledLookAndFeels() ) {
            System.out.println(l.getClassName());
        }
        
          }*/
    }   
}
