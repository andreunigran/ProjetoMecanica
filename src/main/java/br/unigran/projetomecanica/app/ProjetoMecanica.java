package br.unigran.projetomecanica.app;

import br.unigran.projetomecanica.app.casosdeuso.Repository;
import br.unigran.projetomecanica.app.models.Cliente;
import br.unigran.projetomecanica.app.models.Usuario;
import br.unigran.projetomecanica.app.splashscreen.SplashScreen;
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
        //    new SplashScreen(null, true).setVisible(true);
         //   Login p =new Login();
         //   p.setVisible(true);
         // new Principal().setVisible(true);
         System.out.println(Repository.listaComParametros(Cliente.class, ""));
            }
        });

        /*
        for (UIManager.LookAndFeelInfo l:UIManager.getInstalledLookAndFeels() ) {
            System.out.println(l.getClassName());
        }
        
          }*/
    }   
}
